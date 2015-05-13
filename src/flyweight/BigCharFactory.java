package flyweight;

import java.util.HashMap;

/**
 * BigChar�̃C���X�^���X�����L���Ȃ��琶������N���X
 * @author kinopp
 */
public class BigCharFactory {
    // ���łɍ����BigChar�̃C���X�^���X���Ǘ�
    private final HashMap pool = new HashMap();
    // Singleton�p�^�[��
    private static final BigCharFactory singleton = new BigCharFactory();
    // �R���X�g���N�^
    private BigCharFactory() {
    }
    
    /**
     * �C���X�^���X���擾���郁�\�b�h
     * @return BigCharFactory�̗B��̃C���X�^���X
     */
    public static BigCharFactory getInstance() {
        return singleton;
    }

    /**
     * ���łɃI�u�W�F�N�g�����݂���ꍇ�͂��̃I�u�W�F�N�g��ԋp���A�Ȃ���ΐ�������
     * @param charname �ϊ�����������
     * @return BigChar�^�̕ϊ���̕���
     */
    public synchronized BigChar getBigChar(char charname) {
        // ���ɃI�u�W�F�N�g����������Ă��邩�m�F����ׂ̃Z�b�g
        BigChar bc = (BigChar)pool.get("" + charname);
        
        // ��x�������������ł���΃I�u�W�F�N�g���g���񂷁B�܂��Asynchronized
        // �Ȃ̂Ŕr�����䂪������B
        if (bc == null) {
            bc = new BigChar(charname); // ������BigChar�̃C���X�^���X�𐶐�
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
