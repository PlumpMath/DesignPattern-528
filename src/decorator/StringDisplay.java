package decorator;

/**
 *
 * @author kinoshita_h
 */
public class StringDisplay extends Display {
    private final String string;                          // �\��������

    /**
     *
     * @param string
     */
    public StringDisplay(String string) {           // �����ŕ\����������w��
        this.string = string;
    }

    /**
     *
     * @return
     */
    @Override
    public int getColumns() {                       // ������
        return string.getBytes().length;
    }

    /**
     *
     * @return
     */
    @Override
    public int getRows() {                          // �s����1
        return 1;
    }

    /**
     *
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {             // row��0�̂Ƃ��̂ݕԂ�
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
