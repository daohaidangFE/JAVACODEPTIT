import java.util.Scanner;

public class J03007 {
    public static boolean check(String inp) {
        int n = inp.length() - 1;
        if(inp.charAt(0) != '8' || inp.charAt(n) != '8') {
            return false;
        }
        long sum = 0;
        for(int i = 0; i <= n; i++) {
            if(inp.charAt(i) != inp.charAt(n - i)) {
                return false;
            }
            sum += Long.valueOf(inp.charAt(i) - 48);
        }
        if(sum % 10 != 0) {
            return false;
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
