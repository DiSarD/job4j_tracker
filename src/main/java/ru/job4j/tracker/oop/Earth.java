package ru.job4j.tracker.oop;

public class Earth {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle plane = new Plane();
        Vehicle ship = new Ship();

        Vehicle[] vehicles = new Vehicle[] {train, plane, ship};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
