package J07037;

public class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String maDN, tenDN;
    private int soSV;

    public DoanhNghiep(String maDN, String tenDN, int soSV) {
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soSV = soSV;
    }

    @Override
    public String toString() {
        return maDN + " " + tenDN + " " + soSV;
    }

    @Override
    public int compareTo(DoanhNghiep otherDoanhNghiep) {
        if(this.maDN.compareTo(otherDoanhNghiep.maDN) != 0) {
            return this.maDN.compareTo(otherDoanhNghiep.maDN);
        }
        return 0;
    }
}
