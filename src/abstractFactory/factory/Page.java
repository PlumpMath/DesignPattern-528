package abstractFactory.factory;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author kinoshita_h
 */
public abstract class Page {

    /**
     *
     */
    protected String title;

    /**
     *
     */
    protected String author;

    /**
     *
     */
    protected ArrayList content = new ArrayList();

    /**
     *
     * @param title
     * @param author
     */
    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     *
     * @param item
     */
    public void add(Item item) {
        content.add(item);
    }

    /**
     *
     */
    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + " ���쐬���܂����B");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @return
     */
    public abstract String makeHTML();
}
