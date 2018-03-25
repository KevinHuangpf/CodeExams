// 腾讯暑假实习在线笔编程试模拟试题-正方形判断

import java.util.*;

public class Main1 {
	public static void main(String args[]){
		//输入
		Scanner in = new Scanner(System.in);
		int nGroup = in.nextInt();
		int[][] coordinate = new int[2*nGroup][4]; 
		while(in.hasNext()){
			for(int i=0;i<2*nGroup;i++){
				for(int j=0;j<4;j++){
					coordinate[i][j]=in.nextInt();
				}
			}
			break;
		}
		in.close();
		
		//分组输出判断
		
		for(int k=0;k<2*nGroup;k++,k++){
			int tempXY[][] = new int[2][4];			
			for(int l=0;l<4;l++){
				tempXY[0][l] = coordinate[k][l];
				tempXY[1][l] = coordinate[k+1][l];
			}
			System.out.println(isSquare(tempXY));		
		}
	     										
	}
		
	//判断正方形
	private static  String isSquare(int[][] xy){
	
		int[] x = xy[0];
		int[] y = xy[1];
		
		double[] length = new double[6];
		int m=0;
		for(int i=0;i<3;i++)
			for(int j=i+1;j<=3;j++){
				length[m++]=  Math.pow(x[i]-x[j],2.0) + Math.pow(y[i]-y[j],2.0);
			}
		Arrays.sort(length);
		
		//点非重合
		boolean b1= length[0]>0&&length[1]>0&&length[2]>0&&length[3]>0&&length[4]>0&&length[5]>0;
		
		//四边相等
		boolean b2=length[0]-length[1]<0.0001&&length[1]-length[2]<0.0001;
		
		//对角线相等
		boolean b3=length[2]-length[3]<0.0001&&length[4]-length[5]<0.0001;
		if(b1&&b2&&b3)
			return "YES";
		return "NO";
			
		
	}

}
