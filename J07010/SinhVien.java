package J07010;

import java.text.DecimalFormat;

public class SinhVien {
    private String svID, svName, svClass, svDate;
    private double svGPA = 1.00f;

    public SinhVien(String svID, String svName, String svClass, String svDate, double svGPA) {
        this.svID = svID;
        this.svName = svName;
        this.svClass = svClass;
        this.svDate = svDate;
        this.svGPA = svGPA;
    }

    public void formDate(String Date) {
        String res = "";
        String tmp = "";
        int i = 0;
        int k = Date.length();
        while(i < k) {
            if(Date.charAt(i) != '/') {
                tmp += Date.charAt(i);
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
        this.svDate = res;
    }

    public String formPoint(double GPA) {
        double tmp = svGPA;
        DecimalFormat df = new DecimalFormat("0.00");
        String res = df.format(tmp);
        return res;
    }

    @Override
    public String toString() {
        formDate(svDate);
        return svID + " " + svName + " " + svClass + " " + svDate + " " + formPoint(svGPA);
    }
}
