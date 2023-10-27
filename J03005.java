import java.util.Scanner;
import java.util.jar.Attributes.Name;


public class J03005 {
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
            int count = 1;
            for(int i = 0; i < name.length(); i++) {
                if(i == 0) {
                    res = res + (char)(name.charAt(i) - 32);
                }
                else if(name.charAt(i - 1) == ' ') {
                    res = res + (char)(name.charAt(i) - 32);
                    count++;
                }
                else {
                    res = res + name.charAt(i);
                }
            }
            String[] Name = res.split(" ");
            for(int i = 1; i < count - 1; i++) {
                System.out.print(Name[i] + " ");
            }
            System.out.print(Name[count - 1] + ", " + Name[0].toUpperCase());
            System.out.println();
        }
    }
}
