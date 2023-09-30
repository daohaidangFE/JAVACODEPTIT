import java.util.Scanner;

public class J02007 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c = 1;
        while(t-- > 0) {
            int n = sc.nextInt();
            int [] f = new int[1000000];
            int [] tx = new int[n];
            for(int i = 0; i < n; i++) {
                tx[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++) {
                f[tx[i]]++;
            }
            System.out.println("Test " + c + ":");
            for(int i = 0; i < n; i++) {
                if(f[tx[i]] > 0) {
                    System.out.println(tx[i] + " xuat hien " + f[tx[i]] + " lan");
                    f[tx[i]] = 0;
                }
            }
            c++;
        }
    }
}
