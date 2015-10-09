package chainOfResponsibility;

public class SpecialSupport extends Support {
    private final int number;                                 // ���̔ԍ����������ł���

    public SpecialSupport(String name, int number) {    // �R���X�g���N�^
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {     // �����p���\�b�h
        return trouble.getNumber() == number;
    }
}
