package constructor;

public class Circle {
    // radius, getArea, getCircumference
    private int radius;
    final double PIE = 3.14;

    public Circle (int radius) {
        this.radius = radius;
    }

    public double getArea () {
        return PIE * (radius * radius);
    }

    public double getCircumference() {
        return 2 * PIE * radius;
    }
}
