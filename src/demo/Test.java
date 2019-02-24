package demo;

/**
 * @author xiaowu
 * @create 2019-02-14  13:12
 */
public class Test {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        node.append(node1);
        node.show();
    }
}
