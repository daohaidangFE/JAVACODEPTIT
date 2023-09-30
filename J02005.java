import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class J02005 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int [] a = new int[x];
        int [] b = new int[y];
        Set<Integer> List1 = new TreeSet<>();
        Set<Integer> List2 = new TreeSet<>();
        for(int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
            List1.add(a[i]);
        }
        for(int i = 0; i < y; i++) {
            b[i] = sc.nextInt();
            List2.add(b[i]);
        }
        List1.retainAll(List2);
        for(int i: List1) {
            System.out.print(i + " ");
        }
    }
}
