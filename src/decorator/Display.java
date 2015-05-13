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
    public abstract int getColumns();               // ‰¡‚Ì•¶š”‚ğ“¾‚é

    /**
     *
     * @return
     */
    public abstract int getRows();                  // c‚Ìs”‚ğ“¾‚é

    /**
     *
     * @param row
     * @return
     */
    public abstract String getRowText(int row);     // row”Ô–Ú‚Ì•¶š—ñ‚ğ“¾‚é

    /**
     *
     */
    public void show() {                            // ‘S•”•\¦‚·‚é
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}
