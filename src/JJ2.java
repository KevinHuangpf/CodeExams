import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JJ2 {

    private static int IMAX = 10000000; //不连通状态



    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int[][] res;

        int _a_rows = 0;
        int _a_cols = 0;
        _a_rows = Integer.parseInt(in.nextLine().trim());
        _a_cols = Integer.parseInt(in.nextLine().trim());

        int[][] _a = new int[_a_rows][_a_cols];
        for(int _a_i=0; _a_i<_a_rows; _a_i++) {
            for(int _a_j=0; _a_j<_a_cols; _a_j++) {
                _a[_a_i][_a_j] = in.nextInt();

            }
        }

        if(in.hasNextLine()) {
            in.nextLine();
        }

        res = calculateMinDistance(_a);
        int res_rowLength = res.length;
        int res_colLength = res[0].length;
        for(int res_i=0; res_i < res_rowLength; res_i++) {
            for(int res_j=0; res_j < res_colLength; res_j++) {
                System.out.println(String.valueOf(res[res_i][res_j]) + " ");
            }
        }

    }

    /*请完成下面这个函数，实现题目要求的功能
当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
******************************开始写代码******************************/
    static int[][] calculateMinDistance(int[][] a) {
        int row = a.length;
        int col = a[0].length;
        int[][] res = new int[row][col];
        for(int res_i=0; res_i < row; res_i++) {
            for(int res_j=0; res_j < col; res_j++) {
                res[res_i][res_j]=reslove(a,res_i,res_j);
            }
        }
        return  res;


    }
    static int reslove(int[][] array,int start,int target) {

        boolean[] labelV = new boolean[array.length];

        int[] distance= new int[array.length];


        for(int i=0;i<array.length;i++)
        {
            labelV[i] = false;
            distance[i] = IMAX;
        }

        distance[start] = 0;
        labelV[start] = true;
        int labelUv = array.length;

        int indexArr = start;
        while(labelUv > 0 && indexArr != target) {
            int min = IMAX;
            for(int i=0;i<array.length;i++) {
                if(min > distance[i] && !labelV[i]) {
                    min = distance[i];
                    indexArr = i;
                }
            }

            for(int i=0;i<array.length;i++) {
                if(distance[indexArr] + array[indexArr][i] < distance[i]) {
                    distance[i] = distance[indexArr] + array[indexArr][i];
                }
            }

            labelUv--;
            labelV[indexArr] = true;
        }

        return distance[target];
    }
}








