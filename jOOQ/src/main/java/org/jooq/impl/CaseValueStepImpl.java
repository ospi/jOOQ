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
package org.jooq.impl;

import org.jooq.CaseValueStep;
import org.jooq.CaseWhenStep;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Select;

/**
 * @author Lukas Eder
 */
class CaseValueStepImpl<V> implements CaseValueStep<V> {

    private final Field<V> value;

    CaseValueStepImpl(Field<V> value) {
        this.value = value;
    }

    @Override
    public final <T> CaseWhenStep<V, T> when(V compareValue, T result) {
        return when(Utils.field(compareValue), Utils.field(result));
    }

    @Override
    public final <T> CaseWhenStep<V, T> when(V compareValue, Field<T> result) {
        return when(Utils.field(compareValue), result);
    }

    @Override
    public final <T> CaseWhenStep<V, T> when(V compareValue, Select<? extends Record1<T>> result) {
        return when(Utils.field(compareValue), DSL.field(result));
    }

    @Override
    public final <T> CaseWhenStep<V, T> when(Field<V> compareValue, T result) {
        return when(compareValue, Utils.field(result));
    }

    @Override
    public final <T> CaseWhenStep<V, T> when(Field<V> compareValue, Field<T> result) {
        return new CaseWhenStepImpl<V, T>(value, compareValue, result);
    }

    @Override
    public final <T> CaseWhenStep<V, T> when(Field<V> compareValue, Select<? extends Record1<T>> result) {
        return when(compareValue, DSL.field(result));
    }
}
