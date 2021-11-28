package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public void printError() {
        System.out.println(this.active);
        System.out.println(this.status);
        System.out.println(this.message);
    }

    public static void main(String[] args) {
        Error errorOne = new Error();
        Error errorOTwo = new Error(true, 1, "Error");
        Error errorOThree = new Error(false, 2, "Warning");
        Error errorOFour = new Error(true, 3, "Error");
        errorOne.printError();
        errorOTwo.printError();
        errorOThree.printError();
        errorOFour.printError();

    }
}
