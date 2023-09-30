import java.util.Scanner;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String n = sc.next();
            int check = 1;
            for(int i = 0; i < n.length() - 1; i++) {
                int a = (int)(n.charAt(i));
                int b = (int)(n.charAt(i + 1));
                int c = Math.abs(a - b);
                if(c != 1) {
                    System.out.println("NO");
                    check = 0;
                    break;
                }
            }
            if(check == 1) {
                System.out.println("YES");
            }
        }
    }
}
