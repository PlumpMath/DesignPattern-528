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
    public Player(String name, Strategy strategy) {         // ���O�Ɛ헪����������
        this.name = name;
        this.strategy = strategy;
    }

    /**
     *
     * @return
     */
    public Hand nextHand() {                                // �헪�ɂ����������𗧂Ă�
        return strategy.nextHand();
    }

    /**
     *
     */
    public void win() {                 // ������
        strategy.study(true);
        wincount++;
        gamecount++;
    }

    /**
     *
     */
    public void lose() {                // ������
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    /**
     *
     */
    public void even() {                // ��������
        gamecount++;
    }
    public String toString() {
        return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose" + "]";
    }
}
