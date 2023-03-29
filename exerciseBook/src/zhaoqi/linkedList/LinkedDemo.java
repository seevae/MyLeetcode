package zhaoqi.com.数据结构.链表;

public class LinkedDemo implements LinkedOperator {
    @Override
    public Node addEnd(Node header, String newValue) {
        Node p1 = header;
        Node newNode = new Node(newValue);
        while (p1.next != null){
            p1 = p1.next;
        }
        p1.next = newNode;
        return header;
    }

    @Override
    public Node addFront(Node header, String newValue) {
        Node p = header;
        Node newNode = new Node(newValue);
        newNode.next = header;
        return newNode;
    }

    @Override
    public Node delete(Node node) {
        return null;
    }

    @Override
    public Node reverse(Node node) {
        return null;
    }

    @Override
    public void printLinked(Node header) {
        Node p = header;
        while (p != null){
            System.out.print(p.value + " ");
            p = p.next;
        }
    }
}

