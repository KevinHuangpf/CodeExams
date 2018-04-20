/**
 * 求一个排序数组中绝对值最小的数
 */

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main16 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        //  -3 -4 -1 -131 3 123 12330 82
        String[] strings = scanner.nextLine().split(" ");

        //trans into int[]
        int[] intArr = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            intArr[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(intArr);

        System.out.print(getMinAbs1(intArr));

    }

    static int getMinAbs(int[] num) {

        //当数组只有一个元素的情况直接返回
        if (num.length == 1)
            return num[0];

        //当数组非负时直接返回num[0]，当数组非正时直接返回num[num.length-1]
        if (num[0] >= 0)
            return num[0];
        else if (num[num.length - 1] <= 0)
            return num[num.length - 1];

        //正负交替
        int minAbs = abs(num[0]);
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (abs(num[i]) < minAbs) {
                minAbs = abs(num[i]);
                min = num[i];
            }

        }
        return min;
    }

    /**首推算法*/
    static int getMinAbs1(int[] num) {
        int low = 0, high = num.length - 1, mid = (low + high) / 2;
        while (low <= high) {

            //都是正数或者都是负数
            if (num[low] * num[high] >= 0)
                return (num[low] >= 0) ? num[low] : num[high];

            //二分到仅仅剩2个
            if (low + 1 == high)
                return abs(num[low]) < abs(num[high]) ? num[low] : num[high];

            //左边部分是同号
            if (num[low] * num[mid] >= 0)
                low = mid;

            //右边是同号
            if (num[high] * num[mid] >= 0)
                high = mid;

            mid = (low + high) / 2;
        }

        return 0;
    }
}
