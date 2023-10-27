package J07059;

public class cathi implements Comparable<cathi> {
    private String maCaThi;
    private String ngayThi;
    private String gioThi;
    private String ID;

    public cathi(String maCaThi, String ngayThi, String gioThi, String ID) {
        this.maCaThi = maCaThi;
        this.ngayThi = ngayThi;
        this.gioThi = gioThi;
        this.ID = ID;
    }

    public void formatDate(String ngayThi) {
        String res = "";
        int k = ngayThi.length();
        int i = 0;
        String tmp = "";
        while(i < k) {
            if(ngayThi.charAt(i) != '/') {
                tmp = tmp + ngayThi.charAt(i);
            } else {
                if(tmp.length() < 2) {
                    tmp = "0" + tmp;
                }
                res = res + tmp + "/";
                tmp = "";
            }
            i++;
        }
        res = res + tmp;
        this.ngayThi = res;
    }

    public void formatHour(String gioThi) {
        String res = "";
        int k = gioThi.length();
        int i = 0;
        String tmp = "";
        while(i < k) {
            if (gioThi.charAt(i) != ':') {
                tmp = tmp + gioThi.charAt(i);
            } else {
                if(tmp.length() < 2) {
                    tmp = "0" + tmp;
                }
                res = res + tmp + ":";
                tmp = "";
            }
            i++;
        }
        if(tmp.length() < 2) {
            res = res + "0" + tmp;
        } else {
            res = res + tmp;
        }
        this.gioThi = res;
    }

    @Override
    public int compareTo(cathi otherCaThi) {
        int check1 = this.ngayThi.compareTo(otherCaThi.ngayThi);
        int check2 = this.gioThi.compareTo(otherCaThi.gioThi);
        if(check1 != 0) {
            return this.ngayThi.compareTo(otherCaThi.ngayThi);
        } else if(check2 != 0) {
            return this.gioThi.compareTo(otherCaThi.gioThi);
        } else {
            return this.maCaThi.compareTo(otherCaThi.maCaThi);
        }
    }

    @Override
    public String toString() {
        formatDate(ngayThi);
        formatHour(gioThi);
        return maCaThi + " " + ngayThi + " " + gioThi + " " + ID;
    }

}
