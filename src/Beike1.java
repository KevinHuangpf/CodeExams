import java.util.ArrayList;


/**
*算法思想：判断去掉一个区间后集合时是否重叠，如果重叠，则不算一个方法，依次遍历去除
*
 */
public class Beike1 {


    //定义一个间隔对象
    public class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }


        public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
            // write your code here
            ArrayList<Interval> result = new ArrayList<>();
            //为上区间和下区间申请空间
            int shangbiao[] = new int[intervals.size() + 1];
            int xiabiao[] = new int[intervals.size() + 1];
            int t1 = 0;
            int t2 = 0;
            //这里的flag只说明新的区间只能被利用一次，防止下面的for循环中判断有误，导致上下区间一直赋值新的区间的值
            boolean flag1 = true;
            boolean flag2 = true;

            for (int i = 0; i < intervals.size(); ) {
                if (intervals.get(i).start > newInterval.start && flag1) {
                    shangbiao[t1++] = newInterval.start;
                    flag1 = false;
                } else {
                    shangbiao[t1++] = intervals.get(i++).start;
                }
            }
            for (int i = 0; i < intervals.size(); ) {
                if (intervals.get(i).end > newInterval.end && flag2) {
                    xiabiao[t2++] = newInterval.end;
                    flag2 = false;
                } else {
                    xiabiao[t2++] = intervals.get(i++).end;
                }
            }
            if (flag1) shangbiao[shangbiao.length - 1] = newInterval.start;//如果flag没有被改成false说明新的区间的值是最大的
            if (flag2) xiabiao[xiabiao.length - 1] = newInterval.end;
            //打印结果检验上下区间的值是否为有序序列
            for (int i : shangbiao) {
                System.out.print(i + " ");
            }
            System.out.println("");
            for (int i : xiabiao) {
                System.out.print(i + " ");
            }
            //定义栈结构
            int stack[] = new int[10000];
            int top = -1;
            int i = 0, j = 0;

            stack[++top] = shangbiao[i++];//初始化
            while (j < xiabiao.length) {
                if (i < shangbiao.length && shangbiao[i] <= xiabiao[j]) {
                    stack[++top] = shangbiao[i++];
                } else {
                    top--;
                    j++;
                    if (top == -1) //栈为空时，说明有一个区间
                    {
                        result.add(new Interval(stack[0], xiabiao[j - 1]));
                    }
                }
            }

            return result;
        }
    }
}