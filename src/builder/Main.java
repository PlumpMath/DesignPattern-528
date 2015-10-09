package builder;

public class Main {

    public static void main(String[] args) {
        
        // �uplain�v�܂��́uhtml�v���w��
        args = new String[1];
        args[0] = "html";
        
        if (args.length != 1 && !args[0].equals("plain") && !args[0].equals("html")) {
            usage();
            System.exit(0);
        }
        
        Builder builder = null;
        String str = null;
        if (args[0].equals("plain")) {
            builder = new TextBuilder();
            str = "";
        } else if (args[0].equals("html")) {
            builder = new HTMLBuilder();
            str = "���쐬";
        }
        
        // Director�N���X�Ɂuplain�v�܂��́uhtml�v�ǂ���ō쐬���邩���w��B
        // TextBuilder�܂���HTMLBuilder�̃C���X�^���X��n���B
        Director director = new Director(builder);
        // �A���S���Y�����L�ڂ������\�b�h�����s�B
        director.construct();
        // ���ʂ��擾
        String result = builder.getResult();
        // ���ʂ�\��
        System.out.println(result + str);

    }

    /*
     * �s���ȃp�����[�^�ݒ莞�A���s�̎菇��\��
     */
    public static void usage() {
        System.out.println("Usage: java Main plain      �v���[���e�L�X�g�ŕ����쐬");
        System.out.println("Usage: java Main html       HTML�t�@�C���ŕ����쐬");
    }
}
