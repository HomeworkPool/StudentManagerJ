/*
 * This file is generated by jOOQ.
 */
package com.kenvix.studentmanager.orm.tables;


import com.kenvix.studentmanager.orm.DefaultSchema;
import com.kenvix.studentmanager.orm.Keys;
import com.kenvix.studentmanager.orm.tables.records.CoursesRecord;

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
public class Courses extends TableImpl<CoursesRecord> {

    private static final long serialVersionUID = 520225400;

    /**
     * The reference instance of <code>courses</code>
     */
    public static final Courses COURSES = new Courses();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoursesRecord> getRecordType() {
        return CoursesRecord.class;
    }

    /**
     * The column <code>courses.id</code>.
     */
    public final TableField<CoursesRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>courses.name</code>.
     */
    public final TableField<CoursesRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>courses</code> table reference
     */
    public Courses() {
        this(DSL.name("courses"), null);
    }

    /**
     * Create an aliased <code>courses</code> table reference
     */
    public Courses(String alias) {
        this(DSL.name(alias), COURSES);
    }

    /**
     * Create an aliased <code>courses</code> table reference
     */
    public Courses(Name alias) {
        this(alias, COURSES);
    }

    private Courses(Name alias, Table<CoursesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Courses(Name alias, Table<CoursesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Courses(Table<O> child, ForeignKey<O, CoursesRecord> key) {
        super(child, key, COURSES);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public Identity<CoursesRecord, Long> getIdentity() {
        return Keys.IDENTITY_COURSES;
    }

    @Override
    public UniqueKey<CoursesRecord> getPrimaryKey() {
        return Keys.KEY_COURSES_PRIMARY;
    }

    @Override
    public List<UniqueKey<CoursesRecord>> getKeys() {
        return Arrays.<UniqueKey<CoursesRecord>>asList(Keys.KEY_COURSES_PRIMARY);
    }

    @Override
    public Courses as(String alias) {
        return new Courses(DSL.name(alias), this);
    }

    @Override
    public Courses as(Name alias) {
        return new Courses(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Courses rename(String name) {
        return new Courses(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Courses rename(Name name) {
        return new Courses(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}