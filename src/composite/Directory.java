package composite;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author kinoshita_h
 */
public class Directory extends Entry {
    private final String name;                    // ディレクトリの名前
    private final ArrayList<Entry> directory = new ArrayList<>();      // ディレクトリエントリの集合

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
    @Override
    public String getName() {               // 名前を得る
        return name;
    }

    /**
     *
     * @return
     */
    @Override
    public int getSize() {                  // サイズを得る
        int size = 0;
        size = directory.stream()
                .map((entry) -> entry.getSize())
                .reduce(size, Integer::sum);
        return size;
    }

    /**
     *
     * @param entry
     * @return
     */
    @Override
    public Entry add(Entry entry) {         // エントリの追加
        directory.add(entry);
        return this;
    }

    /**
     *
     * @param prefix
     */
    @Override
    protected void printList(String prefix) {       // エントリの一覧
        System.out.println(prefix + "/" + this);
        directory.stream()
                .forEach(entry -> entry.printList(prefix + "/" + name));
    }
}
