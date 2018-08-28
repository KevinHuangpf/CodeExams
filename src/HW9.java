import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        double price = sc.nextDouble();
        HW9 hw=new HW9();
        double r1 = hw.comp1(n,price);
        double r2 = hw.comp2(n,price);

        if(r1==r2){
            System.out.println(0);
        }else if(r1>r2){
            System.out.println(2);
        }else {
            System.out.println(1);
        }
    }

    public double comp1(int number,double price){
        double res =number * price+10;
        if(number>=3)
            res=res*0.7;
        if(res>=50)
            res =res-10;
        return  (double)Math.round(res*100)/100;

    }

    public double comp2(int number,double price){
        double res = number * price+6;
        if(res>=10)
            res =res-2;

        if(res>=99)
            res =res-6;
        return  (double)Math.round(res*100)/100;

    }
}
