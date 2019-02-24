package demo5;

/**
 * @author xiaowu
 * @create 2019-02-17  13:04
 */
public class LoopNode {
    //节点的数据
    int data;
    //节点的指向
    LoopNode nextLoopNode = this;

    public LoopNode(int data) {
        this.data = data;
    }

    //插入一个节点
    public void insert(LoopNode node) {
        //取出下一个节点作为下下一个节点
        LoopNode nextNext = nextLoopNode;
        //将新节点作为当前节点的下一个节点
        this.nextLoopNode = node;
        //将取出的节点作为新节点的下一个节点
        node.nextLoopNode = nextNext;
    }

    //删除下一个节点
    public void removeNext() {
        //将下下一个节点取出来
        LoopNode newNode = nextLoopNode.nextLoopNode;
        //将取出的节点作为当前节点的下一个节点
        this.nextLoopNode = newNode;
    }

    //获取下一个节点
    public LoopNode getNextLoopNode() {
        return this.nextLoopNode;
    }

    //获取节点的数据
    public int getData() {
        return this.data;
    }
}
