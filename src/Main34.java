import java.math.BigInteger;
import java.util.Scanner;

public class Main34 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        BigInteger N = scanner.nextBigInteger();

        System.out.println(snapNum(N));

    }

    public static int  snapNum(BigInteger N){
        int snapNumber =0;
        while (!N.equals(BigInteger.ONE)&&N.compareTo(BigInteger.ZERO)>0){
            BigInteger num1[]=N.divideAndRemainder(BigInteger.valueOf(2));

            if(num1[1].equals(BigInteger.ONE))
                N=N.add(BigInteger.ONE);
            else
                N=N.divide(BigInteger.valueOf(2));
            snapNumber++;
        }
        return snapNumber;

    }
}
