package abstractFactory.factory;

/**
 *
 * @author kinoshita_h
 */
public abstract class Factory {

    /**
     *
     * @param classname
     * @return
     */
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("ÉNÉâÉX " + classname + " Ç™å©Ç¬Ç©ÇËÇ‹ÇπÇÒÅB");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    /**
     *
     * @param caption
     * @param url
     * @return
     */
    public abstract Link createLink(String caption, String url);

    /**
     *
     * @param caption
     * @return
     */
    public abstract Tray createTray(String caption);

    /**
     *
     * @param title
     * @param author
     * @return
     */
    public abstract Page createPage(String title, String author);
}
