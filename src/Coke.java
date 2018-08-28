import java.util.Scanner;

public class Coke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(whichOne(N));
        System.out.println(whichOne(2));
        System.out.println(whichOne(3));
        System.out.println(whichOne(8));
    }

    public static String whichOne(int n) {
        String[] names = new String[]{"Alice", "Bob", "Cathy", "Dave"};
        int k=1;
        while (true) {
            if(2*(Math.pow(2,k))-3>n)
                break;
            k++;

        }
        k=k-1;
        System.out.println(k);

        double current = 2*(Math.pow(2,k))-3;

        double dis = n-current;


        double step=Math.pow(2,k-1);

        if(current<=n&&n<=current+step-1)
            return names[0];

        if(current+step<=n&&n<=current+2*step-1)
            return names[1];

        if(current+2*step<=n&&n<=current+3*step-1)
            return names[2];

        if(current+3*step<=n&&n<=current+4*step-1)
            return names[3];

        return null;

    }
}
