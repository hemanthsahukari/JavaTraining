package CollectionFramework;
//to add and remove
import java.util.LinkedList;
class ExampleLinkedList {
    public static void main(String args[])
    {
        // Creating object of the
        // class linked list

        LinkedList<String> ll = new LinkedList<>();

            // Adding elements to the linked list
            ll.add("A");
            ll.add("B");
            ll.addLast("C");
            ll.addFirst("D");
            ll.add(0, "E");

            System.out.println(ll);

            ll.remove("B");
            ll.remove(3);
            ll.removeFirst();
            ll.removeLast();

            System.out.println(ll);
        }
    }





    //Linked list to To Array by using  toArray()....
class Example2 {
    public static void main(String[] args)
    {
        LinkedList<Integer> list= new LinkedList<Integer>();
        list.add(123);
        list.add(12);
        list.add(11);
        list.add(1134);

        //System.out.println(list.removeLast());
        //System.out.println(list.removeFirst());
       // list.remove(3); to remove...




        System.out.println("LinkedList: "+ list);
        Object[] a = list.toArray();
        System.out.print("After converted LinkedList to Array: ");
        for(Object element : a)
            System.out.print(element+" ");
    }
}


//
// Java code to demonstrate the working
// of peek() in LinkedList

 class LinkedPeek1 {

    public static void main(String[] args)
    {
        // declaring a LinkedList
        LinkedList<Integer> list = new LinkedList<Integer>();

        // adding elements
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(8);

        // printing the list
        System.out.println("The initial list is :" + list);

        // peek at the head of the list
        // Prints 1st element, "Geeks"
        System.out.println("Head of the list : " + list.peek());
    }
}
