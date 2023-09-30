import java.io.*;
//2147483647
public class J07002 {
    public static void main(String[]args) throws IOException {
        FileInputStream in = new FileInputStream("DATA.in");
        long sum = 0;
        int num = 0;
        String tmp = "";
        while(true) {z
            int i = in.read();
            if(i == -1) {
                break;
            }
            char c = (char)i;
            if(c >= '0' && c <= '9') {
                    tmp += c;
                }
            if(c == ' ' || c == '\n') {
                if(tmp.length() <= 10) {
                    int k = tmp.length() - 1;
                    num = 0;
                    for(int j = 0; j <= k; j++) {
                        num += Math.pow(10, k - j) * ((int)tmp.charAt(j) - 48);
                    }
                    sum += num;
                }
                tmp = "";
            }
        }
        if(tmp.length() <= 10) {
            int k = tmp.length() - 1;
            num = 0;
            for(int j = 0; j <= k; j++) {
                num += Math.pow(10, k - j) * ((int)tmp.charAt(j) - 48);
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
