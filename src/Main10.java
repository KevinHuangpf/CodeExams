import java.math.BigInteger;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        BigInteger value=scanner.nextBigInteger();
        scanner.close();

        int count=0;
        while(value.compareTo(BigInteger.ZERO)>=0 ){
            value=value.subtract(BigInteger.ONE);
            if(isLCS(value.toString(2)))
                count++;
        }

        System.out.print(count);

    }

    public static boolean isLCS(String s){
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.toCharArray()[i]!=s.toCharArray()[s.length()-i-1])
                return false;
        }

        return true;
    }
}
