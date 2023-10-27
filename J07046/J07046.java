package J07046;
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class J07046 {
    public static void main(String[]args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int t = Integer.parseInt(sc.nextLine());
        List<Khach> k = new ArrayList<>();
        int i = 0;
        while(t-->0) {
            String num = String.valueOf(i + 1);
            while(num.length() < 2) {
                num = "0" + num;
            }
            String maKH = "KH" + num;
            String tenKH = sc.nextLine();
            String maPhong = sc.nextLine();
            Date ngayDen = sdf.parse(sc.nextLine());
            Date ngayDi = sdf.parse(sc.nextLine());
            long ngayLuuTru = (ngayDi.getTime() - ngayDen.getTime())/(1000*60*60*24);
            k.add(new Khach(maKH, tenKH, maPhong, ngayLuuTru));
            i++;
        }
        Collections.sort(k);
        for(Khach j: k) {
            System.out.println(j);
        }
        
    }
}
 