/*
 * This file is generated by jOOQ.
 */
package com.kenvix.studentmanager.orm.tables.records;


import com.kenvix.studentmanager.orm.enums.PersonsSex;
import com.kenvix.studentmanager.orm.enums.PersonsStatus;
import com.kenvix.studentmanager.orm.enums.PersonsType;
import com.kenvix.studentmanager.orm.tables.Persons;
import com.kenvix.studentmanager.orm.tables.interfaces.IPersons;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * View 'student_manager.people_student' references invalid table(s) or column(s) 
 * or function(s) or definer/invoker of view lack rights to use them
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersonsRecord extends UpdatableRecordImpl<PersonsRecord> implements Record7<Long, String, PersonsSex, PersonsType, Byte, PersonsStatus, Long>, IPersons {

    private static final long serialVersionUID = -1104779043;

    /**
     * Setter for <code>persons.id</code>.
     */
    @Override
    public PersonsRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>persons.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>persons.name</code>.
     */
    @Override
    public PersonsRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>persons.name</code>.
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>persons.sex</code>.
     */
    @Override
    public PersonsRecord setSex(PersonsSex value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>persons.sex</code>.
     */
    @Override
    public PersonsSex getSex() {
        return (PersonsSex) get(2);
    }

    /**
     * Setter for <code>persons.type</code>.
     */
    @Override
    public PersonsRecord setType(PersonsType value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>persons.type</code>.
     */
    @Override
    public PersonsType getType() {
        return (PersonsType) get(3);
    }

    /**
     * Setter for <code>persons.is_graduable</code>.
     */
    @Override
    public PersonsRecord setIsGraduable(Byte value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>persons.is_graduable</code>.
     */
    @Override
    public Byte getIsGraduable() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>persons.status</code>.
     */
    @Override
    public PersonsRecord setStatus(PersonsStatus value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>persons.status</code>.
     */
    @Override
    public PersonsStatus getStatus() {
        return (PersonsStatus) get(5);
    }

    /**
     * Setter for <code>persons.clazz</code>.
     */
    @Override
    public PersonsRecord setClazz(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>persons.clazz</code>.
     */
    @Override
    public Long getClazz() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, PersonsSex, PersonsType, Byte, PersonsStatus, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, PersonsSex, PersonsType, Byte, PersonsStatus, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Persons.PERSONS.ID;
    }

    @Override
    public Field<String> field2() {
        return Persons.PERSONS.NAME;
    }

    @Override
    public Field<PersonsSex> field3() {
        return Persons.PERSONS.SEX;
    }

    @Override
    public Field<PersonsType> field4() {
        return Persons.PERSONS.TYPE;
    }

    @Override
    public Field<Byte> field5() {
        return Persons.PERSONS.IS_GRADUABLE;
    }

    @Override
    public Field<PersonsStatus> field6() {
        return Persons.PERSONS.STATUS;
    }

    @Override
    public Field<Long> field7() {
        return Persons.PERSONS.CLAZZ;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public PersonsSex component3() {
        return getSex();
    }

    @Override
    public PersonsType component4() {
        return getType();
    }

    @Override
    public Byte component5() {
        return getIsGraduable();
    }

    @Override
    public PersonsStatus component6() {
        return getStatus();
    }

    @Override
    public Long component7() {
        return getClazz();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public PersonsSex value3() {
        return getSex();
    }

    @Override
    public PersonsType value4() {
        return getType();
    }

    @Override
    public Byte value5() {
        return getIsGraduable();
    }

    @Override
    public PersonsStatus value6() {
        return getStatus();
    }

    @Override
    public Long value7() {
        return getClazz();
    }

    @Override
    public PersonsRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public PersonsRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public PersonsRecord value3(PersonsSex value) {
        setSex(value);
        return this;
    }

    @Override
    public PersonsRecord value4(PersonsType value) {
        setType(value);
        return this;
    }

    @Override
    public PersonsRecord value5(Byte value) {
        setIsGraduable(value);
        return this;
    }

    @Override
    public PersonsRecord value6(PersonsStatus value) {
        setStatus(value);
        return this;
    }

    @Override
    public PersonsRecord value7(Long value) {
        setClazz(value);
        return this;
    }

    @Override
    public PersonsRecord values(Long value1, String value2, PersonsSex value3, PersonsType value4, Byte value5, PersonsStatus value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IPersons from) {
        setId(from.getId());
        setName(from.getName());
        setSex(from.getSex());
        setType(from.getType());
        setIsGraduable(from.getIsGraduable());
        setStatus(from.getStatus());
        setClazz(from.getClazz());
    }

    @Override
    public <E extends IPersons> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PersonsRecord
     */
    public PersonsRecord() {
        super(Persons.PERSONS);
    }

    /**
     * Create a detached, initialised PersonsRecord
     */
    public PersonsRecord(Long id, String name, PersonsSex sex, PersonsType type, Byte isGraduable, PersonsStatus status, Long clazz) {
        super(Persons.PERSONS);

        set(0, id);
        set(1, name);
        set(2, sex);
        set(3, type);
        set(4, isGraduable);
        set(5, status);
        set(6, clazz);
    }
}
