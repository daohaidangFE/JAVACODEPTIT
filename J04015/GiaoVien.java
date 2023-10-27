package J04015;

public class GiaoVien {
    private String Name;
    private long luongCoBan;
    private String maNgach;
    private String chucVu;
    private long bacLuong;
    private long phuCap;
    private long thuNhap;

    public long phuCap() {
        long pC = 1;
        if("HT".equalsIgnoreCase(this.chucVu)) {
            pC = 2000000;
        }
        if("HP".equalsIgnoreCase(this.chucVu)) {
            pC = 900000;
        }
        if("GV".equalsIgnoreCase(this.chucVu)) {
            pC = 500000;
        }
        return pC;
    }

    public long thuNhap() {
        long tN = 1;
        try {
            tN = this.bacLuong * this.luongCoBan + this.phuCap;
        } catch (Exception e) {
            return 0;
        }
        return tN;
    }

    public GiaoVien(String maNgach, long luongCoBan, String Name) {
        this.maNgach = maNgach;
        this.Name = Name;
        this.luongCoBan = luongCoBan;
        this.chucVu = maNgach.substring(0, 2);
        this.bacLuong = Long.parseLong(maNgach.substring(2, 4));
        this.phuCap = phuCap();
        this.thuNhap = thuNhap();
    }

    public String toString() {
        return this.maNgach + " " + this.Name + " " + this.bacLuong +  " " + this.phuCap + " " + this.thuNhap;
    }

}
