/*
 * This file is generated by jOOQ.
 */
package com.kenvix.studentmanager.orm.tables;


import com.kenvix.studentmanager.orm.DefaultSchema;
import com.kenvix.studentmanager.orm.Keys;
import com.kenvix.studentmanager.orm.tables.records.ClassesRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Classes extends TableImpl<ClassesRecord> {

    private static final long serialVersionUID = 1165928210;

    /**
     * The reference instance of <code>classes</code>
     */
    public static final Classes CLASSES = new Classes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClassesRecord> getRecordType() {
        return ClassesRecord.class;
    }

    /**
     * The column <code>classes.id</code>.
     */
    public final TableField<ClassesRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>classes.master_id</code>.
     */
    public final TableField<ClassesRecord, Long> MASTER_ID = createField(DSL.name("master_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>classes</code> table reference
     */
    public Classes() {
        this(DSL.name("classes"), null);
    }

    /**
     * Create an aliased <code>classes</code> table reference
     */
    public Classes(String alias) {
        this(DSL.name(alias), CLASSES);
    }

    /**
     * Create an aliased <code>classes</code> table reference
     */
    public Classes(Name alias) {
        this(alias, CLASSES);
    }

    private Classes(Name alias, Table<ClassesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Classes(Name alias, Table<ClassesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Classes(Table<O> child, ForeignKey<O, ClassesRecord> key) {
        super(child, key, CLASSES);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<ClassesRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLASSES;
    }

    @Override
    public UniqueKey<ClassesRecord> getPrimaryKey() {
        return Keys.KEY_CLASSES_PRIMARY;
    }

    @Override
    public List<UniqueKey<ClassesRecord>> getKeys() {
        return Arrays.<UniqueKey<ClassesRecord>>asList(Keys.KEY_CLASSES_PRIMARY);
    }

    @Override
    public Classes as(String alias) {
        return new Classes(DSL.name(alias), this);
    }

    @Override
    public Classes as(Name alias) {
        return new Classes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Classes rename(String name) {
        return new Classes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Classes rename(Name name) {
        return new Classes(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
