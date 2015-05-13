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
    public abstract void doClock(Context context, int hour);    // 時刻設定

    /**
     *
     * @param context
     */
    public abstract void doUse(Context context);                // 金庫使用

    /**
     *
     * @param context
     */
    public abstract void doAlarm(Context context);              // 非常ベル

    /**
     *
     * @param context
     */
    public abstract void doPhone(Context context);              // 通常通話
}
