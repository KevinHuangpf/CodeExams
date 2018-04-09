import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//lianjiaWeb
public class Main5 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Set<Integer> set = new HashSet<Integer>();
        int n=scanner.nextInt();
        int cmp=0;
        while (scanner.hasNext()) {
            int m=scanner.nextInt();

            for(int i =1;i<=m;i++)
            set.add(scanner.nextInt());

            cmp++;
            if(cmp==n)
                break;

            }


        System.out.println(set.size());

        System.out.println("output:");

        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+",");
        }

    }

}
