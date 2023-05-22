package CollectionFramework;

//using priority queue...

import java.util.Deque;
import java.util.ArrayDeque;


import java.util.PriorityQueue;
import java.util.Iterator;
 class CollectionFramework3 {
     public static void main(String[] args) {
         PriorityQueue<String> queue = new PriorityQueue<String>();
         queue.add("weqr oqiw");
         queue.add("kwjgf");
         queue.add("kjgf");
         queue.add("kwjh");
         System.out.println("head:" + queue.element());
         System.out.println("head:" + queue.peek());
         System.out.println("iterating the queue elements:");
         Iterator itr = queue.iterator();
         while (itr.hasNext()) {
             System.out.println(itr.next());

         }
         queue.remove();
         queue.poll();//removes front of element
         System.out.println("after removing two elements:");
         Iterator<String> itr2 = queue.iterator();
         while (itr2.hasNext()) {
             System.out.println(itr2.next());
         }
     }
 }



//ArrayDeque



 class JavaCollection {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Hemanth");
        deque.add("Arun");
        deque.add("Ajay");
        //Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}


