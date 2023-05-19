

//Generics using Map


package Generecs;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;


public class Generics1 {

        public static void main(String[] args){
            Map<Integer,String> map= new HashMap<>();
            map.put(1,"Hemanth");
            map.put(4,"Hemanthhhh");
            map.put(2,"Hemanthh");

//Now use Map.Entry for Set and Iterator
            Set<Map.Entry<Integer,String>> set=map.entrySet();

            Iterator<Map.Entry<Integer,String>> itr=set.iterator();
            while(itr.hasNext()){
                Map.Entry e=itr.next();//no need to typecast
                System.out.println(e.getKey()+" "+e.getValue());
            }

        }

}

//creating generic class


/*
class TestGenerics3{
public static void main(String args[]){
MyGen<Integer> m=new MyGen<Integer>();
m.add(2);
//m.add("vivek");//Compile time error
System.out.println(m.get());
}}
 */