

/*
*

4 3
10 3 7 5

* */
import java.util.Arrays;
import java.util.Scanner;

public class ZJ2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n =sc.nextInt();

        int[] intArray=new int[m];
        for (int i = 0; i < m; i++) {
            intArray[i]=sc.nextInt();
        }
        int[] newArray=new int[m*n];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                newArray[i*m+j]=intArray[j];
            }

        }
        System.out.println(getLength(newArray));
    }


    public static int BinarySearchPosition(int arrayOut[],int left,int right,int key){

        int mid;

        if (arrayOut[right]<key) {
            return right+1;
        }else {
            while(left<right){
                mid=(left+right)/2;
                if (arrayOut[mid]<key) {
                    left=mid+1;
                }else {
                    right=mid;
                }
            }
            return left;
        }

    }

    public static int getLength(int[] arrayIn){

        int position;
        int len=1;

        int[] arrayOut=new int[arrayIn.length+1];
        arrayOut[1]=arrayIn[0];
        for (int i = 1; i < arrayIn.length; i++) {
            position=BinarySearchPosition(arrayOut, 1, len, arrayIn[i]);
            arrayOut[position]=arrayIn[i];
            if (len<position) {
                len=position;
            }
        }

        return len;
    }

}
