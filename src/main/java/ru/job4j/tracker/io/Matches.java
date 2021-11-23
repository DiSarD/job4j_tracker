package ru.job4j.tracker.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            int matches = -1;
            String player = turn ? "Первый игрок" : "Второй игрок";
            do {
            System.out.println(player
                    + " введите число от 1 до 3 но не меньше оставшегося числа спичек ("
                    + count
                    + "):");
            matches = Integer.parseInt(input.nextLine());
            } while (matches < 0 || matches > 3 || matches > count);
            turn = !turn;
            count -= matches;
            System.out.println("Осталось " + count + " спичек");
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
