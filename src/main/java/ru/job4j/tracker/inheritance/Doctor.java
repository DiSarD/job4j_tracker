package ru.job4j.tracker.inheritance;

import java.util.Date;

public class Doctor extends Profession {

    private int experience;

    public Doctor(String name, String surname, String education, Date birthday, int experience) {
        super(name, surname, education, birthday);
        this.experience = experience;
    }

    public Doctor() {

    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnosis = new Diagnosis();
        return diagnosis;
    }
}
