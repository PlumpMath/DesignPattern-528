package iterator;

/**
 * 数え上げ、スキャンを行うインタフェース
 * @author kinopp
 */
public interface Iterator {

    public abstract boolean hasNext();

    public abstract Object next();
}
