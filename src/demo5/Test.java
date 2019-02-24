package demo5;

import javax.sound.midi.SoundbankResource;

/**
 * @author xiaowu
 * @create 2019-02-17  12:36
 */
public class Test {
    public static void main(String[] args) {
        Node node = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        //测试节点的追加
        node.append(node1);
        node.append(node2);
        node.append(node3);

        //测试显示所有节点
        node.show();
        System.out.println("-----------");

        //测试任意位置插入一个节点
        Node node4 = new Node(4);
        node2.insert(node4);
        node.show();
        //测试删除当前节点的下一个节点
        System.out.println("-----------");
        node2.removeNode();
        node.show();

    }
}
