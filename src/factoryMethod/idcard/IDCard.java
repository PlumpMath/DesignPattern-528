package factoryMethod.idcard;

import factoryMethod.framework.Product;

/**
 *
 * @author kinoshita_h
 */
public class IDCard extends Product {
    private final String owner;
    IDCard(String owner) {
        System.out.println(owner + "�̃J�[�h�����܂��B");
        this.owner = owner;
    }

    /**
     *
     */
    @Override
    public void use() {
        System.out.println(owner + "�̃J�[�h���g���܂��B");
    }

    /**
     *
     * @return
     */
    public String getOwner() {
        return owner;
    }
}
