package proxy;

/**
 *
 * @author kinoshita_h
 */
public class Printer implements Printable {
    private String name;

    /**
     *
     */
    public Printer() {
        heavyJob("Printer�̃C���X�^���X�𐶐���");
    }

    /**
     *
     * @param name
     */
    public Printer(String name) {                   // �R���X�g���N�^
        this.name = name;
        heavyJob("Printer�̃C���X�^���X(" + name + ")�𐶐���");
    }

    /**
     *
     * @param name
     */
    @Override
    public void setPrinterName(String name) {       // ���O�̐ݒ�
        this.name = name;
    }

    /**
     *
     * @return
     */
    @Override
    public String getPrinterName() {                // ���O�̎擾
        return name;
    }

    /**
     *
     * @param string
     */
    @Override
    public void print(String string) {              // ���O�t���ŕ\��
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }
    private void heavyJob(String msg) {             // �d�����(�̂���)
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("�����B");
    }
}
