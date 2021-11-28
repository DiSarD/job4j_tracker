package ru.job4j.tracker.poly;

public interface Transport {
    void go();

    void passenger(int number);

    double refuel(int volume);
}
