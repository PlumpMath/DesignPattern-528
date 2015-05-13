package facade.pagemaker;

import java.io.Writer;
import java.io.IOException;

/**
 *
 * @author kinoshita_h
 */
public class HtmlWriter {
    private final Writer writer;

    /**
     *
     * @param writer
     */
    public HtmlWriter(Writer writer) {  // �R���X�g���N�^
        this.writer = writer;
    }

    /**
     *
     * @param title
     * @throws IOException
     */
    public void title(String title) throws IOException {    // �^�C�g���̏o��
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }

    /**
     *
     * @param msg
     * @throws IOException
     */
    public void paragraph(String msg) throws IOException {  // �i���̏o��
        writer.write("<p>" + msg + "</p>\n");
    }

    /**
     *
     * @param href
     * @param caption
     * @throws IOException
     */
    public void link(String href, String caption) throws IOException {  // �����N�̏o��
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    /**
     *
     * @param mailaddr
     * @param username
     * @throws IOException
     */
    public void mailto(String mailaddr, String username) throws IOException {   // ���[���A�h���X�̏o��
        link("mailto:" + mailaddr, username);
    }

    /**
     *
     * @throws IOException
     */
    public void close() throws IOException {    // ����
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
