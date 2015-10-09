package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.Link;
import abstractFactory.factory.Page;
import abstractFactory.factory.Tray;

public class Main {

    public static void main(String[] args) {
        
        // ���ȉ��A���Âꂩ�ɐ؂�ւ���
        String clazz = "abstractFactory.listfactory.ListFactory";
        //String clazz = "abstractFactory.tablefactory.TableFactory";
        
        
        Factory factory = Factory.getFactory(clazz);

        Link asahi = factory.createLink("�����V��", "http://www.asahi.com/");
        Link yomiuri = factory.createLink("�ǔ��V��", "http://www.yomiuri.co.jp/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("�V��");
        traynews.add(asahi);
        traynews.add(yomiuri);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("�T�[�`�G���W��");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "���� �_");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
