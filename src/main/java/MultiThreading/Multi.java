package MultiThreading;

//Example by extending thread class..

class Multi extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String args[]){
        Multi t1=new Multi();
        t1.start();
    }
}


//Example by implementing Runnable interface..

class Multi1 implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String args[]){
        Multi1 m1=new Multi1();
        Thread t1 =new Thread(m1);
        // Using the constructor Thread(Runnable r)
        t1.start();
    }
}

//Using Thread class

class MyThread1
{
    // Main method
    public static void main(String args[])
    {
// creating an object of the Thread class using the constructor Thread(String name)
        Thread t= new Thread("My first thread");

// the start() method moves the thread to the active state
        t.start();
// getting the thread name by using the getName() method
        String str = t.getName();
        System.out.println(str);
    }
}

//using thread class(Runnable and string name.)
class MyThread2 implements Runnable
{
    public void run()
    {
        System.out.println("Now the thread is running.");
    }

    // main method
    public static void main(String args[])
    {
// creating an object of the class MyThread2
        Runnable r1 = new MyThread2();

// creating an object of the class Thread using Thread(Runnable , String name)
        Thread th1 = new Thread(r1, "My new thread");

// the start() method moves the thread to the active state
        th1.start();
        String str = th1.getName();
        System.out.println(str);
    }
}


//Thread.sleep() example
class TestSleepMethod1 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            // 500 indicated 500 milliseconds
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        TestSleepMethod1 t1=new TestSleepMethod1();
        TestSleepMethod1 t2=new TestSleepMethod1();

        t1.start();
        t2.start();
    }
}


//starting a thread twice
//.......
//thread will run once and then it will throw exception
class TestThreadTwice extends Thread{
    public void run(){
        System.out.println("running.");
    }
    public static void main(String[] args){
        TestThreadTwice t1=new TestThreadTwice();
        t1.start();
        t1.start();

    }
}


//instead of start() we use run()method...
class TestCallRun extends Thread{
    public void run(){
        System.out.println("running.");
    }
    public static void main(String args[]){
        TestCallRun t1=new TestCallRun();
        t1.run();//fine, but does not start a separate call stack
    }
}


//example by using join method

class TestJoinMethod1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TestJoinMethod1 t1=new TestJoinMethod1();//assume it was job 1
        TestJoinMethod1 t2=new TestJoinMethod1();//assume it was job 2
        TestJoinMethod1 t3=new TestJoinMethod1();//assume it was job 3
        t1.start();
        try{
            t1.join();
        }catch(Exception e){System.out.println(e);}
        t2.start();
        t3.start();
        //the code will be executed step by step...job1,job2,job3...
    }
}




