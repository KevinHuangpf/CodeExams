//jd
import java.util.Scanner;

public class Main6{
        public static void main(String[] args){
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();

            String str = Integer.toString(n);
            int[] intArray = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {

                Character ch = str.charAt(i);
                intArray[i] = Integer.parseInt(ch.toString());
            }
            quickSort(intArray);

            for(int i=0;i<intArray.length;i++)
            {
                System.out.print(intArray[i]);
            }


        }


    //quickSort
    public static void quickSort(int[] array){
        quickSort(array, 0,array.length-1);

    }

    //quickSortTemp

    public static int partition(int[] array, int low, int high){
        int i=low+1,j=high;
        int value = array[low];
        while(true){
            while(array[i]>=value){
                if(i==high) break;
                i++;
            }
            while(array[j]<=value){
                if(j==low) break;
                j--;
            }
            if(i>=j) break;
            swap(array,i,j);
        }

        swap(array,low,j);
//        for(int num : array)
//        {
//            System.out.print(num+" ");
//        }
//        System.out.println();
        return j;

    }

    public static void  quickSort(int[] array,int low, int high){
        if(high <= low) return;
        int j=partition(array, low, high);
        quickSort(array,low,j-1);
        quickSort(array,j+1,high);
    }

    //swap
    public static void swap(int array[],int a, int b){
        if(a != b){
            int temp = array [b];
            array[b] = array[a];
            array[a] = temp;
        }
    }

}
