import java.util.Scanner;

public class Main20 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        int x = scanner.nextInt();
        scanner.close();

        //转换为Int
        int[] intArr = new int[strings.length];
        for(int i=0;i<strings.length;i++){
            intArr[i]=Integer.parseInt(strings[i]);
        }

        System.out.print(findX(intArr,x));
    }

    static int findX(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;
        int middle = (low+high)/2;
        //定义可能值
        int maybeX = 0;
        //A的所有都小于x
        if(key > arr[high])
            return arr.length;
        while(low <= high){
            middle = (low + high) / 2;
            if(arr[middle] > key){
                //关键字在左
                high = middle - 1;
                maybeX = middle;
            }else if(arr[middle] < key){
                //关键字在右
                low = middle + 1;
                maybeX = middle;
            }else{
                return middle;
            }
        }
        //最后仍然没有找到 返回最近的大的
        return maybeX;
    }

}
