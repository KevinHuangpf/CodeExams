import java.math.BigInteger;
import java.util.Scanner;

public class Main18 {

    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int N = in.nextInt();
        in.close();

        //进行计算
        int res = 1;
        x %= N;

        for (; y != 0; y /= 2) {
            if (y % 2 == 1)
                res = (res * x) % N;
            x = (x * x) % N;
        }

        System.out.print(res);
    }

}