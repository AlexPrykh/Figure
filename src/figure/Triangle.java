package Figure;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Triangle extends AbstractFigure {
    private double a1;
    private double a2;
    private double a3;

    public Triangle(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public double getA1() {
        return a1;
    }

    public void setA1(double a1) {
        this.a1 = a1;
    }

    public double getA2() {
        return a2;
    }

    public void setA2(double a2) {
        this.a2 = a2;
    }

    public double getA3() {
        return a3;
    }

    public void setA3(double a3) {
        this.a3 = a3;
    }

    @Override
    public double area() {
        return Math.sqrt(perimeter() * (perimeter() - a1) * (perimeter() - a2) *
                (perimeter() - a3));
    }

    @Override
    public double perimeter() {
        return a1 + a2 + a3;
    }
}
