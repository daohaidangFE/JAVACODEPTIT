package J04007;

public class NhanVien {

    private String maNV;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String maThue;
    private String ngayKiHopDong;

    public NhanVien() {
        this.maNV = "00001";
    }

    public NhanVien (String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maThue, String ngayKiHopDong) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.ngayKiHopDong = ngayKiHopDong;
        this.maNV = "00001";
    }

    public String fTime(String s) {
        String res = "";
        int k = s.length();
        int i = 0;
        String tmp = "";
        while(i < k) {
            if(s.charAt(i) != '/') {
                tmp = tmp + s.charAt(i);
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

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgaySinh() {
        return fTime(ngaySinh);
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getMaThue() {
        return maThue;
    }

    public String getNgayKiHopDong() {
        return fTime(ngayKiHopDong);
    }

}
