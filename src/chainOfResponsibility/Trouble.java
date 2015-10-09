package chainOfResponsibility;

public class Trouble {
    private final int number;             // トラブル番号

    public Trouble(int number) {    // トラブルの生成
        this.number = number;
    }

    public int getNumber() {        // トラブル番号を得る
        return number;
    }
    
    @Override
    public String toString() {      // トラブルの文字列表現
        return "[Trouble " + number + "]";
    }
}
