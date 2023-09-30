
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class J07004 {
     public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] dd = new int[1005];
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.next());
            dd[n] += 1;
        }
        for (int i = 0; i < 1005; i++) {
            if (dd[i] > 0) {
                System.out.print(i + " " + dd[i] + "\n");
            }
        }
    }
}

   
