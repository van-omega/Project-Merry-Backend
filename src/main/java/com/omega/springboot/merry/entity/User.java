package com.omega.springboot.merry.entity;


import com.omega.springboot.merry.constants.SexCategoryEnum;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String middleName;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private SexCategoryEnum sex;
    private String email;
    private int age;

    public User(){

    }

    public User(String firstName, String lastName, String email, String middleName, String phoneNumber, SexCategoryEnum sex, int age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SexCategoryEnum getSex() {
        return sex;
    }

    public void setSex(SexCategoryEnum sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
