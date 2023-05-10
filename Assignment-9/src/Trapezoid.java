public class Trapezoid extends Quadrilateral {
    private double height;

    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double getHeight() {
        if (getpoint1().getY() == getpoint2().getY()) {
            return Math.abs(getpoint2().getY() - getpoint3().getY());
        } else {
            return Math.abs(getpoint1().getY() - getpoint2().getY());
        }
    }

    public double getArea() {
        return getSumOfTwoSides() * getHeight() / 2.0;
    }

    public double getSumOfTwoSides() {
        if (getpoint1().getY() == getpoint2().getY()) {
            return Math.abs(getpoint1().getX() - getpoint2().getX()) + Math.abs(getpoint3().getX() - getpoint4().getX());
        } else {
            return Math.abs(getpoint2().getX() - getpoint3().getX()) + Math.abs(getpoint4().getX() - getpoint1().getX());
        }
    }

    @Override
    public String toString() {
        return String.format("\n%s: \n%s%s: %s\n%s: %s\n", "Coordinates of trapezoid are", getCoordinatesAsString(),
                "Height is ", getHeight(),
                "Area is ", getArea());
    }
}
