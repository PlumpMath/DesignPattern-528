package builder;

/**
 *
 * @author kinoshita_h
 */
public class TextBuilder implements Builder {
    private final StringBuffer buffer = new StringBuffer();           // ���̃t�B�[���h�ɕ������\�z���Ă���

    /**
     *
     * @param title
     */
    @Override
    public void makeTitle(String title) {                       // �v���[���e�L�X�g�ł̃^�C�g��
        buffer.append("==============================\n");          // �����
        buffer.append("�w").append(title).append("�x\n");                       // �w�x���̃^�C�g��
        buffer.append("\n");                                        // ��s
    }

    /**
     *
     * @param str
     */
    @Override
    public void makeString(String str) {                        // �v���[���e�L�X�g�ł̕�����
        buffer.append('��').append(str).append("\n");                           // �����̕�����
        buffer.append("\n");                                        // ��s
    }

    /**
     *
     * @param items
     */
    @Override
    public void makeItems(String[] items) {                     // �v���[���e�L�X�g�ł̉ӏ�����
        for (String item : items) {
            buffer.append("�@�E").append(item).append("\n"); // �E���̍���
        }
        buffer.append("\n");                                        // ��s
    }

    /**
     *
     */
    @Override
    public void close() {                                       // �����̊���
        buffer.append("==============================\n");          // �����
    }

    /**
     *
     * @return
     */
    @Override
    public String getResult() {                                 // ������������
        return buffer.toString();                                   // StringBuffer��String�ɕϊ�
    }
}
