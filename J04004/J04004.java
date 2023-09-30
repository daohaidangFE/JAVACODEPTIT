package J04004;

import java.util.Scanner;

public class J04004 {
    public static long GCD(long a, long b) {
        if (b==0) {
            return a;
        }
        return GCD(b,a%b);
    }

    public static long LCM(long a, long b) {
        return (a * b) /GCD(a, b);
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        long tuSoA = sc.nextLong();
        long mauSoA = sc.nextLong();
        long tuSoB = sc.nextLong();
        long mauSoB = sc.nextLong();
        PhanSo a = new PhanSo(tuSoA, mauSoA);
        PhanSo b = new PhanSo(tuSoB, mauSoB);
        TongPhanSo p = new TongPhanSo(a, b);
        p.tinhTongPhanSo(a, b);
    }
}
