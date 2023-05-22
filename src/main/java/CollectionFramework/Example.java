package CollectionFramework;



//sort array list....
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
public class Example  {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
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



//User-defined class objects in Java ArrayList
class ArrayList1{
    public static void main(String args[]){
        class Student{
            int rollno;
            String name;
            int age;
            Student(int rollno,String name,int age){
                this.rollno=rollno;
                this.name=name;
                this.age=age;
            }
        }
        //Creating user-defined class objects
        Student s1=new Student(101,"Levi",23);
        Student s2=new Student(102,"eren",21);
        Student s3=new Student(103,"erwin",25);
        //creating arraylist
        ArrayList<Student> al= new ArrayList<>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);


        /*.........to remove elements....
         al.remove("s2");
         al.remove(0);.........*/

        //Getting Iterator
        Iterator<Student> itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
