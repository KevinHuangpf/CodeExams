import java.util.Scanner;

public class Main36 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        System.out.println(getXY(n,k));
    }


    public static long getXY(int n, int k) {
        long count = 0;

        long temp;
        for (long y = k + 1; y <= n; y++) {    //  x/y>=k,说明y>k
            // 假设n = a*y +b；在每个长度为y的区间里只有（y-k）个数模y余数>=k。
            count += n / y * (y - k);
            temp = n % y;
            if (temp >= k) {                    //再考虑余数b是否>=k
                count += temp - k + 1;
            }


/*        for(int x =0;x<=n;x++){
            for(int y =0;y<=n;y++){
                if(y!=0&&x%y>=k)
                    count++;
            }
        }*/

        }
        return count;
    }
}
