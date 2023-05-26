package Example;

public class Main {
    public static void main(String[] args) {
        PrintNumbers evenThread = new PrintNumbers(true);
        PrintNumbers oddThread = new PrintNumbers(false);

        evenThread.start();
        try {
            evenThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        oddThread.start();
    }
}
