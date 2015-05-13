package visitor;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author kinoshita_h
 */
public class Directory extends Entry {
    private String name;                    // ディレクトリの名前
    private ArrayList dir = new ArrayList();      // ディレクトリエントリの集合

    /**
     *
     * @param name
     */
    public Directory(String name) {         // コンストラクタ
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName() {               // 名前を得る
        return name;
    }

    /**
     *
     * @return
     */
    public int getSize() {                  // サイズを得る
        int size = 0;
        Iterator it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }

    /**
     *
     * @param entry
     * @return
     */
    public Entry add(Entry entry) {         // エントリの追加
        dir.add(entry);
        return this;
    }

    /**
     *
     * @return
     */
    public Iterator iterator() {      // Iteratorの生成
        return dir.iterator();
    }

    /**
     *
     * @param v
     */
    public void accept(Visitor v) {         // 訪問者の受け入れ
        v.visit(this);
    }
}
