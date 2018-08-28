import java.util.*;
import  java.util.Collection;
public class MS {

    public static void main(String[] args) {
        List<String> a=new LinkedList<>();
        List<String> b=new LinkedList<>();
        a.add("hello");
        b.add("a");

        commonSubstring(a,b);

        List<Integer> c=new LinkedList<>();
        c.add(4);
        c.add(1);

        System.out.println(countDuplicates(c));
    }
    static void commonSubstring(List<String> a, List<String> b) {

        String aS="";
        String bS="";
        if(a!=null&&b!=null) {
            for(int k=0;k<a.size();k++) {
                aS = a.get(k);
                bS = b.get(k);
                boolean flag = false;
                for (int i = 0; i < aS.length(); i++) {
                    for (int j = 0; j < bS.length(); j++) {
                        if (aS.charAt(i) == bS.charAt(j)) {
                            System.out.println("YES");
                            flag = true;
                            break;
                        }
                    }
                    if (flag == true)
                        break;
                }
                if (flag == false)
                    System.out.println("NO");
            }

        }else
            System.out.println("NO");




    }

    static int countDuplicates(List<Integer> numbers) {

        int[] arr = new int[10000];

        int cout =0;
        for (int i = 0; i <numbers.size() ; i++) {
            if(arr[numbers.get(i)]==1) {
                cout++;
                arr[numbers.get(i)]=2;
            }
            if(arr[numbers.get(i)]==0) {
                arr[numbers.get(i)] = 1;
            }

        }


        return cout;

    }


}
