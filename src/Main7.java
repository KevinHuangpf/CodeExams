import java.math.BigInteger;
import java.util.Scanner;

public class Main7{

    public static void main(String[] args)
    {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        BigInteger q= new BigInteger("987654321");
        System.out.print((findInteger(n)).remainder(q));
    }

    public static BigInteger findInteger(int n)
    {
        int[] x = new int[n+1];
        for(int i=1; i<=n; i++) x[i] = i;

        for(int i=2; i<n; i++)
        {
            for(int j=i+1; j<=n; j++)
            {
                if(x[j] % x[i]==0) x[j]=x[j]/x[i];
            }
        }

        BigInteger m = BigInteger.ONE;
        for(int i=2; i<=n; i++)
        {
            m = m.multiply(BigInteger.valueOf((long)x[i]));
        }
        return m;
    }

}