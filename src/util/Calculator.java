package util;

public class Calculator {
    public final double PI = 3.14159;

    // C = 2πr (2 times pi times the radius)
    public double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    // V = (4/3)πr³ -> for spheres
    public double volume(double radius) {
        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
    }
}