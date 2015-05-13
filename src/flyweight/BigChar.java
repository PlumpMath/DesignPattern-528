package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * �u�傫�ȕ����v��\���N���X
 * @author kinopp
 */
public class BigChar {
    // �����̖��O
//    private char charname;
    // �傫�ȕ�����\�����镶����('#' '.' '\n'�̗�)
    private String fontdata;

    /**
     * �R���X�g���N�^
     * @param charname �\�������������܂��̓n�C�t���P����
     */
    public BigChar(char charname) {
//        this.charname = charname;
        try {
            // bigx.txt��ǂݍ���
            BufferedReader reader = new BufferedReader(
                new FileReader("./src/flyweight/big" + charname + ".txt")
            );
            String line;
            StringBuilder buf = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            
            // �ǂݍ��񂾃t�@�C���𕶎���ɂ���fontdata�ɕێ�
            this.fontdata = buf.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    /**
     * �傫�ȕ�����\������
     */
    public void print() {
        System.out.print(fontdata);
    }
}
