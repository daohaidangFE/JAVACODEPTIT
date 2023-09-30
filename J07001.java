import java.io.*;

public class J07001 {
    public static void main(String[]args) throws IOException {
        FileInputStream in = new FileInputStream("DATA.in");
        while(true) {
            int i = in.read();
            if(i == -1) {
                break;
            }
            System.out.print((char)i);
        }
    }
}

