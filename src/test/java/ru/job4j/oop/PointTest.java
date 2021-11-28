package ru.job4j.oop;

import org.junit.Test;
import ru.job4j.oop.Point;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenPoint040To400Then4Sqrt2() {
        Point pointA = new Point(0, 4, 0);
        Point pointB = new Point(4, 0, 0);
        double result = pointA.distance3d(pointB);
        Double expected = 4 * Math.sqrt(2);
        assertThat(result, closeTo(expected, 0.001));
    }

    @Test
    public void whenPoint000To444Then4Sqrt3() {
        Point pointA = new Point(0, 0, 0);
        Point pointB = new Point(4, 4, 4);
        double result = pointA.distance3d(pointB);
        Double expected = 4 * Math.sqrt(3);
        assertThat(result, closeTo(expected, 0.001));
    }
}