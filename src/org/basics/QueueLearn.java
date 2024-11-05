package org.basics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLearn {
    public static void main(String[] args) {
       Queue<String> queue = new LinkedList<>();
       queue.add("Jason");
       queue.add("Mitchell");
       queue.add("Jessica");

        System.out.println("head = " + queue.poll());
        System.out.println("head1 = " + queue.poll());
        System.out.println("Queue = " + queue);

    }
}
