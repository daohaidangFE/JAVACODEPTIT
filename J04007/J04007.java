package J04007;

import java.util.Scanner;

public class J04007 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String gioiTinh = sc.nextLine();
        String ngaySinh = sc.nextLine();
        String diaChi = sc.nextLine();
        String maThue = sc.nextLine();
        String ngayKiHopDong = sc.nextLine();
        NhanVien nv = new NhanVien(hoTen, gioiTinh, ngaySinh, diaChi, maThue, ngayKiHopDong);
        System.out.printf("%s %s %s %s %s %s %s", nv.getMaNV(), nv.getHoTen(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getDiaChi(), nv.getMaThue(), nv.getNgayKiHopDong());
    }
}
