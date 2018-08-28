
import java.util.Scanner;
import java.util.Stack;

public class Main23 {
    public static void main(String args[]){
        //输入
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //将n个数依次入栈
        for(int i=0;i<n;i++){
            push(scanner.nextInt());
        }
        //执行一次出栈操作
        pop();
        System.out.println(max()+","+min());

    }

    //开辟3个stack分别存当前 数据值 最小值 最大值
    static Stack<Integer> dataStack =new Stack<>();
    static Stack<Integer> minStack = new Stack<>();
    static Stack<Integer> maxStack = new Stack<>();

    public static void push(int node) {

        //3个stack分别入

        //数据值
        dataStack.push(node);

        //最大值
        if(maxStack.isEmpty()||maxStack.peek()<=node)
            maxStack.push(node);
        else
            maxStack.push(maxStack.peek());

        //最小值
        if(minStack.isEmpty()||minStack.peek()>=node)
            minStack.push(node);
        else
            minStack.push(minStack.peek());

    }

    public static void pop() {
        //全部弹出
        dataStack.pop();
        minStack.pop();
        maxStack.pop();

    }

    public static int top() {
        //top值
        return dataStack.peek();

    }


    //最小
    public static int min() {
        return minStack.peek();

    }
    //最大
    public static int max(){
        return maxStack.peek();

    }

}
