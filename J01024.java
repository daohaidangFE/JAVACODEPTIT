import java.util.Scanner;

public class J01024 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String n = sc.next();
            int check = 1;
            for(int i = 0; i < n.length(); i++) {
                if(n.charAt(i) != '0' && n.charAt(i) != '1' && n.charAt(i) != '2') {
                    check = 0;
                    System.out.println("NO");
                    break;
                }
            }
            if(check == 1) {
                System.out.println("YES");
            }
        }
    }
}
