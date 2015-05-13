package bridge;

/**
 *
 * @author kinoshita_h
 */
public class Display {
    private final DisplayImpl impl;

    /**
     *
     * @param impl
     */
    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    /**
     *
     */
    public void open() {
        impl.rawOpen();
    }

    /**
     *
     */
    public void print() {
        impl.rawPrint();
    }

    /**
     *
     */
    public void close() {
        impl.rawClose();
    }

    /**
     *
     */
    public final void display() {
        open();
        print();                    
        close();
    }
}
