package linkedList;

public class Test {
    public static void main(String[] args) {
        Node header = new Node("0");
        LinkedOperator linkedOperator = new LinkedDemo();
        linkedOperator.addEnd(header, "3");
        linkedOperator.addEnd(header, "3");
        linkedOperator.addEnd(header, "1");
        linkedOperator.addEnd(header, "2");
        linkedOperator.addEnd(header, "3");
        linkedOperator.addEnd(header, "3");
        linkedOperator.addEnd(header, "4");
        linkedOperator.addEnd(header, "5");
        linkedOperator.addEnd(header, "3");
        linkedOperator.addEnd(header, "8");
        linkedOperator.printLinked(header);
        System.out.println();
        Node testRe1 = linkedOperator.addFront(header, "head");
        linkedOperator.printLinked(testRe1);
        System.out.println();
        Node testRe2 = linkedOperator.deleteNodeByValue(header, "3");
        linkedOperator.printLinked(testRe2);
        Node testRe3 = linkedOperator.deleteNodeByIndex(header, 1);
        linkedOperator.printLinked(testRe3);

    }
}
