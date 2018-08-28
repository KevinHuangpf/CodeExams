import java.util.Random;

public class QH3601 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[1000000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000000);
        }

        long start = System.currentTimeMillis();

        new QH3601().quickSort(numbers,0,numbers.length-1);

        long time = System.currentTimeMillis() - start;

        System.out.println("耗时：" + time + "毫秒");
        //System.out.println(Arrays.toString(numbers));
    }

    public void quickSort(int[] n, int left, int right) {
        int pivot;
        if (left < right) {

            pivot = partition(n, left, right);

            quickSort(n, left, pivot - 1);
            quickSort(n, pivot + 1, right);
        }
    }

    public  int partition(int[] n, int left, int right) {
        int pivotkey = n[left];
        // key，最终在中间，前小后大
        while (left < right) {
            while (left < right && n[right] >= pivotkey)
                --right;

            // 将比key小的元素移到低端，此时right位相当于空，等待低位比pivotkey大的数补上
            n[left] = n[right];

            while (left < right && n[left] <= pivotkey)
                ++left;
            // 将比key大的元素移到高端，此时left位相当于空，等待高位比pivotkey小的数补上
            n[right] = n[left];

        }

        // 当left == right，完成一趟快速排序，此时left位相当于空，等待pivotkey补上
        n[left] = pivotkey;
        return left;
    }
}