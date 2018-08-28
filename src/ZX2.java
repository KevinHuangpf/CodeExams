import java.util.ArrayList;
import java.util.List;

public class ZX2 {
    List<Integer> pizzOrder (int numOfOrder, int size, List<Integer> orders){
        ArrayList<Integer> list = new ArrayList<>();
        int start=0;
        int end = start +size-1;
        while (end<numOfOrder){
            int i= start;
            for (;i<=end;i++){
                if(orders.get(i) <0){
                    list.add(orders.get(i));
                    break;
                }
            }
            if(i>end)
                list.add(0);
            start++;
            end++;
        }
        return  list;
    }
}
