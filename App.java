import java.util.Scanner;


public class App {
    // learn java
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int n = sc.nextInt();
            double h = sc.nextDouble();
            for(double i = 1; i < n; i++) {
                System.out.printf("%.6f",(Math.sqrt(i/n)*h));
                System.out.print(" ");
            }
            System.out.print("\n");
            t--;
        }
    }
}
