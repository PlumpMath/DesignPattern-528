package singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start.");
        //Singleton obj0 = new Singleton();        // �� new�ɂ��I�u�W�F�N�g�����s��
        Singleton obj1 = Singleton.getInstance();  // �V���O���g���N���X���C���X�^���X�擾
        Singleton obj2 = Singleton.getInstance();  // �ēx�A�V���O���g���N���X���C���X�^���X�擾
        // �V���O���g���N���X���擾�����C���X�^���X�͏�ɓ���ł��邱�Ƃ��킩��B
        if (obj1 == obj2) {
            System.out.println("obj1��obj2�͓����C���X�^���X�ł��B");
        } else {
            System.out.println("obj1��obj2�͓����C���X�^���X�ł͂���܂���B");
        }
        System.out.println("End.");
    }
}
