package zhaoqi.com.数据结构.链表;

public interface LinkedOperator {
    Node addEnd(Node header, String newValue);
    Node addFront(Node header, String newValue);
    void printLinked(Node header);
    Node delete(Node node);
    Node reverse(Node node);
}
