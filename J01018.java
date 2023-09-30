import java.util.Scanner;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int sum = 0;
            int check = 1;
            String n = sc.next();
            for(int i = 0; i < n.length(); i++) {
                int tmp = Character.getNumericValue(n.charAt(i));
                sum += tmp;
            }
            if(sum % 10 != 0) {
                check = 0;
            }
            if(check == 0) {
                System.out.println("NO");
            } else {
                for(int i = 0; i < n.length() - 1; i++) {
                    int x = Character.getNumericValue(n.charAt(i));
                    int y = Character.getNumericValue(n.charAt(i + 1));
                    int z = Math.abs(x - y);
                    if(z != 2) {
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
}

