package ru.job4j.tracker.inheritance;

import java.util.Date;

public class Dentist extends Doctor {

    private boolean isCanRemoveTooth;

    public Dentist(String name,
                   String surname,
                   String education,
                   Date birthday,
                   int experience,
                   boolean isCanRemoveTooth) {
        super(name, surname, education, birthday, experience);
        this.isCanRemoveTooth = isCanRemoveTooth;
    }

    public boolean removeTooth(Pacient pacient) {
        return false;
    }
}
