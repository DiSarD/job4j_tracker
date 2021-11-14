package ru.job4j.tracker.inheritance;

import java.util.Date;

public class Surgeon extends Doctor {

    private boolean isCanOperateChild;

    public Surgeon(String name,
                   String surname,
                   String education,
                   Date birthday,
                   int experience,
                   boolean isCanOperateChild) {
        super(name, surname, education, birthday, experience);
        this.isCanOperateChild = isCanOperateChild;
    }

    public void doSurgery(Pacient pacient) {
    }
}
