package chainOfResponsibility;

/**
 *
 * @author kinoshita_h
 */
public class LimitSupport extends Support {
    private final int limit;                              // ���̔ԍ������Ȃ�����ł���

    /**
     *
     * @param name
     * @param limit
     */
    public LimitSupport(String name, int limit) {   // �R���X�g���N�^
        super(name);
        this.limit = limit;
    }

    /**
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {         // �����p���\�b�h
        return trouble.getNumber() < limit;
    }
}
