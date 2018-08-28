import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> hashMap = new HashMap<String,Integer>();
        //Map<String, Integer> hashMap=new LinkedHashMap<String, Integer>();

        while (sc.hasNext()){


            String str=sc.next();
            int linenum=sc.nextInt();
            String[] arr=str.split("\\\\");  //根据\切割
            String s=arr[arr.length-1];
            if(s.length()>16)  //截取
                s=s.substring(s.length()-16);
            String key=s+" "+linenum;
            int value=1;
            if(hashMap.containsKey(key))
                hashMap.put(key, hashMap.get(key)+1);
            else {
                hashMap.put(key, value);
            }

/*            String string = sc.next();
            int lineNumber = sc.nextInt();
            String[] strings = string.split("\\\\");
            String s = strings[strings.length-1];
            if(s.length()>16)
                s=s.substring(s.length()-16);

            String key = s+" "+lineNumber;
            if(hashMap.containsKey(s))
                hashMap.put(key,hashMap.get(key)+1);
            else
                hashMap.put(key,1);*/

        }

/*        int count=0;
        for (String s: hashMap.keySet()){
            if(count>=hashMap.size()-8)
                System.out.println(s+" "+hashMap.get(s));
            count++;
        }*/


        int count=0;
        for(String string:hashMap.keySet()){
            count++;
            if(count>(hashMap.keySet().size()-8)) //输出最后八个记录
                System.out.println(string+" "+hashMap.get(string));
        }

    }


}
