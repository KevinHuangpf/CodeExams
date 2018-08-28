import java.util.ArrayList;
import java.util.Scanner;

public class Main27 {

    static long codeLines = 0;
    static long commentLines = 0;
    static long blankLines = 0;

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<String>();

        int i=0;
        while(i<10){
            String temp = scanner.nextLine();
            if(temp!=null)
                strings.add(scanner.nextLine());
            else
                strings.add("");
            i++;
        }

        operateNote(strings);
        //System.out.println("codeLines="+codeLines+" "+"commentLines="+commentLines+"blankLines="+blankLines);
        System.out.println(commentLines);

    }


    public static void operateNote(ArrayList<String> list) {
        boolean flag = false;
        String line = "";
        int i=0;
        while (i<list.size()&&(line = list.get(i)) != null) {
            line = line.trim();
            if (line.matches("^[ ]*$")) {
                blankLines++;
            } else if (line.startsWith("//")) {
                commentLines++;
            } else if (line.startsWith("/*") && !line.endsWith("*/")) {
                commentLines++;
                flag = true;
            } else if (line.startsWith("/*") && line.endsWith("*/")) {
                commentLines++;
            } else if (flag == true) {
                commentLines++;
                if (line.endsWith("*/")) {
                    flag = false;
                }
            } else {
                codeLines++;
            }
            i++;
        }



    }



}
