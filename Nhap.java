import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.io.*;




public class Nhap {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        // FileInputStream in = new FileInputStream("Data1.txt");
        // FileOutputStream out = new FileOutputStream("Data2.txt");
        // //copy
        // while(true) {
        //     int i = in.read();
        //     if(i == -1) {
        //         break;
        //     }
        //     out.write(i);
        // }
        
        // //nhập dữ liệu đưa vào file
        // String nhap = sc.nextLine();
        // BufferedWriter bw = new BufferedWriter(new FileWriter("Data1.txt"));
        // bw.write(nhap);
        // bw.close();

        // File file = new File("Data3.in");
        // if(file.createNewFile()) {
        //     System.out.println("Chua tao");
        // } else {
        //     System.out.println("Da tao");\
        // }
        // String p = "12";
        // int k = p.length();
        // StringBuilder q = new StringBuilder(p).reverse();
        // String t = q.toString();
        // int res = 0;
        // for(int i = 0; i < k; i++) {
        //     int tmp = (int)(t.charAt(i)) - 48;
        //     res +=  (tmp * (Math.pow(10, i)));
        // }
        // System.out.println(res);
        double i = 1;
        System.out.printf("%.00f", i);
    }
}
