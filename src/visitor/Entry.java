package visitor;

import java.util.Iterator;

/**
 *
 * @author kinoshita_h
 */
public abstract class Entry implements Element {

    /**
     *
     * @return
     */
    public abstract String getName();                                   // 名前を得る

    /**
     *
     * @return
     */
    public abstract int getSize();                                      // サイズを得る

    /**
     *
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {       // エントリを追加する
        throw new FileTreatmentException();
    }

    /**
     *
     * @return
     * @throws FileTreatmentException
     */
    public Iterator iterator() throws FileTreatmentException {    // Iteratorの生成
        throw new FileTreatmentException();
    }
    public String toString() {                                          // 文字列表現
        return getName() + " (" + getSize() + ")";
    }
}
