package demo;

/**
 * @author xiaowu
 * @create 2019-02-14  12:04
 */
public class Node {

    int data;

    Node next;

    public Node(int val){
        this.data = val;
    }

    //节点的追加
    public void append(Node node){
        this.next = node;
    }

    public void show(){
        while (true){
            System.out.println(this.data);
            if (this.next == null){
                break;
            }
        }
    }


}
