import java.util.*;

public class HW3 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()) {

            int n = sc.nextInt();
            int[] arr = new int[1001];
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                arr[temp] = temp;
            }
            for (int i = 0; i <=1000 ; i++) {
                if(arr[i]!=0)
                    System.out.println(i);
            }

        }
    }


    public  TreeSet<Integer> clearSort(int[] a){
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        return set;

    }


}
