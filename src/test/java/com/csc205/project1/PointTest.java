package com.csc205.project1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*Create a test class for the class point you just created to ensure its functionality. Be sure to include common edge cases in your tests*/
public class PointTest {

    @Test
    public void testConstructor() {
        Point p = new Point(3.5, -2.7);
        assertEquals(3.5, p.getX(), 0.001);
        assertEquals(-2.7, p.getY(), 0.001);
    }

    @Test
    public void testSettersAndGetters() {
        Point p = new Point(0, 0);
        p.setX(4.2);
        p.setY(-1.8);
        assertEquals(4.2, p.getX(), 0.001);
        assertEquals(-1.8, p.getY(), 0.001);
    }

    @Test
    public void testSetPoint() {
        Point p = new Point(1, 2);
        p.setPoint(5, -3);
        assertEquals(5, p.getX(), 0.001);
        assertEquals(-3, p.getY(), 0.001);
    }

    @Test
    public void testShift() {
        Point p = new Point(2, 3);
        p.shiftX(5);
        p.shiftY(-1);
        assertEquals(7, p.getX(), 0.001);
        assertEquals(2, p.getY(), 0.001);
    }

    @Test
    public void testDistance() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        assertEquals(5.0, p1.distance(p2), 0.001);
    }

    @Test
    public void testRotation() {
        Point p = new Point(1, 0);
        p.rotate(Math.PI / 2);
        assertEquals(0, p.getX(), 0.001);
        assertEquals(1, p.getY(), 0.001);
    }

    @Test
    public void testToString() {
        Point p = new Point(2.5, -1.7);
        assertEquals("(2.5, -1.7)", p.toString());
    }

    // Additional edge case tests
    @Test
    public void testZeroDistance() {
        Point p = new Point(1, 2);
        assertEquals(0.0, p.distance(p), 0.001);
    }

    @Test
    public void testNegativeCoordinates() {
        Point p1 = new Point(-3, -4);
        Point p2 = new Point(1, 2);
        assertEquals(7.211102550927978, p1.distance(p2), 0.001);
    }

    @Test
    public void testLargeNumbers() {
        Point p1 = new Point(1000000, 2000000);
        Point p2 = new Point(-500000, -800000);
        assertEquals(3176476.0348537182, p1.distance(p2), 0.001);
    }

    // ... Add more tests as needed
}