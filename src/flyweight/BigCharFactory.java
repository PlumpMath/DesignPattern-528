package flyweight;

import java.util.HashMap;

/**
 * BigCharのインスタンスを共有しながら生成するクラス
 * @author kinopp
 */
public class BigCharFactory {
    // すでに作ったBigCharのインスタンスを管理
    private final HashMap pool = new HashMap();
    // Singletonパターン
    private static final BigCharFactory singleton = new BigCharFactory();
    // コンストラクタ
    private BigCharFactory() {
    }
    
    /**
     * インスタンスを取得するメソッド
     * @return BigCharFactoryの唯一のインスタンス
     */
    public static BigCharFactory getInstance() {
        return singleton;
    }

    /**
     * すでにオブジェクトが存在する場合はそのオブジェクトを返却し、なければ生成する
     * @param charname 変換したい文字
     * @return BigChar型の変換後の文字
     */
    public synchronized BigChar getBigChar(char charname) {
        // 既にオブジェクトが生成されているか確認する為のセット
        BigChar bc = (BigChar)pool.get("" + charname);
        
        // 一度生成した文字であればオブジェクトを使い回す。また、synchronized
        // なので排他制御がかかる。
        if (bc == null) {
            bc = new BigChar(charname); // ここでBigCharのインスタンスを生成
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
