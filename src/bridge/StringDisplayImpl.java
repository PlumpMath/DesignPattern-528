package bridge;

public class StringDisplayImpl extends DisplayImpl {
    private final String string;                              // �\������ׂ�������
    private final int width;                                  // �o�C�g�P�ʂŌv�Z����������́u���v

    public StringDisplayImpl(String string) {           //�R���X�g���N�^�œn���ꂽ������string���A
        this.string = string;                               //�t�B�[���h�ɋL�����Ă����B
        this.width = string.getBytes().length;              //���ꂩ��o�C�g�P�ʂ̕����t�B�[���h�ɋL�����Ă����āA��Ŏg���B
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");         // �O���"|"�����ĕ\��
    }

    @Override
    public void rawClose() {
        printLine();
    }
    private void printLine() {
        System.out.print("+");                          // �g�̊p��\������"+"�}�[�N��\������B
        for (int i = 0; i < width; i++) {               // width��"-"��\�����āA
            System.out.print("-");                      // �g���Ƃ��ėp����B
        }
        System.out.println("+");                        // �g�̊p��\������"+"�}�[�N��\������B
    }
}
