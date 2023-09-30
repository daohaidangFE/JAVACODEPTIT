import java.util.Scanner;

public class J02008 {
    public static final int M = (int)1e6;
    public static long[] f = new long[M+5];
    public static void checkPrime() {
        for(int i = 2; i*i <= M; i++) {
            if(f[i] == 0) {
                for(int j = i*i; j <= M; j +=i) {
                    f[j] = i;
                }
            }
        }
        for(int i = 2; i <= M; i++) {
            if(f[i] == 0) {
                f[i] = i;
            }
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        checkPrime();
        while(t-- > 0) {
            int n = sc.nextInt();
            long res = 1;
            for(int i = 2; i <= n; i++) {
                if(res % i == 0) {
                    continue;
                } else {
                    res *= f[i];
                 }
            }
            System.out.println(res);
        }
    }
}
