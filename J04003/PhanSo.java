package J04003;

public class PhanSo {
    public long GCD(long a, long b) {
        if (b==0) {
            return a;
        }
        return GCD(b,a%b);
    }

    private long tuSo;
    private long mauSo;
    
    public PhanSo() {
        this.tuSo = 1;
        this.mauSo = 1;
    }

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public void rutGonPhanSo(long tuSo, long mauSo) {
        long gcd = GCD(tuSo, mauSo);
        this.tuSo = this.tuSo/gcd;
        this.mauSo = this.mauSo/gcd;
        System.out.println(this.tuSo + "/" + this.mauSo);
    }
}
