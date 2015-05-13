package composite;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author kinoshita_h
 */
public class Directory extends Entry {
    private final String name;                    // �f�B���N�g���̖��O
    private final ArrayList directory = new ArrayList();      // �f�B���N�g���G���g���̏W��

    /**
     *
     * @param name
     */
    public Directory(String name) {         // �R���X�g���N�^
        this.name = name;
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {               // ���O�𓾂�
        return name;
    }

    /**
     *
     * @return
     */
    @Override
    public int getSize() {                  // �T�C�Y�𓾂�
        int size = 0;
        Iterator it = directory.iterator();
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
    @Override
    public Entry add(Entry entry) {         // �G���g���̒ǉ�
        directory.add(entry);
        return this;
    }

    /**
     *
     * @param prefix
     */
    @Override
    protected void printList(String prefix) {       // �G���g���̈ꗗ
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
