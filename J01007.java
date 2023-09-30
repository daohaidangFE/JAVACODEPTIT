import java.util.Arrays;
import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        long [] F = new long[93];
        F[1] = 1;
        F[2] = 1;
        for(int i = 3; i <= 92; i++) {
            F[i] = F[i-1] + F[i-2];
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            long n = sc.nextLong();
            boolean found = Arrays.stream(F).anyMatch(x -> x == n); // tìm 1 phần tử trong 1 mảng số
            if(found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}