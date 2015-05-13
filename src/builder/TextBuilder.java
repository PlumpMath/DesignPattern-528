package builder;

/**
 *
 * @author kinoshita_h
 */
public class TextBuilder implements Builder {
    private final StringBuffer buffer = new StringBuffer();           // このフィールドに文書を構築していく

    /**
     *
     * @param title
     */
    @Override
    public void makeTitle(String title) {                       // プレーンテキストでのタイトル
        buffer.append("==============================\n");          // 飾り線
        buffer.append("『").append(title).append("』\n");                       // 『』つきのタイトル
        buffer.append("\n");                                        // 空行
    }

    /**
     *
     * @param str
     */
    @Override
    public void makeString(String str) {                        // プレーンテキストでの文字列
        buffer.append('■').append(str).append("\n");                           // ■つきの文字列
        buffer.append("\n");                                        // 空行
    }

    /**
     *
     * @param items
     */
    @Override
    public void makeItems(String[] items) {                     // プレーンテキストでの箇条書き
        for (String item : items) {
            buffer.append("　・").append(item).append("\n"); // ・つきの項目
        }
        buffer.append("\n");                                        // 空行
    }

    /**
     *
     */
    @Override
    public void close() {                                       // 文書の完成
        buffer.append("==============================\n");          // 飾り線
    }

    /**
     *
     * @return
     */
    @Override
    public String getResult() {                                 // 完成した文書
        return buffer.toString();                                   // StringBufferをStringに変換
    }
}
