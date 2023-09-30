import java.util.Scanner;

public class J02013 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 1;
        boolean check;
        for(int i = 0; i < n; i++) {
            check = false;
            for(int j = 0; j < n - 1; j++) {
                if(a[j] > a[j + 1] ) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    check = true;
                }
            }
            if(!check) {
                break;
            }
            System.out.print("Buoc " + count + ": ");
            for(int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println();
            count++;
        }
        
    }
}
