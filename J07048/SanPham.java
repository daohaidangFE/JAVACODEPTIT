package J07048;

public class SanPham implements Comparable<SanPham> {
    private String maSP, tenSP;
    private int USD, baoHanh;

    public SanPham(String maSP, String tenSP, int USD, int baoHanh) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.baoHanh = baoHanh;
        this.USD = USD;
    }

    @Override
    public String toString() {
        return maSP + " " + tenSP + " " + USD + " " + baoHanh;
    }

    @Override
    public int compareTo(SanPham otherSanPham) {
        if(this.USD < otherSanPham.USD) {
            return 1;
        } else if(this.USD == otherSanPham.USD && this.maSP.compareTo(otherSanPham.maSP) != 0) {
            return this.maSP.compareTo(otherSanPham.maSP);
        }
        return -1;
    }
}
