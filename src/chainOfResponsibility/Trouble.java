package chainOfResponsibility;

/**
 *
 * @author kinoshita_h
 */
public class Trouble {
    private final int number;             // �g���u���ԍ�

    /**
     *
     * @param number
     */
    public Trouble(int number) {    // �g���u���̐���
        this.number = number;
    }

    /**
     *
     * @return
     */
    public int getNumber() {        // �g���u���ԍ��𓾂�
        return number;
    }
    @Override
    public String toString() {      // �g���u���̕�����\��
        return "[Trouble " + number + "]";
    }
}
