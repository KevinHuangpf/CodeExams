import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //输入
        Scanner in = new Scanner(System.in);
        int[] number = new int[99];
        int sum =0;
        while (in.hasNext()) {

            for (int i = 1; i <= number.length; i++) {

                number[i-1] = in.nextInt();
                sum +=number[i-1];
                if(sum!=((i)*(i+1)/2)){
                    System.out.println(i);
                    break;
                }


            }
            break;
        }
        in.close();
    }



}
