package composite;

/**
 *
 * @author kinoshita_h
 */
public class FileTreatmentException extends RuntimeException {      // RuntimeExceptionで正しいか？

    /**
     *
     */
        public FileTreatmentException() {
    }

    /**
     *
     * @param msg
     */
    public FileTreatmentException(String msg) {
        super(msg);
    }
}
