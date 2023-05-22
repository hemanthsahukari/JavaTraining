package MultiThreading;
class MyTask{
    void executeTask(){
        for(int doc=1;doc<=10;doc++){
            System.out.println("@@Printing Document#"+doc+"-Printer2");
        }

    }
}



public class Application {
    //main method represent main thread
    public static void main(String[] args) {
        //whatever we write will be executed by main method
        //threads execute jobs in sequence
        //Thread is an execution context
        //Step1
       System.out.println("==Application Started==");
       //introduce MyTaask
        MyTask task=new MyTask();
        task.executeTask();

       //Step2
       //code to print document
        for(int doc=1;doc<=10 ;doc++){
            System.out.println("Printing Document #"+doc+"-Printer1");
        }
        //Step3
        System.out.println("==Application Finished==");


    }

}
