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
    public abstract void setClock(int hour);                // 時刻の設定

    /**
     *
     * @param state
     */
    public abstract void changeState(State state);          // 状態変化

    /**
     *
     * @param msg
     */
    public abstract void callSecurityCenter(String msg);    // 警備センター警備員呼び出し

    /**
     *
     * @param msg
     */
    public abstract void recordLog(String msg);             // 警備センター記録
}
