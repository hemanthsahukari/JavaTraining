package ExceptionHandling;

class Main {
    public static void main(String[] args) {
        try {
            // code that generates exception
            int divideByZero = 1 / 0;
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        finally {
            System.out.println("This is the finally block");
        }
    }
}
