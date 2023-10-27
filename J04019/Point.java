package J04019;

import java.util.Scanner;

public class Point {
    public double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Point nextPoint(Scanner sc) {
        double nextX = sc.nextDouble();
        double nextY = sc.nextDouble();
        return new Point(nextX, nextY);
    }


}
