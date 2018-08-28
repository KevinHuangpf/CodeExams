import java.util.Scanner;

public class MainWY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ai= new int[n];
        for(int i=0;i<n;i++){
            ai[i]=sc.nextInt();

        }

        int m = sc.nextInt();
        int[] qi= new int[m];
        for(int i=0;i<m;i++){
            qi[i]=sc.nextInt();
        }

        int[] array = new int[n];
        int sum=0;
        for(int i = 0;i<n;i++){
            sum +=ai[i];
            array[i]= sum;
        }

        System.out.print(binarySearch(array,13));

/*        for(int i=0;i<m;i++){
            System.out.print(bSearch(array,binarySearch(array,qi[i]))+1+" ");
        }*/

    }


    public static int bSearch(int[] array,int key){
        int low = 0;
        int high = array.length -1;
        int mid;
        while(low <= high){
            mid = (low + high)/2;
            if(array[mid] == key){
                return mid;
            }
            if(array[mid] > key){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }


    /**
     * 输出大于该值的最小值
     * */
    public static int binarySearch(int[] a,int value) {
        int start = 0;
        int end = a.length - 1;
        int mid =0 ;
        if(value<=a[start])
            return a[start];
        while (start <= end) {
            mid = (start + end) / 2;
            if (a[mid] == value) {
                return a[mid];
            } else if (a[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if(value >a[a.length-1]){
            return a[mid-1];
        }else if(a[0]<value && value<a[a.length-1]){
            return a[mid];
        }else {
            return value;
        }
    }
}
