package Figure;

public abstract class AbstractFigure implements Figure, Comparable<Figure> {
    @Override
    public int compareTo(Figure figure) {
        double areaDifference = this.area() - figure.area();
        double perimeterDifference = this.perimeter() - figure.perimeter();
        if (areaDifference < 0) {
            return -1;
        } else if (areaDifference > 0) {
            return 1;

        } else if (perimeterDifference < 0) {
            return -1;
        } else if (perimeterDifference > 0) {
            return 1;
        }
        return 0;
    }
}
