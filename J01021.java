import java.util.Scanner;


public class J01021 {
    public static final long M = 1000000000 + 7;
    public static long fact(long a, long b) {
        if(b == 1) {
            return a;
        }
        long c = fact(a, b/2);
        if(b % 2 == 0) {
            return ((c%M)*(c%M))%M;
        }
        return (((c % M) * (c % M)) % M * (a % M)) %M;
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        long a = -1;
        long b = -1;
        while(true) {
            a = sc.nextLong();
            b = sc.nextLong();
            if (a == 0 && b == 0) {
                return;
            }
            if(a != 0 && b != 0) {
                System.out.println(fact(a, b)%M);
            }
            if((a == 0 && b != 0)) {
                System.out.println(fact(a, b)%M);
            }
            if(a != 0 && b == 0) {
                System.out.println("1");
            }
        }
    }
}