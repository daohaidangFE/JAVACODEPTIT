import java.util.Scanner;


public class J01012 {
    public static long action(long n) {
        if(n % 2 == 1) {
            return 0;
        } else {
            long count = 0;
            for(long i = 1; i <= (long)Math.sqrt(n); i++) {
                if(n % i == 0) {
                    if(i % 2 == 0) {
                        count++;
                    }
                    if((n / i) % 2 == 0 && i != Math.sqrt(n)) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long a = sc.nextLong();
            System.out.println(action(a));
        }
    }
}
