package linkedList;

public interface LinkedOperator {
    Node addEnd(Node header, String newValue);

    Node addFront(Node header, String newValue);

    void printLinked(Node header);

    Node deleteNodeByValue(Node header, String v);

    Node deleteNodeByIndex(Node header, int i);

    Node reverse(Node node);

    /**
     * The penultimate node in the linked list
     */
    Node reciprocalNode(Node header, int i);

    /**
     * Print a linked list from end to end
     */
    void printLinkedEndToEnd(Node header);

    Node mergeTwoOrderLinked(Node l1, Node l2);

    /**
     * Intersecting points of a linked list
     *
     * @param l1
     * @param l2
     * @return
     */
    Node intersectNode(Node l1, Node l2);
}
