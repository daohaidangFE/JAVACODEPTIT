package J07058;

public class monhoc implements Comparable<monhoc> {
    private String maMon;
    private String tenMon;
    private String hinhThucThi;

    public monhoc() {
    }

    public monhoc(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }

    @Override
    public int compareTo(monhoc otherMonhoc) {
        int check = this.maMon.compareTo(otherMonhoc.maMon);
        if(check != 0) {
            return this.maMon.compareTo(otherMonhoc.maMon);
        }
        return 0;
    }
    @Override
    public String toString() {
        return maMon + " " + tenMon + " " + hinhThucThi;
    }
}
