package proxy;

/**
 *
 * @author kinoshita_h
 */
public interface Printable {

    /**
     *
     * @param name
     */
    public abstract void setPrinterName(String name);   // 名前の設定

    /**
     *
     * @return
     */
    public abstract String getPrinterName();            // 名前の取得

    /**
     *
     * @param string
     */
    public abstract void print(String string);          // 文字列表示(プリントアウト)
}
