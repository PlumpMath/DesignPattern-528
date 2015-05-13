package decorator;

/**
 *
 * @author kinoshita_h
 */
public class StringDisplay extends Display {
    private final String string;                          // 表示文字列

    /**
     *
     * @param string
     */
    public StringDisplay(String string) {           // 引数で表示文字列を指定
        this.string = string;
    }

    /**
     *
     * @return
     */
    @Override
    public int getColumns() {                       // 文字数
        return string.getBytes().length;
    }

    /**
     *
     * @return
     */
    @Override
    public int getRows() {                          // 行数は1
        return 1;
    }

    /**
     *
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {             // rowが0のときのみ返す
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
