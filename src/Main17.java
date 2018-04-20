import java.util.*;

public class Main17 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        //  -3 -4 -1 -131 3 123 12330 82 -3 -4 3 3 3 3 3
        String[] strings = scanner.nextLine().split(" ");

        //hashtable hashset 都可以

        HashMap<Integer,Integer> ht= new HashMap<>();
        //trans into int[]
        //get()读key得value

        for (int i = 0; i < strings.length; i++) {
            if(ht.containsKey(Integer.parseInt(strings[i])))
                ht.put(Integer.parseInt(strings[i]),ht.get(Integer.parseInt(strings[i]))+1);
            else
                ht.put(Integer.parseInt(strings[i]),1);
        }


/*        for(Map.Entry<Integer,Integer> e : ht.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());

        }*/

        //输出的其他的方式

        Integer maxNum = 0;
        Integer count = 0;
        Iterator iterator = ht.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());

            if((int) entry.getValue() >count) {
                maxNum = (Integer) entry.getKey();
                count = (Integer) entry.getValue();
            }
            System.out.println(maxNum +" "+ count);

        }




/*
        Object maxNum = 0;
        Object count = 0;
        Iterator iterator = ht.keySet().iterator();
        while (iterator.hasNext()){
            Object i= iterator.next();
            System.out.println(i+" "+ ht.get(i));
            if(ht.get(i)>(Integer) count) {
                maxNum = i;
                count = ht.get(i);
            }

        }
        System.out.println(maxNum +" "+ count);*/

/*        int maxNum = 0;
        int count = 0;
        for(int s:ht.keySet()){
            System.out.println(s +" "+ ht.get(s));
            if(ht.get(s)>count) {
                maxNum = s;
                count = ht.get(s);
            }
        }
        System.out.println(maxNum +" "+ count);
        */




    }


}
