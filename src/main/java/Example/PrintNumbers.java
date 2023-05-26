package Example;

class PrintNumbers extends Thread {
    private boolean printEven;

    public PrintNumbers(boolean printEven) {
        this.printEven = printEven;
    }

    @Override
    public void run() {
        if (printEven) {
            for (int i = 2; i <= 1000; i += 2) {
                System.out.println("Even: " + i);
            }
        } else {
            for (int i = 1; i <= 1000; i += 2) {
                System.out.println("Odd: " + i);
            }
        }
    }
}
