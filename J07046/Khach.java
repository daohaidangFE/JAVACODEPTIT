package J07046;

public class Khach implements Comparable<Khach> {
    private String maKH, tenKH, maPhong, ngayDen, ngayDi;
    private long ngayLuuTru;

    public Khach(String maKH, String tenKH, String maPhong, long ngayLuuTru) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maPhong = maPhong;
        this.ngayLuuTru = ngayLuuTru;
    }

    @Override
    public String toString() {
        return maKH + " " + tenKH + " " + maPhong + " " + ngayLuuTru;
    }

    @Override
    public int compareTo(Khach otherKhach) {
        if(this.ngayLuuTru < otherKhach.ngayLuuTru) {
            return 1;
        }
        return -1;
    }
}
