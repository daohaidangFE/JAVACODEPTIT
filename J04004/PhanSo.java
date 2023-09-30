package J04004;

public class PhanSo {

    private long tuSo;
    private long mauSo;
    
    public PhanSo() {
        this.tuSo = 1;
        this.mauSo = 1;
    }

    public PhanSo(PhanSo p) {
        this.tuSo = p.tuSo;
        this.mauSo = p.mauSo;
    }

    public long getTuSo() {
        return this.tuSo;
    }

    public void setTuSo(long tuSo) {
        this.tuSo = tuSo;
    }

    public long getMauSo() {
        return this.mauSo;
    }

    public void setMauSo(long mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo(long tuSo, long mauSo) {
        long gcd = J04004.GCD(tuSo,mauSo);
        this.tuSo = tuSo/gcd;
        this.mauSo = mauSo/gcd;
    }
}
