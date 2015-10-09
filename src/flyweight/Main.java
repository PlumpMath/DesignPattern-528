package flyweight;

public class Main {

    /**
     * メイン
     * @param args 数字またはハイフンで構成される文字列
     */
    public static void main(String[] args) {
        // 「121-213」を表示
        BigString bs = new BigString("121-213");
        bs.print();
    }
}
