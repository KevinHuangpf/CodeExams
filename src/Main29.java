import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
sadxbyceabcss
ss
 */
public class Main29 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        char[] strings = scanner.nextLine().toCharArray();
        char[] keywords = scanner.nextLine().toCharArray();


        System.out.println(maxMatch(matchWords(keywords,strings),keywords));
    }

    public static ArrayList<Integer> matchWords(char[] keywords, char[] strings) {

        ArrayList<Integer> list = new ArrayList<>();

//        if (keywords == null || strings == null)
//            return null;

        int i = 0, j = 0;
        while (i < strings.length) {
            if (strings[i] == keywords[j]) {
                list.add(i);
                j++;
                i++;
                System.out.println(i);
            } else {
                i++;
            }
            if (j == keywords.length)
                j = 0;
        }

        return list;
    }


    public static int maxMatch(ArrayList<Integer> list, char[] keywords) {
        int[] groupScore = new int[list.size() / keywords.length];
        if(groupScore.length==0)
        return  0;

        for (int i = 0; i < groupScore.length; i++) {
            int sum = 0;
            for (int j = keywords.length - 1; j > 0; j--) {
                sum += list.get(i * keywords.length + j) - list.get(i * keywords.length + j - 1)-1;
            }
            groupScore[i] = 100 - sum;
        }
        Arrays.sort(groupScore);
        return  groupScore[groupScore.length-1];

    }

}
