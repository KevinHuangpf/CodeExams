import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainB1 {


    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i=0;i<m;i++) {
            String s = sc.next();
            if (s != null &&!s.equals("")) {

                String[] strings = s.split(";");
                for (int j = 0; j < strings.length; j++) {

                        String[] strings1 = strings[j].split(",");
                        for (int k = 0; k < strings1.length; k++) {
                            long temp = Long.parseLong(strings1[k]);
                            list.add(temp);
                        }

                }
            }
        }

        reCh(list,0);
        long[] d = new long[list.size()];
        for(int i = 0;i<list.size();i++){
            d[i] = list.get(i);
        }

        for(int i=0;i<d.length-2;i=i+2){
            System.out.print(d[i]+","+d[i+1]+";");
        }
        System.out.print(d[d.length-2]+","+d[d.length-1]);


    }

    public static void reCh(List<Long> list,int index){

        int i=index;
        boolean isbreak=false;
        for(;i<list.size()-2;i+=2){
            if(isbreak){i-=2;break;}
            Long   start  =list.get(i);    Long   end  =list.get(i+1);
            for(int j=i+2;j<list.size();j+=2){

                Long nextstart=list.get(j);  Long nextend=list.get(j+1);
                if(start>nextend || end<nextstart){continue;}

                if(start>nextstart){

                    if(end>=nextend){
                        list.set(i,nextstart);
                        list.remove(j); list.remove(j);
                        isbreak=true;
                        break;
                    }else{

                        list.set(i,nextstart);  list.set(i+1,nextend);
                        list.remove(j); list.remove(j);
                        isbreak=true;
                        break;
                    }
                }else{

                    if(end>=nextend){
                        list.remove(j); list.remove(j);
                        isbreak=true;
                        break;
                    }else{

                        list.set(i+1,nextend);
                        list.remove(j); list.remove(j);
                        isbreak=true;
                        break;
                    }
                }
            }


        }
        if(i==list.size()-2){return;}
        reCh(list,i);
    }



}



