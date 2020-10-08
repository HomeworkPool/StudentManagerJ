/*
 * This file is generated by jOOQ.
 */
package com.kenvix.studentmanager.orm.tables.records;


import com.kenvix.studentmanager.orm.tables.ClassCourseMap;
import com.kenvix.studentmanager.orm.tables.interfaces.IClassCourseMap;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ClassCourseMapRecord extends UpdatableRecordImpl<ClassCourseMapRecord> implements Record3<Long, Long, Long>, IClassCourseMap {

    private static final long serialVersionUID = 1769400874;

    /**
     * Setter for <code>class_course_map.id</code>.
     */
    @Override
    public ClassCourseMapRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>class_course_map.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>class_course_map.class_id</code>.
     */
    @Override
    public ClassCourseMapRecord setClassId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>class_course_map.class_id</code>.
     */
    @Override
    public Long getClassId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>class_course_map.course_id</code>.
     */
    @Override
    public ClassCourseMapRecord setCourseId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>class_course_map.course_id</code>.
     */
    @Override
    public Long getCourseId() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ClassCourseMap.CLASS_COURSE_MAP.ID;
    }

    @Override
    public Field<Long> field2() {
        return ClassCourseMap.CLASS_COURSE_MAP.CLASS_ID;
    }

    @Override
    public Field<Long> field3() {
        return ClassCourseMap.CLASS_COURSE_MAP.COURSE_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getClassId();
    }

    @Override
    public Long component3() {
        return getCourseId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getClassId();
    }

    @Override
    public Long value3() {
        return getCourseId();
    }

    @Override
    public ClassCourseMapRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public ClassCourseMapRecord value2(Long value) {
        setClassId(value);
        return this;
    }

    @Override
    public ClassCourseMapRecord value3(Long value) {
        setCourseId(value);
        return this;
    }

    @Override
    public ClassCourseMapRecord values(Long value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IClassCourseMap from) {
        setId(from.getId());
        setClassId(from.getClassId());
        setCourseId(from.getCourseId());
    }

    @Override
    public <E extends IClassCourseMap> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ClassCourseMapRecord
     */
    public ClassCourseMapRecord() {
        super(ClassCourseMap.CLASS_COURSE_MAP);
    }

    /**
     * Create a detached, initialised ClassCourseMapRecord
     */
    public ClassCourseMapRecord(Long id, Long classId, Long courseId) {
        super(ClassCourseMap.CLASS_COURSE_MAP);

        set(0, id);
        set(1, classId);
        set(2, courseId);
    }
}
