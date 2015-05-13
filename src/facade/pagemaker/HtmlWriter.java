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
    public HtmlWriter(Writer writer) {  // コンストラクタ
        this.writer = writer;
    }

    /**
     *
     * @param title
     * @throws IOException
     */
    public void title(String title) throws IOException {    // タイトルの出力
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
    public void paragraph(String msg) throws IOException {  // 段落の出力
        writer.write("<p>" + msg + "</p>\n");
    }

    /**
     *
     * @param href
     * @param caption
     * @throws IOException
     */
    public void link(String href, String caption) throws IOException {  // リンクの出力
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    /**
     *
     * @param mailaddr
     * @param username
     * @throws IOException
     */
    public void mailto(String mailaddr, String username) throws IOException {   // メールアドレスの出力
        link("mailto:" + mailaddr, username);
    }

    /**
     *
     * @throws IOException
     */
    public void close() throws IOException {    // 閉じる
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
