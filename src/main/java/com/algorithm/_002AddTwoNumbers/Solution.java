package com.algorithm._002AddTwoNumbers;

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3;
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            if (l1.val + l2.val < 10) {
                //如果个位数之和小于10
                l3 = new ListNode(l1.val + l2.val);
                //递归调用
                l3.next = addTwoNumbers(l1.next, l2.next);
            } else {
                //个位数相加大于10，
                l3 = new ListNode(l1.val + l2.val - 10);
                //向前进加一，递归调用
                l3.next = addTwoNumbers(l1.next, addTwoNumbers(l2.next, new ListNode(1)));
            }
        }
        return l3;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
