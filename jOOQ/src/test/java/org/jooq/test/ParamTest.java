/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.test;

import static java.util.Arrays.asList;
import static java.util.Collections.nCopies;
import static org.jooq.impl.DSL.inline;
import static org.jooq.impl.DSL.param;
import static org.jooq.impl.DSL.val;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.jooq.Param;
import org.jooq.Query;

import org.junit.Test;

/**
 * @author Lukas Eder
 */
public class ParamTest extends AbstractTest {

    @SuppressWarnings("unchecked")
    @Test
    public void testData() {
        Query query = create.select(val(1), inline(2)).where(val(3).ne(inline(4)));
        List<Param<?>> values = new ArrayList<Param<?>>(query.getParams().values());

        assertEquals(asList(val(1), inline(2), val(3), inline(4)), values);
        assertEquals(1, values.get(0).getValue());
        assertEquals(2, values.get(1).getValue());
        assertEquals(3, values.get(2).getValue());
        assertEquals(4, values.get(3).getValue());

        assertFalse(values.get(0).isInline());
        assertTrue(values.get(1).isInline());
        assertFalse(values.get(2).isInline());
        assertTrue(values.get(3).isInline());

        assertEquals(asList(1, 3), query.getBindValues());
    }

    @Test
    public void testNamedBindValues() {
        Query query = create.select(param("a"), param("a")).where(param("b").eq(param("b")));
        assertEquals(nCopies(4, null), query.getBindValues());

        query.bind("a", 1);
        query.bind("b", 2);
        assertEquals(asList(1, 1, 2, 2), query.getBindValues());
    }
}
