import java.util.Scanner;

public class J02012 {
    public static void Sort(int[] f, int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] f = new int[n];
        for(int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
    }
}
