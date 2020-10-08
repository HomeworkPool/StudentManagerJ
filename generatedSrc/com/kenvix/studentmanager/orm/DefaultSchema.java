/*
 * This file is generated by jOOQ.
 */
package com.kenvix.studentmanager.orm;


import com.kenvix.studentmanager.orm.tables.ClassCourseMap;
import com.kenvix.studentmanager.orm.tables.Classes;
import com.kenvix.studentmanager.orm.tables.Courses;
import com.kenvix.studentmanager.orm.tables.Papers;
import com.kenvix.studentmanager.orm.tables.PeopleStudent;
import com.kenvix.studentmanager.orm.tables.Persons;
import com.kenvix.studentmanager.orm.tables.StudentClassMap;
import com.kenvix.studentmanager.orm.tables.Students;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 34859943;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>class_course_map</code>.
     */
    public final ClassCourseMap CLASS_COURSE_MAP = ClassCourseMap.CLASS_COURSE_MAP;

    /**
     * The table <code>classes</code>.
     */
    public final Classes CLASSES = Classes.CLASSES;

    /**
     * The table <code>courses</code>.
     */
    public final Courses COURSES = Courses.COURSES;

    /**
     * The table <code>papers</code>.
     */
    public final Papers PAPERS = Papers.PAPERS;

    /**
     * View 'student_manager.people_student' references invalid table(s) or column(s) or function(s) or definer/invoker of view lack rights to use them
     */
    public final PeopleStudent PEOPLE_STUDENT = PeopleStudent.PEOPLE_STUDENT;

    /**
     * View 'student_manager.people_student' references invalid table(s) or column(s) or function(s) or definer/invoker of view lack rights to use them
     */
    public final Persons PERSONS = Persons.PERSONS;

    /**
     * View 'student_manager.people_student' references invalid table(s) or column(s) or function(s) or definer/invoker of view lack rights to use them
     */
    public final StudentClassMap STUDENT_CLASS_MAP = StudentClassMap.STUDENT_CLASS_MAP;

    /**
     * View 'student_manager.people_student' references invalid table(s) or column(s) or function(s) or definer/invoker of view lack rights to use them
     */
    public final Students STUDENTS = Students.STUDENTS;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            ClassCourseMap.CLASS_COURSE_MAP,
            Classes.CLASSES,
            Courses.COURSES,
            Papers.PAPERS,
            PeopleStudent.PEOPLE_STUDENT,
            Persons.PERSONS,
            StudentClassMap.STUDENT_CLASS_MAP,
            Students.STUDENTS);
    }
}
