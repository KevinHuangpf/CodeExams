import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainB7{
    //测试代码
    public static void main(String[] args) {
        Set<Set<Integer>> set1 = new HashSet<>();
        Set<Set<Integer>> set2 = new HashSet<>();
        Set<Integer> setIn1 = new HashSet<>();
        setIn1.add(1);
        setIn1.add(5);
        Set<Integer> setIn2 = new HashSet<>();
        setIn2.add(11);
        setIn2.add(15);
        Set<Integer> setIn3 = new HashSet<>();
        setIn3.add(3);
        setIn3.add(12);
        set1.add(setIn1);
        set1.add(setIn2);
        set2.add(setIn3);
//		System.out.println(set1);
//		System.out.println(set2);
        Set<Set<Integer>> result = new MainB7().getIn(set1, set2);
        System.out.println(result);
    }

    //求一个Set集合中的最大值
    public Integer getMax(Set<Integer> setTemp) {
        Integer temp = null;
        for(Iterator<Integer> i = setTemp.iterator(); i.hasNext();) {
            if (temp != null) {
                Integer now = i.next();
                return max(temp, now);
            } else {
                temp = i.next();
            }
        }
        return null;
    }
    //求一个Set集合中的最小值
    public Integer getMin(Set<Integer> setTemp) {
        Integer temp = null;
        for(Iterator<Integer> i = setTemp.iterator(); i.hasNext();) {
            if (temp != null) {
                Integer now = i.next();
                return min(temp, now);
            } else {
                temp = i.next();
            }
        }
        return null;
    }

    //输入两个数比较最大值或者最小值
    public int min(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
    public int max(int a, int b) {
            if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    //嵌套集合中的最大值和最小值，Object参数是为了重载方法
    public int getMax(Set<Set<Integer>> set,Object o) {
        Integer temp = null;
        for (Iterator<Set<Integer>> i = set.iterator(); i.hasNext();) {
            Set<Integer> now = i.next();
            if(temp == null) {
                temp = getMax(now);
            } else {
                if (temp > getMax(now)) {
                    break;
                } else {
                    temp = getMax(now);
                }
            }
        }
        return temp;
    }
    public int getMin(Set<Set<Integer>> set,Object o) {
        Integer temp = null;
        for (Iterator<Set<Integer>> i = set.iterator(); i.hasNext();) {
            Set<Integer> now = i.next();
            if(temp == null) {
                temp = getMin(now);
            } else {
                if (temp < getMin(now)) {
                    break;
                } else {
                    temp = getMin(now);
                }
            }
        }
        return temp;
    }

    //判断一个数是不是在一个区间内
    public boolean isRange(Set<Set<Integer>> set, Integer target, Object o) {
        boolean flag = false;
        for (Iterator<Set<Integer>> i = set.iterator(); i.hasNext();) {
//			System.out.println(set+"---"+flag+"---"+target);
            Set<Integer> s = i.next();
/*            if (isRange(s,target)) {
                flag = true;
            }*/
        }
        return flag;
    }



    //遍历获取最终结果
    public Set<Set<Integer>> getIn(Set<Set<Integer>> set1, Set<Set<Integer>> set2) {
        Set<Set<Integer>> result = new HashSet<>();
        Integer min = null;
        Integer max = null;
        int minSet1 = getMin(set1,new Object());
        int minSet2 = getMin(set2,new Object());
        int maxSet1 = getMax(set1,new Object());
        int maxSet2 = getMax(set2,new Object());
        min = min(minSet1, minSet2);
        max = max(maxSet1, maxSet2);

        Integer minResult = null;
        Integer maxResult = null;
        //已经有了最大值和最小值有了遍历范围，我们每次都要遍历所有的集合得出当前值是否属于该集合
        boolean flag = false;
        for(int i = min; i <= max; i++) {
//			System.out.println(i + "set1=" +isRange(set1,i,new Object())+ ";set2=" + isRange(set2,i,new Object()));
            if (isRange(set1,i,new Object()) && isRange(set2,i,new Object())) {
                if(!flag) {
                    minResult = i;
                }

                flag = true;
            } else {
                if (flag) {
                    maxResult = i;
                    flag = false;
                    Set<Integer> set = new HashSet<>();
                    set.add(minResult);
                    set.add(maxResult);
                    result.add(set);
                }
            }
        }
        return result;
    }


}