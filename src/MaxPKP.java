import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MaxPKP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int[] AAA = new int[3];
        //int[] BBB = new int[3];
/*        for (int i = 0; i < 3; i++) {
            AAA[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            BBB[i] = sc.nextInt();
        }*/
        int[] AAA = {3,5,7};
        int[] BBB = {2,6,8};
        System.out.println(victoryFac(AAA, BBB));
    }


    /**
     * 3 5 7 2 6 8
     * 0.3905???
     * 808
     */
    public static double victoryFac(int[] AAA, int[] BBB) {
        HashMap<Integer, Integer> poke = new HashMap<>();
        int[] AB = Arrays.copyOf(AAA, 6);
        System.arraycopy(BBB, 0, AB, 3, 3);
        int ABdistance = AAA[0] + AAA[1] + AAA[2] - BBB[0] - BBB[1] - BBB[2];
        for (int i = 1; i <= 13; i++) {
            poke.put(i, 4);
        }

        for (int i = 0; i < 6; i++) {
            int value = poke.get(AB[i]) - 1;
            poke.put(AB[i], value);
        }

        for (int i = 1; i <= 13; i++) {
            System.out.println(poke.get(i));
        }

        //double allScene = (52 - 6) * (52 - 6 - 1);
        double allScene = (52 - 6) * (52 - 6 - 1);
        int victoryScene = 0;

        for (int i = 1; i <= 13; i++) {
            int iACount = poke.get(i);
            if (iACount >= 1) {
                int mayA = i;
                //poke.put(mayA, poke.get(mayA) - 1);

                for (int k = 1; k <= 13; k++) {
                    int iBCount = poke.get(k);
                    if(i==k)
                        iBCount=iBCount-1;
                        int mayB = k;
                        if (ABdistance + (mayA - mayB) >=1) {
                                victoryScene = victoryScene + iACount * iBCount;

                    }
                }


            }
        }

        return victoryScene/allScene;

    }

}
