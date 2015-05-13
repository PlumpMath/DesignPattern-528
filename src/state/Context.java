package state;

/**
 *
 * @author kinopp
 */
public interface Context {

    /**
     *
     * @param hour
     */
    public abstract void setClock(int hour);                // �����̐ݒ�

    /**
     *
     * @param state
     */
    public abstract void changeState(State state);          // ��ԕω�

    /**
     *
     * @param msg
     */
    public abstract void callSecurityCenter(String msg);    // �x���Z���^�[�x�����Ăяo��

    /**
     *
     * @param msg
     */
    public abstract void recordLog(String msg);             // �x���Z���^�[�L�^
}
