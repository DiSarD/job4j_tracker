package ru.job4j.oop;

import org.junit.Test;
import ru.job4j.oop.Max;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax1To3To2Then3() {
        int first = 1;
        int second = 3;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 3;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax1To3To5To4Then5() {
        int first = 1;
        int second = 3;
        int third = 5;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        assertEquals(result, expected);
    }
}