package chainOfResponsibility;

public class Trouble {
    private final int number;             // �g���u���ԍ�

    public Trouble(int number) {    // �g���u���̐���
        this.number = number;
    }

    public int getNumber() {        // �g���u���ԍ��𓾂�
        return number;
    }
    
    @Override
    public String toString() {      // �g���u���̕�����\��
        return "[Trouble " + number + "]";
    }
}
