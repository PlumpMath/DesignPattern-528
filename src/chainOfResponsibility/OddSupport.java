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
    public OddSupport(String name) {                // コンストラクタ
        super(name);
    }

    /**
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {    // 解決用メソッド
        return trouble.getNumber() % 2 == 1;
    }
}
