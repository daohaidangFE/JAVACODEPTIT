package J04015;

import java.util.Scanner;

public class J04015 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String maNgach = sc.nextLine();
        String Name = sc.nextLine();
        // sc.nextLine();
        long luongCoBan = sc.nextLong();
        GiaoVien g = new GiaoVien(maNgach, luongCoBan, Name);
        System.out.println(g);
    }
}
