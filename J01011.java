import java.util.Scanner;

public class J01011 {
    //Thuật toán Euclic
    public static long GCD(long a, long b) { 
        while(b != 0) {
            long t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
            System.out.print((a * b) / GCD(a, b) + " ");
            System.out.print(GCD(a, b));
            System.out.println();
        }
    }   
}
