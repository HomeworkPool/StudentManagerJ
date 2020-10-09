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

import javax.annotation.processing.Generated;


/**
 * Convenience access to all tables in 
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>class_course_map</code>.
     */
    public static final ClassCourseMap CLASS_COURSE_MAP = ClassCourseMap.CLASS_COURSE_MAP;

    /**
     * The table <code>classes</code>.
     */
    public static final Classes CLASSES = Classes.CLASSES;

    /**
     * The table <code>courses</code>.
     */
    public static final Courses COURSES = Courses.COURSES;

    /**
     * The table <code>papers</code>.
     */
    public static final Papers PAPERS = Papers.PAPERS;

    /**
     * View 'student_manager.people_student' references invalid table(s) or column(s) or function(s) or definer/invoker of view lack rights to use them
     */
    public static final PeopleStudent PEOPLE_STUDENT = PeopleStudent.PEOPLE_STUDENT;

    /**
     * View 'student_manager.people_student' references invalid table(s) or column(s) or function(s) or definer/invoker of view lack rights to use them
     */
    public static final Persons PERSONS = Persons.PERSONS;
}
