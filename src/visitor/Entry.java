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
    public abstract String getName();                                   // ���O�𓾂�

    /**
     *
     * @return
     */
    public abstract int getSize();                                      // �T�C�Y�𓾂�

    /**
     *
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {       // �G���g����ǉ�����
        throw new FileTreatmentException();
    }

    /**
     *
     * @return
     * @throws FileTreatmentException
     */
    public Iterator iterator() throws FileTreatmentException {    // Iterator�̐���
        throw new FileTreatmentException();
    }
    public String toString() {                                          // ������\��
        return getName() + " (" + getSize() + ")";
    }
}
