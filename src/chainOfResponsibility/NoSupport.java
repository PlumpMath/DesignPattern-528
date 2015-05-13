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
    protected boolean resolve(Trouble trouble) {     // 解決用メソッド
        return false; // 自分は何も処理しない
    }
}
