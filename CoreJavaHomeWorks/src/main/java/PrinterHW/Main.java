package PrinterHW;

public class Main {
    public static void main(String[] args) {
        CanonPrinter printer = new CanonPrinter(10);
        printer.print("Hello world");
        printer.charge(5);
        printer.print("Hello world");
    }
}
