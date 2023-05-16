package ExceptionHandling;
public class ExceptionHandlingwithTryCatch {
    public static void main(String[] args) {
        System.out.println("One");
        System.out.println("Two");

        try // Error handling code starts here.
        {
            System.out.println("Before divide");
            int a = 1 / 0; // Exceptional case (Exception has occurred).
            System.out.println("After divide");
        } catch (ArithmeticException e) // Exception handled. Here, catch block is an exception handler.
        {
            System.out.println("A number cannot be divided by zero.");
        }
        System.out.println("Three");
        System.out.println("Four");
    }
}
