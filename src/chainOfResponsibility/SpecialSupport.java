package chainOfResponsibility;

/**
 *
 * @author kinoshita_h
 */
public class SpecialSupport extends Support {
    private final int number;                                 // この番号だけ解決できる

    /**
     *
     * @param name
     * @param number
     */
    public SpecialSupport(String name, int number) {    // コンストラクタ
        super(name);
        this.number = number;
    }

    /**
     *
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {     // 解決用メソッド
        return trouble.getNumber() == number;
    }
}
