package J07034;

public class MonHoc implements Comparable<MonHoc> {
    private String maMon, tenMon;
    private int soTinChi;

    public MonHoc(String maMon, String tenMon, int soTinChi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + soTinChi;
    }

    @Override
    public int compareTo(MonHoc otherMonHoc) {
        if(this.tenMon.compareTo(otherMonHoc.tenMon) != 0) {
            return this.tenMon.compareTo(otherMonHoc.tenMon);
        }
        return 0;
    }
}
