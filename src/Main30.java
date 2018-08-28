import java.util.Scanner;

/**
 *最近天气太热了，牛牛每天都要吃雪糕。雪糕有一盒一份、一盒两份、一盒三份这三种包装，牛牛一天可以吃多盒雪糕，
 * 但是只能吃六份，吃多了就会肚子疼，吃少了就会中暑。而且贪吃的牛牛一旦打开一盒雪糕，就一定会把它吃完。
 * 请问牛牛能健康地度过这段高温期么？
 */


public class Main30 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[][] dataSummer =new int[T][4];
        for(int i =0;i<T;i++){
            dataSummer[T][0] = scanner.nextInt();
            dataSummer[T][1] = scanner.nextInt();
            dataSummer[T][2] = scanner.nextInt();
            dataSummer[T][3] = scanner.nextInt();
        }

    }


/*    public static String[] judge(int[][] data){




    }*/


}
