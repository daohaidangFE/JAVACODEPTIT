import java.util.Scanner;

public class J02004 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int k = sc.nextInt();
            int [] a = new int[k];
            for(int i = 0; i < k; i++) {
                a[i] = sc.nextInt();
            }
            int check = 1;
            for(int i = 0; i <= k / 2; i++) {
                if(a[i] != a[k - i - 1]) {
                    System.out.println("NO");
                    check = 0;
                    break;
                }
            }
            if(check == 1) {
                System.out.println("YES");
            }
        }
    }
}
