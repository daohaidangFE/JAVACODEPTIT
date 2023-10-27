package J07059;

import java.util.*;
import java.io.*;


public class J07059 {
    public static String formatInt(int i) {
        String res = String.valueOf(i);
        while(res.length() < 3) {
            res = "0" + res;
        }
        return res;
    }
    public static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(new File("CATHI.in"));
        int t = sc.nextInt();
        int i = 1;
        List<cathi> a = new ArrayList<>();
        sc.nextLine();
        while(t-- > 0) {
            String res = formatInt(i);
            String maCaThi = "C" + res;
            String ngayThi = sc.nextLine();
            String gioThi = sc.nextLine();
            String ID = sc.nextLine();
            cathi c = new cathi(maCaThi,ngayThi, gioThi, ID);
            a.add(c);
            i++;
        }
        Collections.sort(a);
        for(cathi j: a) {
            System.out.println(j);
        }
    }
}
