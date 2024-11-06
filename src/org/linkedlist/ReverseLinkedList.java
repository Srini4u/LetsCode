package org.linkedlist;

import java.util.Arrays;

public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;


        while(current != null){
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedLinkedList = reverseList(head);

        while (reversedLinkedList != null) {
            System.out.println(reversedLinkedList.val + "->" );
            reversedLinkedList = reversedLinkedList.next;
        }

    }

}
