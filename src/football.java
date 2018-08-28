import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class football {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] score = new String[N];
        String[] scoreAfter = new String[N];

        for (int i = 0; i < N; i++) {
            score[i]="";
            scoreAfter[i]="";
        }

        for (int i = 1; i <= M; i++) {
            String s =sc.next();
            for (int j = 0; j < N; j++) {
                score[j]+=s.split("")[j];
                scoreAfter[j]+=s.split("")[j];

            }
        }


        for (int i = 0; i < N; i++) {

            score[i]=StringSort(score[i]);
            scoreAfter[i]=StringSort(scoreAfter[i]);
        }

        Arrays.sort(score);

        int count=0;
        int index=0;
        for (int i = 0; i < score.length; i++) {
            if(score[0].equals(scoreAfter[i])) {
                count++;
                index=i;
            }
        }

        if(count==1)
            System.out.println(index);
        else
            System.out.println(-1);

    }

    public static String StringSort(String S){

        char [] arr =S.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }


}
