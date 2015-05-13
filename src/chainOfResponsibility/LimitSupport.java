package chainOfResponsibility;

/**
 *
 * @author kinoshita_h
 */
public class LimitSupport extends Support {
    private final int limit;                              // この番号未満なら解決できる

    /**
     *
     * @param name
     * @param limit
     */
    public LimitSupport(String name, int limit) {   // コンストラクタ
        super(name);
        this.limit = limit;
    }

    /**
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {         // 解決用メソッド
        return trouble.getNumber() < limit;
    }
}
