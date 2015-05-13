package factoryMethod.idcard;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import java.util.*;

/**
 *
 * @author kinoshita_h
 */
public class IDCardFactory extends Factory {
    private final List owners = new ArrayList();

    /**
     *
     * @param owner
     * @return
     */
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    /**
     *
     * @param product
     */
    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    /**
     *
     * @return
     */
    public List getOwners() {
        return owners;
    }
}
