package proxy;

/**
 *
 * @author kinoshita_h
 */
public class PrinterProxy implements Printable {
    private String name;            // ���O
    private Printer real;           // �u�{�l�v

    /**
     *
     */
    public PrinterProxy() {
    }

    /**
     *
     * @param name
     */
    public PrinterProxy(String name) {      // �R���X�g���N�^
        this.name = name;
    }

    /**
     *
     * @param name
     */
    @Override
    public synchronized void setPrinterName(String name) {  // ���O�̐ݒ�
        if (real != null) {
            real.setPrinterName(name);  // �u�{�l�v�ɂ��ݒ肷��
        }
        this.name = name;
    }

    /**
     *
     * @return
     */
    @Override
    public String getPrinterName() {    // ���O�̎擾
        return name;
    }

    /**
     *
     * @param string
     */
    @Override
    public void print(String string) {  // �\��
        realize();
        real.print(string);
    }
    private synchronized void realize() {   // �u�{�l�v�𐶐�
        if (real == null) {
            real = new Printer(name);
        }
    }
}
