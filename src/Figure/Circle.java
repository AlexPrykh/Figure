package Figure;

public class Circle extends AbstractFigure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * (r * r);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
