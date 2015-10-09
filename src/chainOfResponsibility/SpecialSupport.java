package chainOfResponsibility;

public class SpecialSupport extends Support {
    private final int number;                                 // この番号だけ解決できる

    public SpecialSupport(String name, int number) {    // コンストラクタ
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {     // 解決用メソッド
        return trouble.getNumber() == number;
    }
}
