package decorator;

/**
 *
 * @author kinoshita_h
 */
public class FullBorder extends Border {

    /**
     *
     * @param display
     */
    public FullBorder(Display display) {
        super(display);
    }

    /**
     *
     * @return
     */
    @Override
    public int getColumns() {                   // 文字数は中身の両側に左右の飾り文字分を加えたもの
        return 1 + display.getColumns() + 1;
    }

    /**
     *
     * @return
     */
    @Override
    public int getRows() {                      // 行数は中身の行数に上下の飾り文字分を加えたもの
        return 1 + display.getRows() + 1;
    }

    /**
     *
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {         // 指定した行の内容
        if (row == 0) {                                                 // 上端の枠
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {                      // 下端の枠
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {                                                        // それ以外
            return "|" + display.getRowText(row - 1) + "|";
        }
    }
    private String makeLine(char ch, int count) {         // 文字chをcount個連続させた文字列を作る
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
