import java.util.Scanner;

public class Main13 {
    static int a=0;
    static int b=0;
    static int c=0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         a = scanner.nextInt();
         b = scanner.nextInt();
         c = scanner.nextInt();
        scanner.close();

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            int t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        }

        //方法1
        int x=0;
        if((b-a)%2==0)
            x=c-b+(b-a)/2;
        else
            x=c-b+(b-a)/2+2;

        System.out.print(x+" ");

        //方法2
        int count = 0;
        while (dest(a,b)>=2) {
            a+=2;
            count++;
        }

        while(dest(b,c)>=2){
            b+=2;
            a+=2;
            count++;
            count++;
        }

        if(b-a==0&&c-b==0)
            count+=0;

        if(b-a==0&&c-b==1)
            count+=1;

        if(b-a==1&&c-b==0)
            count+=2;

        if(b-a==1&&c-b==1)
            count+=3;

        System.out.print(count);

    }

    public static int dest(int a,int b){
        return a>b?a-b:b-a;
    }

}
