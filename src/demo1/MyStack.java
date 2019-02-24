package demo1;

/**
 * @author xiaowu
 * @create 2019-02-14  13:49
 */
public class MyStack {
    //创建一个栈
    int elements[];

    //初始化栈
    public MyStack(){
        elements = new int[0];
    }

    //入栈
    public void push(int element) {
        //创建一个新的数组，长度为原数组长度加一
        int newArr[] = new int[elements.length + 1];
        //将原有数据放入新的数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //将要加入的元素放入到新的数组最后面
        newArr[elements.length] = element;
        //将新的数组赋给原数组
        elements = newArr;
    }

    //出栈
    public int pop(){
        if (elements.length == 0){
            throw new RuntimeException("栈空");
        }
        //取出栈中最后的一个元素
        int element = elements[elements.length-1];
        int[] newArr = new int[elements.length-1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i];
        }
        elements = newArr;
        return element;
    }

    //查看栈顶元素
    public int peek(){
        if (elements.length == 0){
            throw new RuntimeException("栈空");
        }
        return elements[elements.length-1];
    }

    //判断栈空
    public boolean isEmpty(){
        return elements.length==0;
    }

}
