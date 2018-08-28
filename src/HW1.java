import java.util.*;
public class HW1{
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        System.out.print(new HW1().reverse(sc.nextLine()));
    }

}
    //方法2
    public String reverse(String str){
        int begin=0;
        int end=0;
        char[] chars= str.toCharArray();
        //swap(chars,0,chars.length-1);
        for(int i=0;i<chars.length;i++){
            if(chars[i]==' '){
                end = i-1;
                swap(chars,begin,end);
                begin=i+1;
            }
        }
        swap(chars,begin,chars.length-1);
        return new String(chars);
    }



    public void swap(char[] chars,int begin,int end){
        while (begin<end){
            char temp = chars[begin];
            chars[begin] = chars[end];
            chars[end]=temp;
            begin++;

            end--;
        }


    }

    //方法1
    public  String reverse1(String sentence){
        String[] string = sentence.split(" ");

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<string.length;i--){
            sb.append(string[i]+" ");
        }

        return sb.toString().trim();
    }
}