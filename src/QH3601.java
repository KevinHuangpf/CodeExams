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

        System.out.println("��ʱ��" + time + "����");
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
        // key���������м䣬ǰС���
        while (left < right) {
            while (left < right && n[right] >= pivotkey)
                --right;

            // ����keyС��Ԫ���Ƶ��Ͷˣ���ʱrightλ�൱�ڿգ��ȴ���λ��pivotkey���������
            n[left] = n[right];

            while (left < right && n[left] <= pivotkey)
                ++left;
            // ����key���Ԫ���Ƶ��߶ˣ���ʱleftλ�൱�ڿգ��ȴ���λ��pivotkeyС��������
            n[right] = n[left];

        }

        // ��left == right�����һ�˿������򣬴�ʱleftλ�൱�ڿգ��ȴ�pivotkey����
        n[left] = pivotkey;
        return left;
    }
}