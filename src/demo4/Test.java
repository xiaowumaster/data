package demo4;

import java.util.Arrays;

/**
 * @author xiaowu
 * @create 2019-02-15  18:20
 */
public class Test {
    public static void main(String[] args) {

        //入队测试
        MyQueue myQueue = new MyQueue();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(50);
        System.out.println(Arrays.toString(myQueue.elements));
        //出队测试
        myQueue.poll();
        System.out.println(Arrays.toString(myQueue.elements));
        //栈空测试
        System.out.println(myQueue.isEmpty());
    }
}
