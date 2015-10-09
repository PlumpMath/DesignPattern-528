package chainOfResponsibility;

public class OddSupport extends Support {

    public OddSupport(String name) {                // コンストラクタ
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {    // 解決用メソッド
        return trouble.getNumber() % 2 == 1;
    }
}
