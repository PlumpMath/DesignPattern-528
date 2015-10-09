package chainOfResponsibility;

public class LimitSupport extends Support {
    private final int limit;                              // ���̔ԍ������Ȃ�����ł���

    public LimitSupport(String name, int limit) {   // �R���X�g���N�^
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {         // �����p���\�b�h
        return trouble.getNumber() < limit;
    }
}
