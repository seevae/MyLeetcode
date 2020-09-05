//请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
/**
输入：head = [4,5,1,9], node = 5
输出：[4,1,9]
解释：给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/delete-node-in-a-linked-list
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nodeNext = node.next;
        ListNode nodeNextNext = nodeNext.next;
        node.val = nodeNext.val;
        node.next = nodeNextNext;
        nodeNext.next = null;
    }
}

/**实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。

注意：本题相对原题稍作改动

示例：

输入： 1->2->3->4->5 和 k = 2
输出： 4

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci
**/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	//求长度法
    public int kthToLast(ListNode head, int k) {
        int length = 0;
        ListNode cur = head;
        ListNode cr = head;
        while(cr != null){
            length += 1;
            cr = cr.next;
        }
        int num = length - k;
        for(int i=0;i<num;i++){
            cur = cur.next;
        }
        return cur.next.val;	
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution 
	//双指针法：快慢指针。快指针先走出k的距离，然后再和慢指针一起走，
	//当快指针走到末尾时慢指针便走到了倒数k的位置
    public int kthToLast(ListNode head, int k) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        //快指针先走出k的距离
        for(int i=k;i>0;i--){
            cur2 = cur2.next;
        }
        while(cur2 != null){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }   
        return cur1.val;
    }
}




/**

输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

 

示例 1：

输入：head = [1,3,2]
输出：[2,3,1]
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
	//方法一：求链表长度+数组的方法
	//方法二：还可以借助栈：先进后出
    public int[] reversePrint(ListNode head) {
        int len = 0;
        ListNode cur = head;
        ListNode cur2 = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        int arr[] = new int[len];
        for(int i=len-1;i>=0;i--){
            arr[i] = cur2.val;
            cur2 = cur2.next;
        }
        return arr;
    }
}

/*
将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
示例：

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newhead = new ListNode();
        ListNode cur = newhead;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
            }else{
              cur.next = l2;
              l2 = l2.next;
              cur = cur.next;
            }
        }
        
        if(l1 == null){
            cur.next = l2;
        }

        if(l2 == null){
            cur.next = l1;
        }

        return newhead.next;
    }
}
