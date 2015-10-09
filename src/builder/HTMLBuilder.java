package builder;

import java.io.*;

public class HTMLBuilder implements Builder {
    private String filename;                                    // �쐬����t�@�C����
    private PrintWriter writer;                                 // �t�@�C���ɏ�������PrintWriter

    @Override
    public void makeTitle(String title) {                       // HTML�t�@�C���ł̃^�C�g��
        filename = title + ".html";                                 // �^�C�g�������Ƀt�@�C��������
        try {
            writer = new PrintWriter(new FileWriter("./src/builder/" + filename));     // PrintWriter�����
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");    // �^�C�g�����o��
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {                        // HTML�t�@�C���ł̕�����
        writer.println("<p>" + str + "</p>");                       // <p>�^�O�ŏo��
    }

    @Override
    public void makeItems(String[] items) {                     // HTML�t�@�C���ł̉ӏ�����
        writer.println("<ul>");                                     // <ul>��<li>�ŏo��
        for (String item : items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {                                       // �����̊���
        writer.println("</body></html>");                           // �^�O�����
        writer.close();                                             // �t�@�C�����N���[�Y
    }

    @Override
    public String getResult() {                                 // ������������
        return filename;                                            // �t�@�C������Ԃ�
    }
}
