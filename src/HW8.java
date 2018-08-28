import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HW8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            Map<Integer,Integer> tm= new TreeMap<Integer,Integer>();
            for (int i = 0; i < n; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if(tm.containsKey(key)){
                    tm.put(key,tm.get(key)+value);
                }else
                    tm.put(key,value);
            }
            for (int key:tm.keySet()){
                System.out.println(key+" "+tm.get(key));
            }

        }


    }
}
