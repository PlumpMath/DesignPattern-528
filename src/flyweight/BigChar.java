package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 「大きな文字」を表すクラス
 * @author kinopp
 */
public class BigChar {
    // 文字の名前
//    private char charname;
    // 大きな文字を表現する文字列('#' '.' '\n'の列)
    private String fontdata;

    /**
     * コンストラクタ
     * @param charname 表示したい数字またはハイフン１文字
     */
    public BigChar(char charname) {
//        this.charname = charname;
        try {
            // bigx.txtを読み込む
            BufferedReader reader = new BufferedReader(
                new FileReader("./src/flyweight/big" + charname + ".txt")
            );
            String line;
            StringBuilder buf = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            
            // 読み込んだファイルを文字列にしてfontdataに保持
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    /**
     * 大きな文字を表示する
     */
    public void print() {
        System.out.print(fontdata);
    }
}
