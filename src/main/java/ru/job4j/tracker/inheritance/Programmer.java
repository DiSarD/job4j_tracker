package ru.job4j.tracker.inheritance;

import java.util.Date;

public class Programmer extends Engineer {

    private String language;

    public Programmer(String name,
                      String surname,
                      String education,
                      Date birthday,
                      int rank,
                      String language) {
        super(name, surname, education, birthday, rank);
        this.language = language;
    }

    public Program programing(Project project) {
        Program program = new Program();
        return program;
    }
}
