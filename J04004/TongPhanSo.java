package J04004;

public class TongPhanSo {
    private PhanSo a;
    private PhanSo b;

    public TongPhanSo(PhanSo a, PhanSo b) {
        this.a = a;
        this.b = b;
    }
    
    public void tinhTongPhanSo(PhanSo a, PhanSo b) {
        long mauSoChung = J04004.LCM(a.getMauSo(), b.getMauSo());
        long tmpa = mauSoChung / a.getMauSo();
        long tmpb = mauSoChung / b.getMauSo();
        a.setTuSo(a.getTuSo() * tmpa);
        b.setTuSo(b.getTuSo() * tmpb);
        a.setMauSo(mauSoChung);
        b.setMauSo(mauSoChung);
        long tuSoChung = a.getTuSo() + b.getTuSo();
        System.out.println(tuSoChung + "/" + mauSoChung);
    }
}
