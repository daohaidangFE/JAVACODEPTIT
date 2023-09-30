import static java.lang.Math.*;

public class Point {
    private double a;
    private double b;

    public Point() {
        a = 0;
        b = 0;
    }

    public Point(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Point(Point p) {
        this.a = p.a;
        this.b = p.b;
    }
    
    public double getX() {
        return a;
    }

    public double getY() {
        return b;
    }

    double distance(Point p) {
        return sqrt(pow(this.a - p.a, 2) + pow(this.b - p.b, 2));
    }

    double distance(Point x, Point y) {
        return sqrt(pow(x.a - y.a, 2) + pow(x.b - y.b, 2));
    }
    
    public String toString() {
        return a + " " + b;
    }
}
