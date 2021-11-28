package ru.job4j.oop;

public class Ship implements Vehicle {
    @Override
    public void move() {
        System.out.println("Корабль плывет");
    }
}
