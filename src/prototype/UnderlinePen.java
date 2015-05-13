package prototype;

import prototype.framework.Product;

/**
 *
 * @author kinoshita_h
 */
public class UnderlinePen implements Product {
    private char ulchar;

    /**
     *
     * @param ulchar
     */
    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    /**
     *
     * @param s
     */
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\""  + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length; i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    /**
     *
     * @return
     */
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
