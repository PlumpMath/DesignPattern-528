package chainOfResponsibility;

public class OddSupport extends Support {

    public OddSupport(String name) {                // �R���X�g���N�^
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {    // �����p���\�b�h
        return trouble.getNumber() % 2 == 1;
    }
}
