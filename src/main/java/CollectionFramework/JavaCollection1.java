package CollectionFramework;

//using arraylist

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashSet;





class JavaCollection1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();

        list.add("Hemanth");
        list.add("GJHFHJS");
        list.add("jgfjgf");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}

//using linked list...
class main{
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<String>();
        al.add("Hemanth");
        al.add("iugehgbf");
        al.add("hkjefrjhg");
        Iterator itr=al.iterator();
        /*Traversing the list of elements in reverse order
            Iterator itr=al.descendingIterator();
         */

        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}


//using hashset...
//hashset does not take duplicates....
class HashSet2{
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Hemanth");
        set.add("Vijay");
        set.add("Hemanth");
        set.add("Ajay");
        //Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}



