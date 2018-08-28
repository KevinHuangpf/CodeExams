
import java.util.Scanner;

public class Main31 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int f = scanner.nextInt();
        int d = scanner.nextInt();
        int p = scanner.nextInt();
        int day;
        if(d/x<=f)
            day=d/x;
        else
            day=f+(d-x*f)/(x+p);
        System.out.println(day);

    }


}
