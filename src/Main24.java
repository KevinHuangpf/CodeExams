import java.util.Scanner;
public class Main24 {
    public static void main(String args[]){
        //输入
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int[][] array = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                //为了方便下面操作，自己到自己的距离设置为0
                array[i][j]=scanner.nextInt();
                if(i==j)
                    array[i][j]=0;
            }
        }
        //初始化结果矩阵
        int result = -1;

        for(int i=1;i<n-1;i++){
            result=DjRoute(array,p,i);
            System.out.print(result+",");
        }
        result=DjRoute(array,p,n-1);
        System.out.print(result);
    }

    public static int DjRoute(int[][] array, int source, int destination) {
        boolean[] indexLb = new boolean[array[0].length];
        int[] s = new int[array[0].length];
        int count = -1;
        int[] distance = array[source].clone();
        int index = source;
        int shortI = 0;

        s[++count] = index;
        indexLb[index] = true;

        while (count<array[0].length) {

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < distance.length; i++) {
                if (!indexLb[i] && distance[i] != -1 && i != index) {

                    if (distance[i] < min) {
                        min = distance[i];
                        index = i;
                    }
                }
            }
            if (index == destination) {
                break;
            }

            indexLb[index] = true;

            s[++count] = index;


            if (array[s[count - 1]][index] == -1 || shortI + array[s[count - 1]][index] > distance[index]) {
                shortI = distance[index];
            } else {
                shortI += array[s[count - 1]][index];
            }

            for (int i = 0; i < distance.length; i++) {


                if (distance[i] == -1 && array[index][i] != -1) {
                    distance[i] = shortI + array[index][i];
                }
                else if (array[index][i] != -1 && shortI + array[index][i] < distance[i])

                {

                    distance[i] = shortI + array[index][i];
                }

            }
        }

        return distance[destination] - distance[source];
    }

} 