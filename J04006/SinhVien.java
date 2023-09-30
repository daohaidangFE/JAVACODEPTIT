package J04006;

import java.text.DecimalFormat;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String tenLop;
    private String ngaySinh;
    private double diemGPA;

    public SinhVien() {
        this.maSV = "B21DCCN001";
        this.hoTen = "";
        this.tenLop = "";
        this.ngaySinh = "";
        this.diemGPA = 0.00f;
    }

    public SinhVien(String hoTen, String tenLop, String ngaySinh, double diemGPA) {
        this.hoTen = hoTen;
        this.tenLop = tenLop;
        this.ngaySinh = ngaySinh;
        this.diemGPA = diemGPA;
        this.maSV = "B20DCCN001";
    }

    public String getMaSV() {
        return this.maSV;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public String getTenLop() {
        return this.tenLop;
    }

    public String formatNgaySinh(String ngaySinh) {
        String res = "";
        int k = ngaySinh.length();
        int i = 0;
        String tmp = "";
        while(i < k) {
            if(ngaySinh.charAt(i) != '/') {
                tmp = tmp + ngaySinh.charAt(i);
            } else {
                if(tmp.length() < 2) {
                    tmp = "0" + tmp;
                }
                res = res + tmp + "/";
                tmp = "";
            }
            i++;
        }
        res = res + tmp;
        this.ngaySinh = res;
        return this.ngaySinh;
    }

    public String getDiemGPA() {
        DecimalFormat df = new DecimalFormat("#.00");
        String diemGPA = df.format(this.diemGPA);
        return diemGPA;
    }
}
