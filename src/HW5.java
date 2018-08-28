

import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            new HW5().wordsCh(sc.nextLine().substring(2));
        }
    }

    public void wordsC(String s){
        System.out.println(Integer.parseInt(s,16));
    }

    public void wordsCh(String s){
        int sum=0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)>='A'&&s.charAt(i)<='F')
                sum += (Integer.valueOf(s.charAt(i)-55))*Math.pow(16,s.length()-1-i);

            else if(s.charAt(i)>='a'&&s.charAt(i)<='f')
                sum += (Integer.valueOf(s.charAt(i)-87))*Math.pow(16,s.length()-1-i);
            else
                sum +=(Integer.valueOf(s.charAt(i))-48)*Math.pow(16,s.length()-1-i);
        }

        System.out.println(sum);
    }

}
