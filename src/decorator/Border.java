package decorator;

/**
 *
 * @author kinoshita_h
 */
public abstract class Border extends Display {

    /**
     *
     */
    protected Display display;          // ���̏���g�������ł���u���g�v���w��

    /**
     *
     * @param display
     */
    protected Border(Display display) { // �C���X�^���X�������Ɂu���g�v�������Ŏw��
        this.display = display;
    }
}
