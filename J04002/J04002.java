import java.util.Scanner;


public class J04002 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();        
        double y = sc.nextDouble();
        String z = sc.next();
        if(x <= 0 || y <= 0) {
            System.out.println("INVALID");
        } else {
            Rectange p = new Rectange(x, y, z);
            System.out.print((int)p.findPerimeter() + " ");
            System.out.print((int)p.findArea() + " ");
            System.out.println(p.getColor());
        }
    }
}
