package decorator;

/**
 *
 * @author kinoshita_h
 */
public class SideBorder extends Border {
    private final char borderChar;                        // ����ƂȂ镶��

    /**
     *
     * @param display
     * @param ch
     */
    public SideBorder(Display display, char ch) {   // �R���X�g���N�^��Display�Ə��蕶�����w��
        super(display);
        this.borderChar = ch;
    }

    /**
     *
     * @return
     */
    @Override
    public int getColumns() {                       // �������͒��g�̗����ɏ��蕶����������������
        return 1 + display.getColumns() + 1;
    }

    /**
     *
     * @return
     */
    @Override
    public int getRows() {                          // �s���͒��g�̍s���ɓ���
        return display.getRows();
    }

    /**
     *
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {             // �w��s�̓��e�́A���g�̎w��s�̗����ɏ��蕶������������
        return borderChar + display.getRowText(row) + borderChar;
    }
}
