import java.util.Scanner;

public class Main15 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        System.out.print(findOnlyOne(strings));

    }

    public static int findOnlyOne(String[] strings) {
        int k =0;
        for(int i =0;i<strings.length;i++){
            k=k^Integer.parseInt(strings[i]);
        }
        return k;
    }
}
