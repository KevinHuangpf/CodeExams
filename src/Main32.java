/**
 3 3 1 3
 1 2 3
 2 3 3
 3 1 1
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main32 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int S = scanner.nextInt();
        int T = scanner.nextInt();

        int[][] disArray = new int[N+1][N+1];

        for(int i =0;i<=N;i++){
            for(int j =0;j<=N;j++){
                //为了方便下面操作，自己到自己的距离设置为0
                disArray[i][j]= -1;
                if(i==j)
                    disArray[i][j]=0;
            }
        }

        for (int i = 0; i < M; i++) {
            disArray[scanner.nextInt()][scanner.nextInt()] = scanner.nextInt();
        }

        System.out.println(DjRoute(disArray,S,T)+DjRoute(disArray,T,S));


    }

    public static int DjRoute(int[][] array, int source, int destination) {

        boolean[] indexLb = new boolean[array[0].length];

        int[] s = new int[array[0].length];

        int count = -1;

        int[] distance = array[source].clone();
        int index = source;
        int shortI = 0;

        s[++count] = index;
        indexLb[index] = true;

        while (count < array[0].length) {

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < distance.length; i++) {
                if (!indexLb[i] && distance[i] != -1 && i != index) {

                    if (distance[i] < min) {
                        min = distance[i];
                        index = i;
                    }
                }
            }
            if (index == destination) {
                break;
            }

            indexLb[index] = true;

            s[++count] = index;


            if (array[s[count - 1]][index] == -1 || shortI + array[s[count - 1]][index] > distance[index]) {
                shortI = distance[index];
            } else {
                shortI += array[s[count - 1]][index];
            }

            for (int i = 0; i < distance.length; i++) {

                if (distance[i] == -1 && array[index][i] != -1) {
                    distance[i] = shortI + array[index][i];
                } else if (array[index][i] != -1 && shortI + array[index][i] < distance[i])

                {
                    distance[i] = shortI + array[index][i];
                }


            }
        }

        return distance[destination] - distance[source];
    }

}
