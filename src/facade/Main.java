package facade;

import facade.pagemaker.PageMaker;

/**
 *
 * @author kinoshita_h
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome_hyuki.html");
        PageMaker.makeWelcomePage("tomura@hyuki.com", "welcome_tomura.html");
    }
}
