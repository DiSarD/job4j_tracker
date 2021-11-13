package ru.job4j.tracker.inheritance;

import java.util.Date;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private Date birthday;

    public Profession() {

    }

    public Profession(String name, String surname, String education, Date birthday) {
        this.birthday = birthday;
        this.education = education;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEducation() {
        return this.education;
    }

    public Date getBirthday() {
        return this.birthday;
    }
}
