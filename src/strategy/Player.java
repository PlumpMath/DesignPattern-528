package strategy;

/**
 *
 * @author kinoshita_h
 */
public class Player {
    private String name;
    private Strategy strategy;
    private int wincount;
    private int losecount;
    private int gamecount;

    /**
     *
     * @param name
     * @param strategy
     */
    public Player(String name, Strategy strategy) {         // 名前と戦略を授けられる
        this.name = name;
        this.strategy = strategy;
    }

    /**
     *
     * @return
     */
    public Hand nextHand() {                                // 戦略におうかがいを立てる
        return strategy.nextHand();
    }

    /**
     *
     */
    public void win() {                 // 勝った
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    /**
     *
     */
    public void lose() {                // 負けた
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    /**
     *
     */
    public void even() {                // 引き分け
        gamecount++;
    }
    public String toString() {
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}
