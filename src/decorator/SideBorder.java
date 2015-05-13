package decorator;

/**
 *
 * @author kinoshita_h
 */
public class SideBorder extends Border {
    private final char borderChar;                        // 飾りとなる文字

    /**
     *
     * @param display
     * @param ch
     */
    public SideBorder(Display display, char ch) {   // コンストラクタでDisplayと飾り文字を指定
        super(display);
        this.borderChar = ch;
    }

    /**
     *
     * @return
     */
    @Override
    public int getColumns() {                       // 文字数は中身の両側に飾り文字分を加えたもの
        return 1 + display.getColumns() + 1;
    }

    /**
     *
     * @return
     */
    @Override
    public int getRows() {                          // 行数は中身の行数に同じ
        return display.getRows();
    }

    /**
     *
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {             // 指定行の内容は、中身の指定行の両側に飾り文字をつけたもの
        return borderChar + display.getRowText(row) + borderChar;
    }
}
