import java.util.Scanner;

public class J03006 {
    public static boolean check(String inp) {
        int n = inp.length() - 1;
        for(int i = 0; i <= n; i++) {
            if(inp.charAt(i) != inp.charAt(n - i)) {
                return false;
            }
            if(Integer.valueOf(inp.charAt(i)) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String inp = sc.next();
            if(check(inp)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
