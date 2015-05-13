package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * BigCharを集めて作った「大きな文字列」を表すクラス
 * @author kinopp
 */
public class BigString {
    // 「大きな文字」の配列
    private final List<BigChar> bigchars = new ArrayList<>();

    /**
     * コンストラクタ
     * @param string
     */
    public BigString(String string) {
        // BigCharFactoryオブジェクトを取得
        // BigCharFactoryはsingletonなので唯一のオブジェクト
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < string.length(); i++) {
            // 指定の文字数分繰り返す。
            // charからBigCharに変換し、クラス変数であるListに格納する。
            // getBigCharがflyweightメソッドとなっており、一度生成した
            // 文字であればオブジェクトを使い回す。また、synchronized
            // なので排他制御がかかる。
            bigchars.add(factory.getBigChar(string.charAt(i)));
        }
    }

    /**
     * 表示
     */
    public void print() {
        // オブジェクト生成時作成したBigCharのリストから要素を取得し、表示する。
        bigchars.stream().forEach(bigchar -> bigchar.print());
    }
}
