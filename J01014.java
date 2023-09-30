import java.util.Scanner;

public class J01014 {
    public static boolean isPrime(long n) {
        if(n <= 1) {
            return false;
        } else {
            for(long i = 2; i <= Math.sqrt(n); i++) {
                if( n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            long res = 0;
            if(isPrime(n)) {
                res = n;
            } else {
                for(long i = 2; i <= Math.sqrt(n); i++) {
                    if(n % i == 0) {
                        if(isPrime(i)) {
                            res = i;
                        }
                        if(isPrime(n / i)) {
                            res = n / i;
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }
}
