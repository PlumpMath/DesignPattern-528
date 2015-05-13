package decorator;

/**
 *
 * @author kinoshita_h
 */
public abstract class Display {

    /**
     *
     * @return
     */
    public abstract int getColumns();               // ���̕������𓾂�

    /**
     *
     * @return
     */
    public abstract int getRows();                  // �c�̍s���𓾂�

    /**
     *
     * @param row
     * @return
     */
    public abstract String getRowText(int row);     // row�Ԗڂ̕�����𓾂�

    /**
     *
     */
    public void show() {                            // �S���\������
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
