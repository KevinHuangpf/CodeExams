
import java.util.Scanner;
public class Main21 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(",");
        scanner.close();
        int[] intArr = new int[strings.length];
        //密码转换
        for(int i=0;i<strings.length;i++){
            switch (strings[i]){
                case "1":
                    intArr[i]=2;break;
                case "2":
                    intArr[i]=4;break;
                case "3":
                    intArr[i]=1;break;
                case "4":
                    intArr[i]=5;break;
                case "5":
                    intArr[i]=3;break;
                default: break;
            }
        }

        //转换密码输出
        for(int i=0;i<intArr.length-1;i++){
            System.out.print(intArr[i]+",");
        }
        System.out.print(intArr[intArr.length-1]);

        System.gc();

    }
}
