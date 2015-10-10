package singleton;

public class Singleton {
    // private static finalで自身のクラスを生成。
    //  ※外部からの参照不可、静的な値、継承による変更不可
    private static final Singleton singleton = new Singleton();
    // コンストラクタもprivateにすることで、newによるオブジェクト生成禁止。
    private Singleton() {                                 
        System.out.println("インスタンスを生成しました。");
    }

    public static Singleton getInstance() {
        // このメソッドを通してのみインスタンスを取得できる。
        // staticなインスタンスなのでどこから呼ばれても常に同じオブジェクトを渡す。
        return singleton;
    }
}
