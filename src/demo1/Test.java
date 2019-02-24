package demo1;

import java.util.Arrays;

/**
 * @author xiaowu
 * @create 2019-02-14  14:03
 */
public class Test {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println(Arrays.toString(myStack.elements));
        int pop = myStack.pop();
        System.out.println(pop);
        System.out.println(Arrays.toString(myStack.elements));
        int peek = myStack.peek();
        System.out.println(peek);

        boolean empty = myStack.isEmpty();
        System.out.println(empty);
    }
}
