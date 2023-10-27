package J07037;

import java.io.*;
import java.util.*;

public class J07037 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<DoanhNghiep> d = new ArrayList<>();
        while(t-->0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int soSV = Integer.parseInt(sc.nextLine());
            d.add(new DoanhNghiep(ma, ten, soSV));
        }
        Collections.sort(d);
        for(DoanhNghiep i: d) {
            System.out.println(i);
        }
    }
}
