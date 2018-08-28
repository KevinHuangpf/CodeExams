import java.util.Scanner;


/*
3
2
helloworld
hdlrowolle
2
helloworld
worldhello
2
abcde
acbde
        */
public class ZJ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {

            int m = in.nextInt();
            String[] S = new String[m];
            for (int j = 0; j <m ; j++) {
                S[j]=in.next();
            }

            boolean flag=false;
            for (int j = 0; j < S.length; j++) {
                for (int k = j+1; k < S.length; k++) {
                    boolean posit = false;
                    boolean nati = false;

                    if (isRotation(S[j],S[k]) ==true) {
                        posit=true;
                    } else
                        posit=false;

                    if (isRotation(S[j],reverseStringBuilder(S[k])) ==true) {
                        nati=true;
                    } else
                        nati=false;

                    if(posit==true||nati==true){
                        flag=true;
                        break;
                    }

                }
            }
            if(flag==true)
                System.out.println("Yeah");
            else System.out.println("Sad");

        }
    }
    public static String reverseStringBuilder(String s) {
        StringBuilder sb = new StringBuilder(s);
        String afterreverse = sb.reverse().toString();
        return afterreverse;
    }


    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        String str = str2.concat(str2);
        return str.contains(str1);
    }
}