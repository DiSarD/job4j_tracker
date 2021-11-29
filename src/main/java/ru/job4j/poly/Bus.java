package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Автобус едет в Казань");
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
