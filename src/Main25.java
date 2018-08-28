import java.util.Scanner;

public class Main25 {

    public static void main(String args[]){
        //输入
        Scanner scanner = new Scanner(System.in);
        String[] string = scanner.nextLine().split(";");


        System.out.print(compareStrings(string[0],string[1]));

    }


    public static   boolean compareStrings(String A, String B) {

        //数字0到字母
        int[] index = new int[80];

        for (int i = 0; i < A.length(); i++) {
            index[A.charAt(i) - '0']++;
        }

        for (int i = 0; i < B.length(); i++) {
            index[B.charAt(i) - '0']--;
            if(index[B.charAt(i) - '0'] < 0){
                return false;
            }
        }

        return true;
    }

}
