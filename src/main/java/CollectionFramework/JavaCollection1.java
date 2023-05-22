package CollectionFramework;

//using arraylist

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;




class JavaCollection1 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();


        list.add("Hemanth");
        list.add("GJHFHJS");
        list.add("jgfjgf");
        Iterator itr=list.iterator();
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
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}




