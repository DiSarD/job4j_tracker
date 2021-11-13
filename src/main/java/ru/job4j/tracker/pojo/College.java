package ru.job4j.tracker.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setDateIn(new Date());
        student.setGroup(1);
        student.setName("Петров Иван Петрович");
        System.out.println(" ФИО: " + student.getName()
                + ", Группа: " + student.getGroup()
                + ", Дата поступления " + student.getDateIn());
    }
}
