package ru.job4j.tracker.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int b) {
        return b - x;
    }

    public int divide(int c) {
        return c / x;
    }

    public int sumAllOperation(int n) {
        return this.multiply(n) + this.divide(n) + minus(n) + sum(n);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = sum(10);
        System.out.println("Результат метода sum(10) " + result);
        result = calculator.multiply(5);
        System.out.println("Результат метода calculator.multiply(5) " + result);
        result = calculator.divide(10);
        System.out.println("Результат метода calculator.divide(10) " + result);
        result = minus(10);
        System.out.println("Результат метода minus(10) " + result);
        result = calculator.sumAllOperation(10);
        System.out.println("Результат метода calculator.sumAllOperation(10) " + result);
    }
}
