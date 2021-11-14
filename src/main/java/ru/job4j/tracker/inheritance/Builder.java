package ru.job4j.tracker.inheritance;

import java.util.Date;

public class Builder extends Engineer {

    private boolean isCanBuildSkyscraper;

    public Builder(String name,
                   String surname,
                   String education,
                   Date birthday,
                   int rank,
                   boolean isCanBuildSkyscraper) {
        super(name, surname, education, birthday, rank);
        this.isCanBuildSkyscraper = isCanBuildSkyscraper;
    }

    public Bulding develop(Project project) {
        Bulding bulding = new Bulding();
        return bulding;
    }
}
