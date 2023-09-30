import java.util.Scanner;



public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c = 1;
        while(t > 0) {
            int n = sc.nextInt();
            // int [] tmp = new int[n + 1];
            System.out.print("Test " + c + ": ");
            int k = 2;
            while (n > 1) {
                if (n % k == 0) {
                    int count = 0;
                    while (n % k == 0) {
                        count++;
                        n /= k;
                    }
                    System.out.printf(k + "(" + count + ") ");

                } else {
                    k += 1;
                }
            }
            System.out.println();
            c++;
            t--;
            }
        }
    }
