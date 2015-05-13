package flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * BigChar���W�߂č�����u�傫�ȕ�����v��\���N���X
 * @author kinopp
 */
public class BigString {
    // �u�傫�ȕ����v�̔z��
    private final List<BigChar> bigchars = new ArrayList<>();

    /**
     * �R���X�g���N�^
     * @param string
     */
    public BigString(String string) {
        // BigCharFactory�I�u�W�F�N�g���擾
        // BigCharFactory��singleton�Ȃ̂ŗB��̃I�u�W�F�N�g
        BigCharFactory factory = BigCharFactory.getInstance();
        for (int i = 0; i < string.length(); i++) {
            // �w��̕��������J��Ԃ��B
            // char����BigChar�ɕϊ����A�N���X�ϐ��ł���List�Ɋi�[����B
            // getBigChar��flyweight���\�b�h�ƂȂ��Ă���A��x��������
            // �����ł���΃I�u�W�F�N�g���g���񂷁B�܂��Asynchronized
            // �Ȃ̂Ŕr�����䂪������B
            bigchars.add(factory.getBigChar(string.charAt(i)));
        }
    }

    /**
     * �\��
     */
    public void print() {
        // �I�u�W�F�N�g�������쐬����BigChar�̃��X�g����v�f���擾���A�\������B
        bigchars.stream().forEach(bigchar -> bigchar.print());
    }
}
