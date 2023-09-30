package J04006;

import java.util.Scanner;

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String tenLop = sc.next();
        String ngaySinh = sc.next();
        double diemGPA = sc.nextDouble();
        SinhVien s = new SinhVien(hoTen, tenLop, ngaySinh, diemGPA);
        System.out.println(s.getMaSV() + " " + s.getHoTen() + " " + s.getTenLop() + " " + s.formatNgaySinh(ngaySinh) + " " + s.getDiemGPA());
    }
}
