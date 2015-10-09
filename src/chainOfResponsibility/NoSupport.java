package chainOfResponsibility;

public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {     // 解決用メソッド
        return false; // 自分は何も処理しない
    }
}
