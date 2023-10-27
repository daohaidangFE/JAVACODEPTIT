package J07050;

import java.text.DecimalFormat;

public class MatHang implements Comparable<MatHang> {
    private String maHang, tenHang, nhomHang;
    private double giaMua, giaBan, loiNhuan;


    public MatHang(String maHang, String tenHang, String nhomHang, double giaMua, double giaBan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        String res = df.format(loiNhuan);
        return maHang + " " + tenHang + " " + nhomHang + " " + res;
    }

    @Override
    public int compareTo(MatHang otherMatHang) {
        if(this.loiNhuan < otherMatHang.loiNhuan) {
            return 1;
        }
        return -1;
    }
}
