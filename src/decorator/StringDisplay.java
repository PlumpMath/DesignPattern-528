package decorator;

public class StringDisplay extends Display {
    private final String string;                          // �\��������

    public StringDisplay(String string) {           // �����ŕ\����������w��
        this.string = string;
    }

    @Override
    public int getColumns() {                       // ������
        return string.getBytes().length;
    }

    @Override
    public int getRows() {                          // �s����1
        return 1;
    }

    @Override
    public String getRowText(int row) {             // row��0�̂Ƃ��̂ݕԂ�
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
