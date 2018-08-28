/**
 *
 6 2
 a
 bc
 d
 eba
 ebc
 f


 ebcc
 ebd
 S
 *
 * */
import java.util.Scanner;

public class Main28 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);



        while(true) {

            String[] string = scanner.nextLine().split(" ");
            int m = Integer.parseInt(string[0]);
            int n = Integer.parseInt(string[1]);
            String[] str1 = new String[m];
            String[] str2 = new String[n];
            for (int i = 0; i < m; i++) {
                str1[i] = scanner.nextLine();
            }
            String blank1 = scanner.nextLine();

            for (int i = 0; i < n; i++) {
                str2[i] = scanner.nextLine();
            }
            int[] result = checkChar(str1, str2);
            for (int i : result)
                System.out.println(i);

            String blank2 = scanner.nextLine();
        }

    }

    public static int[] checkChar(String[] str1,String[] str2){
        int[] result = new int[str2.length];
      for (int i = 0; i < result.length; i++) {
          result[i] = -1;//全部赋为moren
      }

        for(int n=0;n<str2.length;n++){
            for(int m=0;m<str1.length;m++){
                if(1==result[n])
                    break;
                if(str2[n].startsWith(str1[m]))
                    result[n]=1;
            }
        }
        return result;

    }



}
