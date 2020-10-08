/*
 * This file is generated by jOOQ.
 */
package com.kenvix.studentmanager.orm.tables;


import com.kenvix.studentmanager.orm.DefaultSchema;
import com.kenvix.studentmanager.orm.Indexes;
import com.kenvix.studentmanager.orm.Keys;
import com.kenvix.studentmanager.orm.tables.records.ClassCourseMapRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class ClassCourseMap extends TableImpl<ClassCourseMapRecord> {

    private static final long serialVersionUID = 463080515;

    /**
     * The reference instance of <code>class_course_map</code>
     */
    public static final ClassCourseMap CLASS_COURSE_MAP = new ClassCourseMap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ClassCourseMapRecord> getRecordType() {
        return ClassCourseMapRecord.class;
    }

    /**
     * The column <code>class_course_map.id</code>.
     */
    public final TableField<ClassCourseMapRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>class_course_map.class_id</code>.
     */
    public final TableField<ClassCourseMapRecord, Long> CLASS_ID = createField(DSL.name("class_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>class_course_map.course_id</code>.
     */
    public final TableField<ClassCourseMapRecord, Long> COURSE_ID = createField(DSL.name("course_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>class_course_map</code> table reference
     */
    public ClassCourseMap() {
        this(DSL.name("class_course_map"), null);
    }

    /**
     * Create an aliased <code>class_course_map</code> table reference
     */
    public ClassCourseMap(String alias) {
        this(DSL.name(alias), CLASS_COURSE_MAP);
    }

    /**
     * Create an aliased <code>class_course_map</code> table reference
     */
    public ClassCourseMap(Name alias) {
        this(alias, CLASS_COURSE_MAP);
    }

    private ClassCourseMap(Name alias, Table<ClassCourseMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private ClassCourseMap(Name alias, Table<ClassCourseMapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> ClassCourseMap(Table<O> child, ForeignKey<O, ClassCourseMapRecord> key) {
        super(child, key, CLASS_COURSE_MAP);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CLASS_COURSE_MAP_BY_CLASS_ID);
    }

    @Override
    public Identity<ClassCourseMapRecord, Long> getIdentity() {
        return Keys.IDENTITY_CLASS_COURSE_MAP;
    }

    @Override
    public UniqueKey<ClassCourseMapRecord> getPrimaryKey() {
        return Keys.KEY_CLASS_COURSE_MAP_PRIMARY;
    }

    @Override
    public List<UniqueKey<ClassCourseMapRecord>> getKeys() {
        return Arrays.<UniqueKey<ClassCourseMapRecord>>asList(Keys.KEY_CLASS_COURSE_MAP_PRIMARY);
    }

    @Override
    public ClassCourseMap as(String alias) {
        return new ClassCourseMap(DSL.name(alias), this);
    }

    @Override
    public ClassCourseMap as(Name alias) {
        return new ClassCourseMap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ClassCourseMap rename(String name) {
        return new ClassCourseMap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ClassCourseMap rename(Name name) {
        return new ClassCourseMap(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
