package singleton;

/**
 *
 * @author kinoshita_h
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Start.");
        //Singleton obj0 = new Singleton();        // ← newによるオブジェクト生成不可
        Singleton obj1 = Singleton.getInstance();  // シングルトンクラスよりインスタンス取得
        Singleton obj2 = Singleton.getInstance();  // 再度、シングルトンクラスよりインスタンス取得
        // シングルトンクラスより取得したインスタンスは常に同一であることがわかる。
        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同じインスタンスです。");
        } else {
            System.out.println("obj1とobj2は同じインスタンスではありません。");
        }
        System.out.println("End.");
    }
}
