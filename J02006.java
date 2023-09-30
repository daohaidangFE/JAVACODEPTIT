import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class J02006 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Set<Integer> res = new TreeSet<>();
        for(int i = 0; i < a; i++) {
            int x = sc.nextInt();
            res.add(x);
        }
        for(int i = 0; i < b; i++) {
            int y = sc.nextInt();
            res.add(y);
        }
        for(int i: res) {
            System.out.print(i + " ");
        }
    }
}
