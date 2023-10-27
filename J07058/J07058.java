package J07058;

import java.util.*;
import java.io.*;

public class J07058 {
    public static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = sc.nextInt();
        ArrayList<monhoc> a = new ArrayList<monhoc>();
        sc.nextLine();
        while(t-- > 0) {
            String maMon = sc.nextLine();            
            String tenMon = sc.nextLine();
            String hinhThucThi = sc.nextLine();
            monhoc m = new monhoc(maMon, tenMon, hinhThucThi);
            a.add(m);
        }
        Collections.sort(a);
        for(monhoc i: a) {
            System.out.println(i);
        }
    }
}
