import java.util.*;

public class Car {
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        String[] srr=str.split(" ");
        ArrayList<Integer> list=new ArrayList<>();
        int[] array = new int[srr.length];
        for (int i = 0; i < srr.length; i++) {
            array[i]=Integer.valueOf(srr[i]);
        }

        Arrays.sort(array);
        System.out.println(carNum(array));

    }

    public static int carNum(int[] n) {
        int length = n.length;
        int begin=0,end =length-1;
        int count=0;
        while (begin<=end){

            int sum=n[begin]+n[end];
            while (begin<=end){
                if(sum>=300){
                    sum=0;
                    end=end-1;
                    count++;
                    break;
                }
                begin++;
                System.out.println(begin);
                sum+=n[begin];

            }

        }


        return count;
    }
}
