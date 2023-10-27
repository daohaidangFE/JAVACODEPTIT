package J07050;

import java.io.*;
import java.util.*;

public class J07050 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<MatHang> m = new ArrayList<>();
        int i = 0;
        while(t-->0) {
            String num = String.valueOf(i+1);
            while(num.length() < 2) {
                num = "0" + num;
            }
            String maHang = "MH" + num;
            String tenHang = sc.nextLine();
            String nhomHang = sc.nextLine();
            double giaMua = Double.parseDouble(sc.nextLine());
            double giaBan = Double.parseDouble(sc.nextLine());
            m.add(new MatHang(maHang, tenHang, nhomHang, giaMua, giaBan));
            i++;
        }
        Collections.sort(m);
        for(MatHang j: m) {
            System.out.println(j);
        }
    }
}
