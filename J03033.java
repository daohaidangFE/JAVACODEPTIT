import java.math.BigInteger;
import java.util.Scanner;

public class J03033 {
    public static BigInteger GCD(BigInteger a, BigInteger b) {
        BigInteger k = BigInteger.ZERO;
        while(b != k) {
            BigInteger tmp = b;
            b = a.mod(b);
            a = tmp;
        }   
        return a;
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger res = (a.multiply(b)).divide(GCD(a, b));
            System.out.println(res);
        }
    }
}
