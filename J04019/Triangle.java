package J04019;

import java.text.DecimalFormat;

public class Triangle {
    private Point a, b, c;
    private double ab, bc, ac;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double ABX = a.x - b.x;
        double ABY = a.y - b.y;
        double BCX = b.x - c.x;
        double BCY = b.y - c.y;
        double ACX = a.x - c.x;
        double ACY = a.y - c.y;
        this.ab = Math.sqrt((ABX)*(ABX) + (ABY)*(ABY));
        this.bc = Math.sqrt((BCX)*(BCX) + (BCY)*(BCY));
        this.ac = Math.sqrt((ACX)*(ACX) + (ACY)*(ACY));
    }

    public boolean valid() {
        if(ab + bc <= ac || ab + ac <= bc || ac + bc <= ab) {
            return false;
        }
        if(a == b || a == c || b == c) {
            return false;
        }
        return true;
    }

    public String getPerimeter() {
        double Per = ab + bc + ac;
        DecimalFormat df = new DecimalFormat("0.000");
        String res = df.format(Per);
        return res;
    }

}
