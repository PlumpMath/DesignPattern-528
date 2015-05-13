package facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author kinoshita_h
 */
public class Database {
    private Database() {    // newでインスタンス生成させないためにprivate宣言
    }

    /**
     *
     * @param dbname
     * @return
     */
    public static Properties getProperties(String dbname) { // データベース名からPropertiesを得る
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("./src/facade/" + filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
