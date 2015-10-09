package factoryMethod.idcard;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import java.util.*;

public class IDCardFactory extends Factory {
    private final List owners = new ArrayList();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
