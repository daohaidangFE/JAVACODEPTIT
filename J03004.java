import java.util.Scanner;

public class J03004 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String name = sc.nextLine();
            name = name.trim();
            name = name.toLowerCase();
            while(name.contains("  ")) {
                name = name.replace("  ", " ");
            }
            String res = "";
            for(int i = 0; i < name.length(); i++) {
                if(i == 0) {
                    res = res + (char)(name.charAt(i) - 32);
                }
                else if(name.charAt(i - 1) == ' ') {
                    res = res + (char)(name.charAt(i) - 32);
                }
                else {
                    res = res + name.charAt(i);
                }
            }
            System.out.println(res);
        }
    }
}
