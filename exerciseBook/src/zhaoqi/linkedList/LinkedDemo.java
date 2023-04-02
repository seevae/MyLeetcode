package linkedList;

import sun.java2d.DisposerTarget;

import java.util.Iterator;
import java.util.Stack;

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
     *
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

    @Override
    public void printLinkedEndToEnd(Node header) {
        if (header == null) {
            return;
        }
        recallLinked(header);
        Stack<String> stack = new Stack<>();
        Node p = header;
        while (p != null) {
            stack.push(p.value);
            p = p.next;
        }

        //遍历栈可以使用while循环+pop数据
        while (stack.size() != 0) {
            System.out.print(stack.pop() + " ");
        }

//        System.out.println("size:" + stack.size());  //记录的是栈中的所有数据的数量
//        System.out.println("capacity:" + stack.capacity()); //栈的总容量

//        //记录一种错误遍历stack的方式：使用stack.size作为循环条件，for循环中每次stack.pop，stack的大小都会减少一个
//        //所以最终不能正确打印完栈中的所有内容
//        for (int i = 0; i < stack.size(); i++) {
//            System.out.print(i+ "-");
//            System.out.print(stack.pop() + " ");
//        }

//        //记录：使用迭代器遍历stack，此时是从栈底到栈顶来读取数据的，因为stack的底层实现本质还是数组，所以迭代器会从下标为0处开始读取数据
//        //stack.pop()方法会读取数组的末尾元素，并从数组删除该元素
//        Iterator<String> iterator = stack.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
//        //stack.peek()方法读取数组末尾元素但是不删除

    }

    //补充使用回溯法从尾至头打印链表
    String[] res;

    public void recallLinked(Node header) {
        System.out.println("回溯法倒序打印链表,开始-------");
        backtrack(header, 0);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
        System.out.println("回溯法倒序打印链表,结束-------");
    }

    public int backtrack(Node node, int length) {
        if (node == null) {
            res = new String[length];
            return 0;
        }
        int index = backtrack(node.next, length + 1);
        res[index] = node.value;
        return index + 1;
    }

    @Override
    public Node mergeTwoOrderLinked(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        Node newHead = new Node("-1");

        Node p1 = l1;
        Node p2 = l2;
        Node p3 = newHead;

        while (p1 != null && p2 != null) {
            if (Integer.parseInt(p1.value) < Integer.parseInt(p2.value)) {
                p3.next = p1;
                p1 = p1.next;
                p3 = p3.next;
            } else {
                p3.next = p2;
                p2 = p2.next;
                p3 = p3.next;
            }
        }

        if (p2 == null) {
            p3.next = p1;
        } else if (p1 == null) {
            p3.next = p2;
        }

        return newHead.next;
    }
}

