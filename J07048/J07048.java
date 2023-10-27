package J07048;

import java.io.*;
import java.util.*;

public class J07048 {
    public static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<SanPham> s = new ArrayList<>();
        while(t-- > 0) {
            String maSP =sc.nextLine();
            String tenSP =sc.nextLine();
            int USD = Integer.parseInt(sc.nextLine());
            int baoHanh = Integer.parseInt(sc.nextLine());
            s.add(new SanPham(maSP, tenSP, USD, baoHanh));
        }
        Collections.sort(s);
        for(SanPham i: s) {
            System.out.println(i);
        }
    }
}
