package MultiThreading;


public class ThreadDemo {
    public static void main(String[] args) {
       Hemanth obj1=new Hemanth();

       obj1.show();

    }
}
class Hemanth  {
    public void show(){
        for(int i=1;i<=5;i++) {
            System.out.println("Hemanth");
            try{Thread.sleep(1500); } catch(Exception e){}
        }
    }
}
