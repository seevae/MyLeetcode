package linkedList;

public class LinkedDemo implements LinkedOperator {
    @Override
    public Node addEnd(Node header, String newValue) {
        Node p1 = header;
        Node newNode = new Node(newValue);
        while (p1.next != null) {
            p1 = p1.next;
        }
        p1.next = newNode;
        return header;
    }

    @Override
    public Node addFront(Node header, String newValue) {
        System.out.println("头插-->:" + newValue);
        Node p = header;
        Node newNode = new Node(newValue);
        newNode.next = header;
        return newNode;
    }

    @Override
    public Node reverse(Node header) {
        Node pre = null;
        Node cur = header;

        while (cur != null) {
            Node next = cur.next;

            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }

    /**
     * 反转链表记录一种错误的写法:看似正确，但是当传入的head为null时会出现空指针的异常!
     *
     * @param header class Solution {
     *               public ListNode reverseList(ListNode head) {
     *               ListNode pre = null;
     *               ListNode cur = head;
     *               <p>
     *               while (cur.next != null) {
     *               ListNode next = cur.next;
     *               <p>
     *               cur.next = pre;
     *               pre = cur;
     *               cur = next;
     *               }
     *               cur.next = pre;
     *               return cur;
     *               }
     *               }
     */


    @Override
    public void printLinked(Node header) {
        Node p = header;
        while (p != null) {
            System.out.print(p.value + " ");
            p = p.next;
        }
    }

    @Override
    public Node deleteNodeByValue(Node header, String v) {
        System.out.println("删除链表中值为" + v + "的节点后的结果");
        Node newHead = new Node("tmpHead");
        newHead.next = header;

        Node pre = newHead;
        Node cur = header;

        while (cur != null) {
            if (cur.value.equals(v)) {
                pre.next = cur.next;
                cur = pre.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        return newHead.next;
    }

    @Override
    public Node deleteNodeByIndex(Node header, int i) {
        System.out.println("删除下标为" + i + "的元素，此时header的值为:" + header.value);
        if (i == 0) {
            return header.next;
        }
        Node p = header;
        for (int n = 0; n < i - 1; n++) {
            p = p.next;
        }
        p.next = p.next.next;
        return header;
    }


    /**
     * 1. 先遍历一边获取链表长度，然后通过 len-i+1 正向取出目标节点
     * 2. 快慢指针：快指针先走i个单位，然后两个在一起走，当快指针到null时，慢指针指向的就是目标值
     * @param header
     * @param i
     * @return
     */
    @Override
    public Node reciprocalNode(Node header, int i) {
        System.out.println("倒数第" + i + "个节点");
        Node fast = header;
        Node slow = header;

        for (int n = 0; n < i; n++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }


}

