package J04005;
import java.util.Scanner;

public class J04005 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String ngaySinh = sc.next();
        double diemMon1 = sc.nextDouble();        
        double diemMon2 = sc.nextDouble();
        double diemMon3 = sc.nextDouble();
        ThiSinh p = new ThiSinh(hoTen, ngaySinh, diemMon1, diemMon2, diemMon3);
        System.out.println(p.getHoTen() + " " + p.formatNgaySinh(ngaySinh) + " " + p.getTongDiem() );
    }
}
