package CollectionFramework;

//using vector
import java.util.Vector;
import java.util.Iterator;
import java.util.Stack;

public class JavaCollection2 {
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();
        v.add("Hemanth");
        v.add("aot");
        v.add("got");
        v.add("sos");
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}


//using stack
class JavaCollection3 {
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("Hemanth");
        stack.push("AOT");
        stack.push("GOT");
        stack.push("SOS");
        stack.push("OXO");

        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}