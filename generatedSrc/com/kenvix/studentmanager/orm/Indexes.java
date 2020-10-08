/*
 * This file is generated by jOOQ.
 */
package com.kenvix.studentmanager.orm;


import com.kenvix.studentmanager.orm.tables.ClassCourseMap;
import com.kenvix.studentmanager.orm.tables.Papers;
import com.kenvix.studentmanager.orm.tables.Persons;
import com.kenvix.studentmanager.orm.tables.StudentClassMap;

import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code></code> schema.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CLASS_COURSE_MAP_BY_CLASS_ID = Indexes0.CLASS_COURSE_MAP_BY_CLASS_ID;
    public static final Index PAPERS_BY_PERSON_ID = Indexes0.PAPERS_BY_PERSON_ID;
    public static final Index PERSONS_BY_NAME = Indexes0.PERSONS_BY_NAME;
    public static final Index PERSONS_BY_TYPE = Indexes0.PERSONS_BY_TYPE;
    public static final Index STUDENT_CLASS_MAP_BY_CLASS_ID = Indexes0.STUDENT_CLASS_MAP_BY_CLASS_ID;
    public static final Index STUDENT_CLASS_MAP_BY_STUDENT_ID = Indexes0.STUDENT_CLASS_MAP_BY_STUDENT_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CLASS_COURSE_MAP_BY_CLASS_ID = Internal.createIndex("by_class_id", ClassCourseMap.CLASS_COURSE_MAP, new OrderField[] { ClassCourseMap.CLASS_COURSE_MAP.CLASS_ID }, false);
        public static Index PAPERS_BY_PERSON_ID = Internal.createIndex("by_person_id", Papers.PAPERS, new OrderField[] { Papers.PAPERS.PERSON_ID }, false);
        public static Index PERSONS_BY_NAME = Internal.createIndex("by_name", Persons.PERSONS, new OrderField[] { Persons.PERSONS.NAME }, false);
        public static Index PERSONS_BY_TYPE = Internal.createIndex("by_type", Persons.PERSONS, new OrderField[] { Persons.PERSONS.TYPE }, false);
        public static Index STUDENT_CLASS_MAP_BY_CLASS_ID = Internal.createIndex("by_class_id", StudentClassMap.STUDENT_CLASS_MAP, new OrderField[] { StudentClassMap.STUDENT_CLASS_MAP.CLASS_ID }, false);
        public static Index STUDENT_CLASS_MAP_BY_STUDENT_ID = Internal.createIndex("by_student_id", StudentClassMap.STUDENT_CLASS_MAP, new OrderField[] { StudentClassMap.STUDENT_CLASS_MAP.STUDENT_ID }, false);
    }
}
