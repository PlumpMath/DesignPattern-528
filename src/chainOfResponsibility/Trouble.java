package chainOfResponsibility;

/**
 *
 * @author kinoshita_h
 */
public class Trouble {
    private final int number;             // トラブル番号

    /**
     *
     * @param number
     */
    public Trouble(int number) {    // トラブルの生成
        this.number = number;
    }

    /**
     *
     * @return
     */
    public int getNumber() {        // トラブル番号を得る
        return number;
    }
    @Override
    public String toString() {      // トラブルの文字列表現
        return "[Trouble " + number + "]";
    }
}
