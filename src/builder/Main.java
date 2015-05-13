package builder;

/**
 *
 * @author kinoshita_h
 */
public class Main {

    /**
     * メイン
     * @param args
     */
    public static void main(String[] args) {
        
        // 「plain」または「html」を指定
        args = new String[1];
        args[0] = "html";
        
        if (args.length != 1 && !args[0].equals("plain") && !args[0].equals("html")) {
            usage();
            System.exit(0);
        }
        
        Builder builder = null;
        String str = null;
        if (args[0].equals("plain")) {
            builder = new TextBuilder();
            str = "";
        } else if (args[0].equals("html")) {
            builder = new HTMLBuilder();
            str = "を作成";
        }
        
        // Directorクラスに「plain」または「html」どちらで作成するかを指定。
        // TextBuilderまたはHTMLBuilderのインスタンスを渡す。
        Director director = new Director(builder);
        // アルゴリズムを記載したメソッドを実行。
        director.construct();
        // 結果を取得
        String result = builder.getResult();
        // 結果を表示
        System.out.println(result + str);

    }

    /**
     * 不正なパラメータ設定時、実行の手順を表示
     */
    public static void usage() {
        System.out.println("Usage: java Main plain      プレーンテキストで文書作成");
        System.out.println("Usage: java Main html       HTMLファイルで文書作成");
    }
}
