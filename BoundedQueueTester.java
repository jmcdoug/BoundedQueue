/**
 * BoundedQueueTester.java
 * Tests the functionality of BoundedQueue.java
 *
 * 
 * @author John McDougall
 * @version 2014/10/11
 */

public class BoundedQueueTester
{
    public static void main(String[] args) 
    {
        BoundedQueue q = new BoundedQueue(10);
        
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Enqueue 1: " + q.enqueue(1));
        System.out.println("Enqueue 2: " + q.enqueue(2));
        System.out.println("Enqueue 3: " + q.enqueue(3));
        System.out.println("Enqueue 4: " + q.enqueue(4));
        System.out.println("Enqueue 5: " + q.enqueue(5));
        System.out.println("Enqueue 6: " + q.enqueue(6));
        System.out.println("Enqueue 7: " + q.enqueue(7));
        System.out.println("Enqueue 8: " + q.enqueue(8));
        System.out.println("Enqueue 9: " + q.enqueue(9));
        System.out.println("Enqueue 10: " + q.enqueue(10));
        System.out.println(q.toString());
        System.out.println("Enqueue 11: " + q.enqueue(11));
        System.out.println("Enqueue 12: " + q.enqueue(12));
        System.out.println(q.toString());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.toString());
        System.out.println("Enqueue 1: " + q.enqueue(1));
        System.out.println("Enqueue 2: " + q.enqueue(2));
        System.out.println("Enqueue 3: " + q.enqueue(3));
        System.out.println("Enqueue 4: " + q.enqueue(4));
        System.out.println(q.toString());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println(q.toString());
        System.out.println("Enqueue 11: " + q.enqueue(11));
        System.out.println("Enqueue 12: " + q.enqueue(12));
        System.out.println("Enqueue 13: " + q.enqueue(13));
        System.out.println("Enqueue 14: " + q.enqueue(14));
        System.out.println("Enqueue 15: " + q.enqueue(15));
        
        System.out.println(q.toString());
    }
}
