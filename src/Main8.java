//jd
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("input:");
        String value=scanner.next();
        scanner.close();


        char[] ar = value.toCharArray();
        ArrayList list = new ArrayList(Arrays.asList(value.split(",")));
      //kmp算法？kmp算法？kmp算法？kmp算法？kmp算法？

        for (int i = 0; i < list.size(); i++){

        }




            System.out.print(isLCS(value));

    }



    //判断是不是回文串
    public static boolean isLCS(String s){
        boolean isSame=true;
        for(int i=0;i<s.length();i++){
            int j=s.length()-i-1;
            if(i>=j) break;
            if(s.charAt(i)!=s.charAt(j)){
                isSame=false;
                break;
            }
        }
        if(isSame) return true;
        else return false;
    }


}
