package flyweight;

/**
 *
 * @author kinopp
 */
public class Main {

    /**
     * ���C��
     * @param args �����܂��̓n�C�t���ō\������镶����
     */
    public static void main(String[] args) {
//        // ���s���p�����[�^���Ȃ��ꍇ�̓G���[
//        if (args.length == 0) {
//            System.out.println("Usage: java Main digits");
//            System.out.println("Example: java Main 1212123");
//            System.out.println("args.length:" + args.length);
//            System.exit(0);
//        }

        //BigString bs = new BigString(args[0]);
        // �u121-213�v��\��
        BigString bs = new BigString("121-213");
        bs.print();
    }
}
