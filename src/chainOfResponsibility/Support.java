package chainOfResponsibility;

/**
 *
 * @author kinoshita_h
 */
public abstract class Support {
    private final String name;                    // ���̃g���u�������҂̖��O
    private Support next;                 // ���炢�񂵂̐�

    /**
     *
     * @param name
     */
    public Support(String name) {           // �g���u�������҂̐���
        this.name = name;
    }

    /**
     *
     * @param next
     * @return
     */
    public Support setNext(Support next) {  // ���炢�񂵂̐��ݒ�
        this.next = next;
        return next;
    }

    /**
     *
     * @param trouble
     */
    public void support(Trouble trouble) {  // �g���u�������̎菇
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }
    @Override
    public String toString() {              // ������\��
        return "[" + name + "]";
    }

    /**
     *
     * @param trouble
     * @return
     */
    protected abstract boolean resolve(Trouble trouble); // �����p���\�b�h

    /**
     *
     * @param trouble
     */
    protected void done(Trouble trouble) {  // ����
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    /**
     *
     * @param trouble
     */
    protected void fail(Trouble trouble) {  // ������
        System.out.println(trouble + " cannot be resolved.");
    }
}
