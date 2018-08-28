import java.util.*;

public class main123 {
    public static void main123(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int a_num = scanner.nextInt();
            int z_num = scanner.nextInt();
            int index = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<a_num;i++)
                sb.append("a");
            for(int i=0;i<z_num;i++)
                sb.append("z");
            System.out.println(permute(sb.toString(),index-1));
        }
        scanner.close();
    }

    public static String permute(String s,int index){
        int len = s.length();
        Set<String> set = new TreeSet<>();
        permutation(s.toCharArray(),0,len-1,set);
        List<String> list = new ArrayList<>(set);
        if(index>=list.size())
            return "-1";
        return list.get(index);
    }
    public static void permutation(char[] arr,int from,int to,Set<String> set){
        if(to<0)
            return ;
        if(from==to){
            set.add(new String(arr));
        }else{
            for(int i=from;i<=to;i++){
                swap(arr,i,from);
                permutation(arr,from+1,to,set);
                swap(arr,i,from);
            }
        }
    }
    public static void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
