import java.util.*;
public class Main37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] X = new int[n*2];
        int[] Y = new int[n*2];
        int[] X1 = new int[n];
        int[] Y1 = new int[n];
        int[] X2 = new int[n];
        int[] Y2 = new int[n];


        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
            X1[i] = X[i];
        }

        for (int i = 0; i < n; i++) {
            Y[i] = sc.nextInt();
            Y1[i] = Y[i];
        }

        for (int i = 0; i < n; i++) {
            X[i+n] = sc.nextInt();
            X2[i] = X[i+n];
        }

        for (int i = 0; i < n; i++) {
            Y[i+n] = sc.nextInt();
            Y2[i] = Y[i+n];
        }

        int result = 1;

        for (int i = 0; i < n*2; i++) {
            for (int j = 0; j < n*2; j++) {
                int count = 0;
                for (int k = 0; k < n; k++) {
                    if (X[i]>X1[k] && Y[j] > Y1[k] && X[i]<=X2[k] && Y[j] <= Y2[k]){
                        count++;

                    }

                }

                result = Math.max(result,count);
            }
        }

        System.out.println(result);
    }
}