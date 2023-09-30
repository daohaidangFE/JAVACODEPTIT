import java.util.Scanner;

public class J02011 {
    public static void Sort(int [] f, int n) {
        int count = 1;
        for(int i = 0; i < n - 1; i++) {
            int min = f[i];
            int k = i;
            for(int j = i + 1; j < n; j++) {
                if(min > f[j]) {
                    min = f[j];
                    k = j;
                }
            }   
            int tmp = f[i];
            f[i] = f[k];
            f[k] = tmp; 
            System.out.print("Buoc " + count + ": ");
            for(int p = 0; p < n; p++) {
                System.out.print(f[p] + " ");
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
