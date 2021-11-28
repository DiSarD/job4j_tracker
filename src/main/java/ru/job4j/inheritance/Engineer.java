package ru.job4j.inheritance;


import java.util.Date;

public class Engineer extends Profession {

    private int rank;

    public Engineer(String name, String surname, String education, Date birthday, int rank) {
        super(name, surname, education, birthday);
        this.rank = rank;
    }

    public Project consult(Customer customer) {
        Project project = new Project();
        return project;
    }
}
