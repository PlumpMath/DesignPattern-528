package chainOfResponsibility;

/**
 *
 * @author kinoshita_h
 */
public class OddSupport extends Support {

    /**
     *
     * @param name
     */
    public OddSupport(String name) {                // �R���X�g���N�^
        super(name);
    }

    /**
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {    // �����p���\�b�h
        return trouble.getNumber() % 2 == 1;
    }
}
