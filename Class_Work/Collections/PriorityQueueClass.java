package Class_Work.Collections;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        System.out.println(pq);
        while(!pq.isEmpty())
        {
            int k = pq.poll();
            System.out.println(k);
        }

    }
}
