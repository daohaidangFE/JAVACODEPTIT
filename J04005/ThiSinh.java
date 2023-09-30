package J04005;

public class ThiSinh {
    private String hoTen;
    private String ngaySinh;
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;
    private double tongDiem;

    public ThiSinh() {
        this.hoTen = "";
        this.ngaySinh = "";
        this.diemMon1 = 1.0f;
        this.diemMon2 = 1.0f;
        this.diemMon3 = 1.0f;
        this.tongDiem = diemMon1 + diemMon2 + diemMon3;
    }

    public ThiSinh(String hoTen, String ngaySinh, double diemMon1, double diemMon2, double diemMon3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
        this.tongDiem = diemMon1 + diemMon2 + diemMon3;
    }

    public String getHoTen() {
        return this.hoTen;
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
        return res;
    }

    public double getTongDiem() {
        return this.tongDiem;
    }

}
