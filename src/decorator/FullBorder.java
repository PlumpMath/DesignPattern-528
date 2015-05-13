package decorator;

/**
 *
 * @author kinoshita_h
 */
public class FullBorder extends Border {

    /**
     *
     * @param display
     */
    public FullBorder(Display display) {
        super(display);
    }

    /**
     *
     * @return
     */
    @Override
    public int getColumns() {                   // �������͒��g�̗����ɍ��E�̏��蕶����������������
        return 1 + display.getColumns() + 1;
    }

    /**
     *
     * @return
     */
    @Override
    public int getRows() {                      // �s���͒��g�̍s���ɏ㉺�̏��蕶����������������
        return 1 + display.getRows() + 1;
    }

    /**
     *
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {         // �w�肵���s�̓��e
        if (row == 0) {                                                 // ��[�̘g
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {                      // ���[�̘g
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {                                                        // ����ȊO
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
    private String makeLine(char ch, int count) {         // ����ch��count�A������������������
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
