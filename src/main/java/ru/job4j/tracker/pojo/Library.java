package ru.job4j.tracker.pojo;

public class Library {

    private static void printArray(Book[] bookArray) {
        for (int i = 0; i < bookArray.length; i++) {
            Book book = bookArray[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", 1000);
        Book book2 = new Book("Metro 2033", 1500);
        Book book3 = new Book("Clean code", 1000);
        Book book4 = new Book("War and Peace", 10000);
        Book[] bookArray = new Book[4];
        bookArray[0] = book1;
        bookArray[1] = book2;
        bookArray[2] = book3;
        bookArray[3] = book4;
        printArray(bookArray);
        Book tempBook = bookArray[0];
        bookArray[0] = bookArray[3];
        bookArray[3] = tempBook;
        printArray(bookArray);
        for (int i = 0; i < bookArray.length; i++) {
            Book book = bookArray[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
