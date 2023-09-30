import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long K = 0;
        for(int i = 1; i <= n; i++) {
            K += factorial(i);
        }
        System.out.println(K);
    }
    public static long factorial (int n) {
        long S = 1;
        for(int i = 1; i <= n; i++) {
            S *= i;
        }
        return S;
    }
}
