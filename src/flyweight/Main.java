package flyweight;

/**
 *
 * @author kinopp
 */
public class Main {

    /**
     * メイン
     * @param args 数字またはハイフンで構成される文字列
     */
    public static void main(String[] args) {
//        // 実行時パラメータがない場合はエラー
//        if (args.length == 0) {
//            System.out.println("Usage: java Main digits");
//            System.out.println("Example: java Main 1212123");
//            System.out.println("args.length:" + args.length);
//            System.exit(0);
//        }

        //BigString bs = new BigString(args[0]);
        // 「121-213」を表示
        BigString bs = new BigString("121-213");
        bs.print();
    }
}
