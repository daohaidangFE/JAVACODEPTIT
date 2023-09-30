import java.util.Scanner;

public class J01013 {
    public static final int n = (int)2e6;
    public static int[] f = new int[n+5];
    public static void isPrime() {
        for(int i = 2; i*i <= n; i++) {
            if(f[i] == 0) {
                for(int j = i*i; j <= n; j+=i) {
                    if(f[j] == 0) {
                        f[j] = i;
                    }
                }
            }
        }
        for(int i = 2; i <= n; i++) {
            if(f[i] == 0) {
                f[i] = i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            long res = 0;
            isPrime();
            while(t-- > 0) {
                int n = sc.nextInt();
                while(n != 1) {
                    res += f[n];
                    n /= f[n];
                }
            }
            System.out.println(res);
    }
}
