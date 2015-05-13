package state;

/**
 *
 * @author kinopp
 */
public interface State {

    /**
     *
     * @param context
     * @param hour
     */
    public abstract void doClock(Context context, int hour);    // �����ݒ�

    /**
     *
     * @param context
     */
    public abstract void doUse(Context context);                // ���Ɏg�p

    /**
     *
     * @param context
     */
    public abstract void doAlarm(Context context);              // ���x��

    /**
     *
     * @param context
     */
    public abstract void doPhone(Context context);              // �ʏ�ʘb
}
