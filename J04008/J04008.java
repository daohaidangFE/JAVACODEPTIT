package J04008;

import java.util.Scanner;

public class J04008 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            double x, y;  
                      
            x = sc.nextDouble();            
            y = sc.nextDouble();
            Point a = new Point(x, y);

            x = sc.nextDouble();
            y = sc.nextDouble();
            Point b = new Point(x, y);

            x = sc.nextDouble();
            y = sc.nextDouble();
            Point c = new Point(x, y);

            TamGiac tg = new TamGiac(a, b, c);
            tg.findPerimeter();
        }
    }
}
