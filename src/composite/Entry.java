package composite;

/**
 *
 * @author kinoshita_h
 */
public abstract class Entry {

    /**
     *
     * @return
     */
    public abstract String getName();                               // 名前を得る

    /**
     *
     * @return
     */
    public abstract int getSize();                                  // サイズを得る

    /**
     *
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {   // エントリを追加する
        throw new FileTreatmentException();
    }

    /**
     *
     */
    public void printList() {                                       // 一覧を表示する
        printList("");
    }

    /**
     *
     * @param prefix
     */
    protected abstract void printList(String prefix);               // prefixを前につけて一覧を表示する
    @Override
    public String toString() {                                      // 文字列表現
        return getName() + " (" + getSize() + ")";
    }
}
