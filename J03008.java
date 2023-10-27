import java.util.Scanner;

public class J03008 {
    public static boolean isPrimeFake(char s) {
        if(s == '2' || s == '3' || s == '5' || s == '7') {
            return true;
        }
        return false;
    }

    public static boolean check(String inp) {
        int n = inp.length() - 1;
        for(int i = 0; i <= n; i++) {
            if(inp.charAt(i) != inp.charAt(n - i)) {
                return false;
            }
            if(!isPrimeFake(inp.charAt(i))) {
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
