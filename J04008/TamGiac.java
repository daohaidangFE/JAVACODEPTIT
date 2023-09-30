package J04008;

import java.text.DecimalFormat;

public class TamGiac {
    private Point a;
    private Point b;
    private Point c;

    public TamGiac() {

    }

    public TamGiac(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void findPerimeter() {
        double canhA = a.disTance(b);
        double canhB = b.disTance(c);
        double canhC = c.disTance(a);
        if(canhA != 0 && canhB != 0 && canhC != 0) {
            if(canhA + canhB - canhC <= 0 || canhA + canhC - canhB <= 0 || canhB + canhC - canhA <= 0) {
                System.out.print("INVALID");
            } else {
                double Per = canhA + canhB + canhC;
                DecimalFormat df = new DecimalFormat("#.###");
                double Res = Double.parseDouble(df.format(Per));
                System.out.print(Res);
            }
        } else {
            System.out.print("INVALID");
        }
        System.out.println();
    }
}
