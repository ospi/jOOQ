/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Triggers extends org.jooq.impl.TableImpl<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord> {

	private static final long serialVersionUID = 1296645339;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.TRIGGERS</code>
	 */
	public static final org.jooq.example.gradle.db.information_schema.tables.Triggers TRIGGERS = new org.jooq.example.gradle.db.information_schema.tables.Triggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord> getRecordType() {
		return org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.String> TRIGGER_CATALOG = createField("TRIGGER_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.String> TRIGGER_SCHEMA = createField("TRIGGER_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.String> TRIGGER_NAME = createField("TRIGGER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TRIGGER_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.String> TRIGGER_TYPE = createField("TRIGGER_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_CATALOG</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.String> TABLE_CATALOG = createField("TABLE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_SCHEMA</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.String> TABLE_SCHEMA = createField("TABLE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.BEFORE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.Boolean> BEFORE = createField("BEFORE", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.JAVA_CLASS</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.String> JAVA_CLASS = createField("JAVA_CLASS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.QUEUE_SIZE</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.Integer> QUEUE_SIZE = createField("QUEUE_SIZE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.NO_WAIT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.Boolean> NO_WAIT = createField("NO_WAIT", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.REMARKS</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.SQL</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.String> SQL = createField("SQL", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.TRIGGERS.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.TRIGGERS</code> table reference
	 */
	public Triggers() {
		this("TRIGGERS", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.TRIGGERS</code> table reference
	 */
	public Triggers(java.lang.String alias) {
		this(alias, org.jooq.example.gradle.db.information_schema.tables.Triggers.TRIGGERS);
	}

	private Triggers(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Triggers(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.TriggersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.gradle.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.gradle.db.information_schema.tables.Triggers as(java.lang.String alias) {
		return new org.jooq.example.gradle.db.information_schema.tables.Triggers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.gradle.db.information_schema.tables.Triggers rename(java.lang.String name) {
		return new org.jooq.example.gradle.db.information_schema.tables.Triggers(name, null);
	}
}
