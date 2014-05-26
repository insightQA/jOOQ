/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2926 extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.T_2926Record> {

	private static final long serialVersionUID = 960196448;

	/**
	 * The singleton instance of <code>test2.t_2926</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.T_2926 T_2926 = new org.jooq.test.mysql2.generatedclasses.tables.T_2926();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.T_2926Record> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.T_2926Record.class;
	}

	/**
	 * The column <code>test2.t_2926.t1</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_2926Record, java.lang.String> T1 = createField("t1", org.jooq.impl.SQLDataType.CLOB.length(255), this, "");

	/**
	 * The column <code>test2.t_2926.t2</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_2926Record, java.lang.String> T2 = createField("t2", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>test2.t_2926.t3</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_2926Record, java.lang.String> T3 = createField("t3", org.jooq.impl.SQLDataType.CLOB.length(16777215), this, "");

	/**
	 * The column <code>test2.t_2926.t4</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.T_2926Record, java.lang.String> T4 = createField("t4", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * Create a <code>test2.t_2926</code> table reference
	 */
	public T_2926() {
		this("t_2926", null);
	}

	/**
	 * Create an aliased <code>test2.t_2926</code> table reference
	 */
	public T_2926(java.lang.String alias) {
		this(alias, org.jooq.test.mysql2.generatedclasses.tables.T_2926.T_2926);
	}

	private T_2926(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql2.generatedclasses.tables.records.T_2926Record> aliased) {
		this(alias, aliased, null);
	}

	private T_2926(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql2.generatedclasses.tables.records.T_2926Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.T_2926 as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.T_2926(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.mysql2.generatedclasses.tables.T_2926 rename(java.lang.String name) {
		return new org.jooq.test.mysql2.generatedclasses.tables.T_2926(name, null);
	}
}