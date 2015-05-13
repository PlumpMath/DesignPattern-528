package proxy;

/**
 *
 * @author kinoshita_h
 */
public class Main {

    /**
     * ���C��
     * @param args
     */
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("���O�͌���" + p.getPrinterName() + "�ł��B");
        p.setPrinterName("Bob");
        System.out.println("���O�͌���" + p.getPrinterName() + "�ł��B");
        p.print("Hello, world.");
    }
}
