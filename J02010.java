import java.util.Scanner;

public class J02010 {
    public static void Sort(int[] f, int n) {
        int count = 1;
        for(int i = 0; i < n - 1; i++) {
            int min = f[i];
            for(int j = i + 1; j < n; j++) {
                if(f[j] < f[i]) {
                    min = f[j];
                    int tmp = f[j];
                    f[j] = f[i];
                    f[i] = tmp;
                }
            }
            System.out.print("Buoc " + count + ": ");
            for(int k = 0; k < n; k++) {
                System.out.print(f[k] + " ");
            }
            count++;
            System.out.println();
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] f = new int[n];
        for(int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        Sort(f, n);
    }
}
