package proxy;

/**
 *
 * @author kinoshita_h
 */
public interface Printable {

    /**
     *
     * @param name
     */
    public abstract void setPrinterName(String name);   // ���O�̐ݒ�

    /**
     *
     * @return
     */
    public abstract String getPrinterName();            // ���O�̎擾

    /**
     *
     * @param string
     */
    public abstract void print(String string);          // ������\��(�v�����g�A�E�g)
}
