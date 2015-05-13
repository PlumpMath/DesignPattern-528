package iterator;

/**
 * 数え上げ、スキャンを行うインタフェース
 * @author kinopp
 */
public interface Iterator {

    /**
     *
     * @return
     */
    public abstract boolean hasNext();

    /**
     *
     * @return
     */
    public abstract Object next();
}
