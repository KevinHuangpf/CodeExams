import java.util.Arrays;
import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a=new long[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextLong();
        }
        System.out.println(new Max3().multMax3(a));
    }
    public long multMax3(long a[]){
        Arrays.sort(a);
        long maxA = a[a.length-1]* a[a.length-2]* a[a.length-3];
        long maxB=a[a.length-1]* a[0]* a[1];
        return maxA>maxB?maxA:maxB;
    }
}
