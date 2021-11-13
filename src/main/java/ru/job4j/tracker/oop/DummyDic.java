package ru.job4j.tracker.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String eng = word.engToRus("Dog");
        System.out.println(eng);
    }
}
