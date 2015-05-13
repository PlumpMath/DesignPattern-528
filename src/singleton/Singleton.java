package singleton;

/**
 * �V���O���g���N���X�̃T���v��
 * @author kinoshita_h
 */
public class Singleton {
    // private static final�Ŏ��g�̃N���X�𐶐��B
    //  ���O������̎Q�ƕs�A�ÓI�Ȓl�A�p���ɂ��ύX�s��
    private static final Singleton singleton = new Singleton();
    // �R���X�g���N�^��private�ɂ��邱�ƂŁAnew�ɂ��I�u�W�F�N�g�����֎~�B
    private Singleton() {                                 
        System.out.println("�C���X�^���X�𐶐����܂����B");
    }

    /**
     * �C���X�^���X�擾���\�b�h
     * @return ���N���X�̃C���X�^���X
     */
    public static Singleton getInstance() {
        // ���̃��\�b�h��ʂ��Ă̂݃C���X�^���X���擾�ł���B
        // static�ȃC���X�^���X�Ȃ̂łǂ�����Ă΂�Ă���ɓ����I�u�W�F�N�g��n���B
        return singleton;
    }
}
