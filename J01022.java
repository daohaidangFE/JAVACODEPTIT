import java.util.Scanner;

/*
 * Người ta tạo ra một dãy xâu ký tự nhị phân X[] trong đó:

X[1] = “0”

X[2] = “1”

X[n] = X[n-2] + X[n-1] với n>2

Với phép cộng (+) là phép nối hai xâu với nhau. 

Cho hai số tự nhiên N và K (1<N<93; K đảm bảo trong phạm vi của xâu X[N]).

Hãy xác định ký tự thứ K trong xâu X[N] là ký tự ‘0’ hay ký tự ‘1’.

Input: Dòng 1 ghi số bộ test. Mỗi bộ test ghi trên một dòng 2 số nguyên N và K.

Output: Ghi ra màn hình kết quả tương ứng với từng bộ test.
 */


public class J01022 {
    public static long checkBinary(long [] X, long k, int n) {
        if(n == 1) {
            return 0;
        } else if(n == 2) {
            return 1;
        } else {
            if(k > X[n - 2]) {
                return checkBinary(X, k - X[n - 2], n - 1);
            } else {
                return checkBinary(X, k, n - 2);
            }
        }
    }

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long [] X = new long[93];
        X[1] = 1;
        X[2] = 1;
        for(int i = 3; i <= 92; i++) {
            X[i] = X[i - 2] + X[i - 1];
        }
        while(t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(checkBinary(X, k, n));
        }
    }
}
