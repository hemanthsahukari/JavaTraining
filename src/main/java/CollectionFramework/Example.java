package CollectionFramework;



//sort array list....
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class Example  {
    public static void main(String args[]) {
        List<String> list1 = new ArrayList<String>();
        list1.add("hemanth");
        list1.add("Jaya");
        list1.add("shiva");
        list1.add("Vaibhav");
        //Sorting the list
        Collections.sort(list1);
        //Traversing list through the for-each loop
        for (String names : list1)
            System.out.println(names);


        System.out.println("Sorting numbers...");
        //Creating a list of numbers
        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(100);
        list2.add(33);
        list2.add(51);
        list2.add(1);
        //Sorting the list
        Collections.sort(list2);
        //Traversing list through the for-each loop
        for (Integer number : list2)
            System.out.println(number);

    }
}

