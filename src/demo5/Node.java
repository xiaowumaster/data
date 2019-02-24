package demo5;

/**
 * @author xiaowu
 * @create 2019-02-15  19:36
 */
public class Node {
    //节点数据
    int data;
    //节点指向的下一个节点
    Node next;

    public Node(int data){
        this.data = data;
    }

    //增加节点
    public Node append(Node node) {
        //当前节点
        Node currentNode = this;
        while (true) {
            //取出下一个节点
            Node nextNode = currentNode.next;
            //如果下一个节点为null，即当前节点为最后一个节点
            if (nextNode == null) {
                break;
            }
            currentNode = nextNode;
        }
        //把需要追加的节点追加为当前节点的下一个节点
        currentNode.next = node;
        return this;
    }

    //获取下一个节点
    public Node getNext() {
        return this.next;
    }

    //获取节点的数据
    public int getData() {
        return this.data;
    }

    //判断当前节点是否是最后一个节点
    public boolean isLast() {
        return this.next == null;
    }

    //显示所有节点的信息
    public void show() {
        Node currentNode = this;
        while (true) {
            //显示当前节点
            System.out.print(currentNode.data + " ");
            //取出下一个节点
            currentNode = currentNode.next;
            //判断当前节点是否是最后一节点
            if (currentNode == null) {
                break;
            }
        }
    }

    //插入一个节点
    public void insert(Node node) {
        //取出下一个节点
        Node newNode = next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //然后把新节点的下一个新节点的下一个节点设为取出的那个节点
        node.next = newNode;
    }

    //删除下一个节点
    public void removeNode() {
        //取出下下一个节点
        Node nextNext = this.next.next;
        //将下下一个节点作为当前节点的下一个节点
        this.next = nextNext;
    }

}
