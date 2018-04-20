import java.util.ArrayList;
import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] str = scanner.nextLine().toCharArray();
        scanner.close();

        //为了保存最大序列
        ArrayList<Character> ch = new ArrayList<>();

        //空序列
        if (str.length == 0)
            return;

        //获取每次的最大的字典元素
        for (int i = 0; i < str.length; i++) {
            char maxChar = str[i];
            for (int j = i; j < str.length; j++) {
                if (maxChar < str[j]) {
                    maxChar = str[j];
                    i = j;
                }
            }
            ch.add(maxChar);
        }

        //输出字典序的最大子序列
        for (char tmp : ch) {
            System.out.print(tmp);
        }


    }

}
