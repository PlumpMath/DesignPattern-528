package visitor;

import java.util.Iterator;
import java.util.ArrayList;

/**
 *
 * @author kinoshita_h
 */
public class Directory extends Entry {
    private String name;                    // �f�B���N�g���̖��O
    private ArrayList dir = new ArrayList();      // �f�B���N�g���G���g���̏W��

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
    public String getName() {               // ���O�𓾂�
        return name;
    }

    /**
     *
     * @return
     */
    public int getSize() {                  // �T�C�Y�𓾂�
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
    public Entry add(Entry entry) {         // �G���g���̒ǉ�
        dir.add(entry);
        return this;
    }

    /**
     *
     * @return
     */
    public Iterator iterator() {      // Iterator�̐���
        return dir.iterator();
    }

    /**
     *
     * @param v
     */
    public void accept(Visitor v) {         // �K��҂̎󂯓���
        v.visit(this);
    }
}
