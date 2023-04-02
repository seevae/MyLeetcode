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
//        System.out.println();
//        Node testRe1 = linkedOperator.addFront(header, "head");
//        linkedOperator.printLinked(testRe1);
//        System.out.println();
//        Node testRe2 = linkedOperator.deleteNodeByValue(header, "3");
//        linkedOperator.printLinked(testRe2);
//        Node testRe3 = linkedOperator.deleteNodeByIndex(header, 1);
//        linkedOperator.printLinked(testRe3);
//        System.out.println();
//        System.out.println("-----反转链表前-----");
//        linkedOperator.printLinked(header);
//        System.out.println();
//        Node reverseHeader = linkedOperator.reverse(header);
//        System.out.println("-----反转链表后-----");
//        linkedOperator.printLinked(reverseHeader);
//
//
//        System.out.println();
//        System.out.println("获取倒数第n个节点");
//        Node node = linkedOperator.reciprocalNode(reverseHeader, 1);
//        System.out.println(node.value);

        System.out.println();
        linkedOperator.printLinkedEndToEnd(header);

    }
}
