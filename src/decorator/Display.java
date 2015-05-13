package decorator;

/**
 *
 * @author kinoshita_h
 */
public abstract class Display {

    /**
     *
     * @return
     */
    public abstract int getColumns();               // 横の文字数を得る

    /**
     *
     * @return
     */
    public abstract int getRows();                  // 縦の行数を得る

    /**
     *
     * @param row
     * @return
     */
    public abstract String getRowText(int row);     // row番目の文字列を得る

    /**
     *
     */
    public void show() {                            // 全部表示する
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
