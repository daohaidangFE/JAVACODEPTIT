import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            String s = sc.next();
            String res = "";
            int k = -1;
            int check = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '8' && s.charAt(i) != '9') {
                    System.out.println("INVALID");
                    check = 1;
                    break;
                } else if(s.charAt(i) == '1') {
                    k = i;
                    break;
                }                 
            }
            if(check == 0) {
                if(k > -1) {
                for(int j = k; j < s.length(); j++) {
                    if(s.charAt(j) == '0') {
                        res = res + "0";
                    }
                    if(s.charAt(j) == '1') {
                        res = res + "1";
                    }
                    if(s.charAt(j) == '8') {
                        res = res + "0";
                    }
                    if(s.charAt(j) == '9') {
                        res = res + "0";
                    }
                }
                System.out.println(res);
            } else {
                System.out.println("INVALID");
            }
            }
            t--;
        }
    }
}
