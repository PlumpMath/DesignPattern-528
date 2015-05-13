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
    public abstract String getName();                               // ���O�𓾂�

    /**
     *
     * @return
     */
    public abstract int getSize();                                  // �T�C�Y�𓾂�

    /**
     *
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {   // �G���g����ǉ�����
        throw new FileTreatmentException();
    }

    /**
     *
     */
    public void printList() {                                       // �ꗗ��\������
        printList("");
    }

    /**
     *
     * @param prefix
     */
    protected abstract void printList(String prefix);               // prefix��O�ɂ��Ĉꗗ��\������
    @Override
    public String toString() {                                      // ������\��
        return getName() + " (" + getSize() + ")";
    }
}
