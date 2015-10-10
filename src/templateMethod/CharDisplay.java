package templateMethod;

public class CharDisplay extends AbstractDisplay {  // CharDisplayは、AbstractDisplayのサブクラス。
    private final char ch;                                // 表示すべき文字。

    public CharDisplay(char ch) {                   // コンストラクタで渡された文字chを、
        this.ch = ch;                               // フィールドに記憶しておく。
    }
    @Override
    public void open() {                            // スーパークラスでは抽象メソッドだった。ここでオーバーライドして実装。
        System.out.print("<<");                     // 開始文字列として"<<"を表示する。
    }

    @Override
    public void print() {                           // printメソッドもここで実装する。これがdisplayから繰り返して呼び出される。
        System.out.print(ch);                       // フィールドに記憶しておいた文字を1個表示する。
    }

    @Override
    public void close() {                           // closeメソッドもここで実装。
        System.out.println(">>");                   // 終了文字列">>"を表示。
    }
}
