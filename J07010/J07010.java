package J07010;

import java.io.*;
import java.util.*;

public class J07010 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = Integer.parseInt(sc.nextLine());
        int i = 0;
        SinhVien[] a = new SinhVien[t];
        while(t-->0) {
            String num = String.valueOf(i+1);
            while(num.length() < 3) {
                num = "0" + num;
            }
            String ID = "B20DCCN" + num;
            String Name = sc.nextLine();
            String Class = sc.nextLine();
            String Date = sc.nextLine();
            double Gpa = Double.parseDouble(sc.nextLine());
            a[i] = new SinhVien(ID, Name, Class, Date, Gpa);
            i++;
        }
        for(SinhVien j: a) {
            System.out.println(j);
        }
    }
}
