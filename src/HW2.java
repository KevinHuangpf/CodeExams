import java.util.Scanner;

public class HW2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){

            char[] chars= sc.nextLine().toUpperCase().toCharArray();
            char ch = sc.nextLine().toUpperCase().charAt(0);
            int count=0;
            for (int i = 0; i < chars.length; i++) {
                if(chars[i]==ch)
                    count++;
            }
            System.out.println(count);
        }
    }


}