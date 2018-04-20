import java.util.Scanner;

public class Main14 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        char[] chayArr = scanner.nextLine().toCharArray();
        shiftK(chayArr,2);
        System.out.print(chayArr);

    }

    public static void shiftK(char[] a,int k){
        reverse(a,0,a.length - k-1);
        reverse(a,a.length-k,a.length-1);
        reverse(a,0,a.length-1);
    }

    public static void reverse(char[] a,int b,int e){
        for(;b<=e;b++,e--){
            char temp =a[b];
            a[b]=a[e];
            a[e]=temp;
        }
    }

}
