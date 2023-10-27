package J07034;

import java.io.*;
import java.util.*;;


public class J07034 {
    public static void main(String[]args) throws IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        List<MonHoc> m = new ArrayList<>();
        while(t-->0) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int tinchi = Integer.parseInt(sc.nextLine());
            m.add(new MonHoc(ma, ten, tinchi));
        }
        Collections.sort(m);   
        for(MonHoc i: m) {
            System.out.println(i);
        }
    }
}
