import java.util.Scanner;

public class Main33 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();


        int[][] mIO= new int[n][2];

        for(int i =0;i<n;i++){
            mIO[i][0]=scanner.nextInt();
            mIO[i][1]=scanner.nextInt();
        }
        System.out.println(earnings(n,m,mIO));


    }

    public static int  earnings(int n, int m, int mIO[][]){
        int dp[] =new int[1005];
        for(int i = 1; i <= m; i++)
            dp[i] = i;
        for(int i= 1;i<n;i++){
            for(int j=mIO[i][0];j<=m;j++)
                dp[j]= max(dp[j],dp[j-mIO[i][0]]+mIO[i][1]);
        }
        return dp[m]-m;

    }

    public static int max(int a, int b){
        if(a>b)
            return a;
        else
            return b;
    }

}
