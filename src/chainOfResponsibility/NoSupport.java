package chainOfResponsibility;

/**
 *
 * @author kinoshita_h
 */
public class NoSupport extends Support {

    /**
     *
     * @param name
     */
    public NoSupport(String name) {
        super(name);
    }

    /**
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {     // �����p���\�b�h
        return false; // �����͉����������Ȃ�
    }
}
