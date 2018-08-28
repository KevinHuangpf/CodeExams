import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            new HW4().split8(sc.nextLine());
        }

    }

    public void split8(String str){
        str += "00000000";
        while (str.length()>8){
            System.out.println(str.substring(0,8));
            str=str.substring(8);
        }
    }

}
