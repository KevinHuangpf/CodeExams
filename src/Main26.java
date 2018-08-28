import java.util.Scanner;

/**
 * 编译器版本: Java 1.8.0_66
 * 请使用标准输入输出(System.in, System.out)；已禁用图形、文件、网络、系统相关的操作，如java.lang.Process , javax.swing.JFrame , Runtime.getRuntime；不要自定义包名称，否则会报错，即不要添加package answer之类的语句；您可以写很多个类，但是必须有一个类名为Main，并且为public属性，并且Main为唯一的public class，Main类的里面必须包含一个名字为'main'的静态方法（函数），这个方法是程序的入口
 * 时间限制: 1S (C/C++以外的语言为: 3 S)   内存限制: 128M (C/C++以外的语言为: 640 M)
 * 输入:
 * 输入：
 *  4
 * 3
 *  1,4
 * 2,3
 * 7,3
 * 输出:
 * 输入：
 * 4
 * 6
 * 1,3
 * 1,4
 * 2,3
 * 5,7
 * 5,8
 * 6,2
 * 输入范例:
 * 输出：
 * yes
 * 输出范例:
 * 输出：
 * no
 */


public class Main26 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] subJ = new int[m][2];
        for (int i = 0; i < subJ.length; i++) {


            String line = scanner.next();
            String[] array = line.split(",");
            subJ[i][0] = Integer.parseInt(array[0]);
            subJ[i][1] = Integer.parseInt(array[1]);

        }

        System.out.print(subJ[2][0]);

    }

//    public static String  JudgeService(int n,int m,int subJ[][]){
//
//
//
//
//
//    }


}
