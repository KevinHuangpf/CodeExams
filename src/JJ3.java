import java.util.ArrayList;
import java.util.Scanner;

public class JJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index=100;
        ArrayList arrayList= new ArrayList();
        while (index<=n){
            int hund=index/100;
            int tenth =(index-100*hund)/10;
            int unit = index-hund*100-tenth*10;

            if(index==hund*hund*hund+tenth*tenth*tenth+unit*unit*unit){
                System.out.print(index+" ");
            }
            index++;
        }

/*
        for (int i = 0; i < arrayList.size()-1; i++) {
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.print(arrayList.get(arrayList.size()-1));
*/


/*        if (100 < n && n < 153) {

        } else if (153 <= n && n <370) {
            System.out.println(153);
        } else if (370 <= n && n <371) {
                System.out.println(153 + " "+ 370);
        }else if(371 <= n && n <407){
        System.out.println(153+" "+370+" "+371);
        }else if(407<=n&&n<1000)
            System.out.println(153+" "+370+" "+371+" "+407);*/


    }
}
