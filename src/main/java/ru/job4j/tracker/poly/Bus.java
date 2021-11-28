package ru.job4j.tracker.poly;

public class Bus implements Transport {
    @Override
    public void go() {
    }

    @Override
    public void passenger(int number) {
        System.out.println("В автобусе " + number + " пассажиров");
    }

    @Override
    public double refuel(int volume) {
        return volume * 54;
    }
}
