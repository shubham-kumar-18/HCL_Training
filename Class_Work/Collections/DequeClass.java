package Class_Work.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.peek());
        int k = stack.pop();
        System.out.println(k);
        stack.remove(30);
        System.out.println(stack);
        stack.offerLast(50);
        System.out.println(stack);
    }
}
