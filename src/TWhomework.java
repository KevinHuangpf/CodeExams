import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;


/**
 * 3 3
 * 0,1 0,2;0,0 1,0;0,1 1,1;0,2 1,2;1,0 1,1;1,1 1,2;1,1 2,1;1,2 2,2;2,0 2,1
 *
 * */

public class TWhomework {
    /**
     *@version   V1.0
     *@function  主函数入口，进行调用其他函数
     *
     *@param：  输入连通性数组和初始的点阵
     *@return： 无返回值
     *
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //数字超出预定范围：数字超出了允许的范围
        try{
            int m = sc.nextInt();
            int n = sc.nextInt();
            //对输入的值进行限定
            if(m<0||n<0){
                System.out.println("Number out of range.");
                System.exit(0);
            }
            char[][] arrayOrigin = new char[2 * m + 1][2 * n + 1];
            for (int i = 0; i < 2 * m + 1; i++) {
                for (int j = 0; j < 2 * n + 1; j++) {
                    if (i % 2 != 0 && j % 2 != 0) {
                        arrayOrigin[i][j] = 'R';
                    } else
                        arrayOrigin[i][j] = 'W';
                }
            }


            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            String str = null;

            //无效的数字：输入的字符串无法正确的转换为数字
            try {
                str = stdin.readLine();
            } catch (IOException e) {
                System.out.println("Incorrect command format.");
                System.exit(0);
            }
            //调用方法
            String res = ceilMark(str,arrayOrigin);
            if(res=="Invalid number format."||res=="Number out of range."||res=="Incorrect command format."||res=="Maze format error.")
                System.out.println(res);
            else{
                int i=0;
                while(i<2*m+1){
                    System.out.println(res.substring((2*m+1)*(i)*4,(2*m+1)*(i+1)*4));
                    i++;
                }
            }
        }catch(Exception e){
            System.out.println("Incorrect command format.");
            System.exit(0);
        }
    }


    /**
     *@version   V1.0
     *@function  对ceil阵列进行连通性调整
     *@param：输入连通性数组和初始的点阵
     *@return：返回重新标记完成的2维ceil
     *
     * */
    public static String ceilMark(String str,char[][] arrayOrigin ){
        String regEx="\\d\\,\\d\\s\\d\\,\\d\\;?";
        boolean result= Pattern.compile(regEx).matcher(str).find();
        if(result==false){
            return "Incorrect command format.";
        }

        String[] strings = str.split("[,\\s;]");

        int[][] arrayInt = new int[strings.length / 4][4];

        if (strings.length % 4 == 0) {
            int count = 0;
            for (int i = 0; i < (strings.length/4); i++) {
                //无效的数字：输入的字符串无法正确的转换为数字
                try{
                    arrayInt[i][0] = Integer.parseInt(strings[count++]);
                    arrayInt[i][1] = Integer.parseInt(strings[count++]);
                    arrayInt[i][2] = Integer.parseInt(strings[count++]);
                    arrayInt[i][3] = Integer.parseInt(strings[count++]);
                    if(arrayInt[i][0]<0||arrayInt[i][1]<0||arrayInt[i][2]<0||arrayInt[i][3]<0)
                        return "Number out of range.";
                }
                catch(Exception e){
                    return "Invalid number format.";
                }
            }


            for (int i = 0; i < arrayInt.length ; i++) {
                int x =0;
                int y =0;
                if(arrayInt[i][0]==arrayInt[i][2]&&(arrayInt[i][1]-arrayInt[i][3]==1||-arrayInt[i][1]+arrayInt[i][3]==1)){
                    x=arrayInt[i][0]*2+1;
                    y=arrayInt[i][3]+arrayInt[i][1]+1;
                }else if(arrayInt[i][1]==arrayInt[i][3]&&(arrayInt[i][0]-arrayInt[i][2]==1||-arrayInt[i][0]+arrayInt[i][2]==1)){
                    y=arrayInt[i][1]*2+1;
                    x=arrayInt[i][2]+arrayInt[i][0]+1;
                }else{
                    //连通性错误：两个网格无法连通
                    return "Maze format error.";
                }
                arrayOrigin[x][y]='R';
            }
        }


        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < arrayOrigin.length; i++) {
            for (int j = 0; j < arrayOrigin[0].length; j++) {
                SB.append("["+arrayOrigin[i][j]+"] ");
            }

        }
        return SB.toString();
    }

}
