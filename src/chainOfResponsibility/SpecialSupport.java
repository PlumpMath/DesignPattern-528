package chainOfResponsibility;

/**
 *
 * @author kinoshita_h
 */
public class SpecialSupport extends Support {
    private final int number;                                 // ���̔ԍ����������ł���

    /**
     *
     * @param name
     * @param number
     */
    public SpecialSupport(String name, int number) {    // �R���X�g���N�^
        super(name);
        this.number = number;
    }

    /**
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {     // �����p���\�b�h
        return trouble.getNumber() == number;
    }
}
