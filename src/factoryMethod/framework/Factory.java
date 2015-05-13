package factoryMethod.framework;

/**
 *
 * @author kinoshita_h
 */
public abstract class Factory {

    /**
     *
     * @param owner
     * @return
     */
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    /**
     *
     * @param owner
     * @return
     */
    protected abstract Product createProduct(String owner);

    /**
     *
     * @param product
     */
    protected abstract void registerProduct(Product product);
}
