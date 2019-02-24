package demo4;

/**
 * @author xiaowu
 * @create 2019-02-15  13:15
 */
public class MyQueue {
    int elements[];

    public MyQueue() {
        elements = new int[0];
    }

    //入队
    public int add(int element) {
        //创建一个新的数组
        int newArr[] = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
        return element;
    }

    //出队
    public int poll(){
        //创建一个新的数组
        int[] newArr = new int[elements.length - 1];
        int element = elements[0];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i + 1];
        }
        elements = newArr;
        return element;
    }

    //判断队列是否为空
    public boolean isEmpty() {
        return elements.length == 0;
    }
}
