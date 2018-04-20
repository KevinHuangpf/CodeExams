import java.util.Scanner;

public class Main19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int N = in.nextInt();

        System.out.print(pow_mod(x, y, N));
    }


/*    static int pow_mod(int a, int n, int m) {
        {
            if (n == 1) return a;
            else {
                int x = pow_mod(a, n / 2, m);
                x = (long) x * x % m;
                if (n % 2 == 1) x = (long) x * a % m;
                return (int) x;
            }
        }*/
/*    static long pow_mod(long a, long b, long m)      //a的b次方，并对结果取模
    {
        long ans=1;
        while(b!=0)
        {
            if((b&1)!=0)
            {
                ans=mul_mod(ans,a,m);b--;
            }
            a=mul_mod(a,a,m);
            b>>=1;
        }
        return ans;
    }*/

/*    static long mul_mod( long a,long  b, long m)      //a个b相加，结果对m取模
    {
         long t=0;
        while(b!=0)
        {
            if((b&1)!=0)
            {
                t+= a%m;
                t%=m;
            }
            a<<=1;
            b>>=1;
            a%=m;

        }
        return t;
    }*/

    }
}