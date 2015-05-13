package visitor;

import java.util.Iterator;

/**
 *
 * @author kinoshita_h
 */
public class ListVisitor extends Visitor {
    private String currentdir = "";                         // 現在注目しているディレクトリ名

    /**
     *
     * @param file
     */
    @Override
    public void visit(File file) {                  // ファイルを訪問したときに呼ばれる
        System.out.println(currentdir + "/" + file);
    }

    /**
     *
     * @param directory
     */
    @Override
    public void visit(Directory directory) {   // ディレクトリを訪問したときに呼ばれる
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
