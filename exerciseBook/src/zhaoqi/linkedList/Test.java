package zhaoqi.com.数据结构.链表;

public class Test {
    public static void main(String[] args) {
        Node header = new Node("numbers:");
        LinkedOperator linkedOperator = new LinkedDemo();
        linkedOperator.addEnd(header,"1");
        linkedOperator.addEnd(header,"2");
        linkedOperator.addEnd(header,"3");
        linkedOperator.addEnd(header,"4");
        linkedOperator.addEnd(header,"5");
        Node node = linkedOperator.addFront(header,"head");
        linkedOperator.printLinked(node);
    }
}
