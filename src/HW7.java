import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d= sc.nextDouble();
        if(d>=0)
            System.out.println((int)(d+0.5));
    }
}
