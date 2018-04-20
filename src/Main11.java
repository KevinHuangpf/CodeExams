
import java.math.BigInteger;
import java.util.Scanner;

public class Main11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        scanner.close();

        BigInteger tempA= BigInteger.valueOf(1<<a);
        BigInteger tempB= BigInteger.valueOf(1<<b);
        BigInteger tempC= BigInteger.valueOf(1<<c);
        BigInteger value = tempA.add(tempB);
        value =value.subtract(tempC);
        System.out.println(value);
//        System.out.println( Long.toBinaryString(value).split("")[1]);
//        System.out.println(countOne(value));

//        System.out.print(countOne(value));

    }

    public static int countOne(long x){
        int count=0;
        String[] str = Long.toBinaryString(x).split("");
        for(String s:str){
            if(str.equals(1))
                count++;
        }
        return count;

    }


}





