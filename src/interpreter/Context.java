package interpreter;

import java.util.*;

/**
 *
 * @author kinoshita_h
 */
public class Context {
    private StringTokenizer tokenizer;
    private String currentToken;

    /**
     *
     * @param text
     */
    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    /**
     *
     * @return
     */
    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    /**
     *
     * @return
     */
    public String currentToken() {
        return currentToken;
    }

    /**
     *
     * @param token
     * @throws ParseException
     */
    public void skipToken(String token) throws ParseException {
        if (!token.equals(currentToken)) {
            throw new ParseException("Warning: " + token + " is expected, but " + currentToken + " is found.");
        }
        nextToken();
    }

    /**
     *
     * @return
     * @throws ParseException
     */
    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            throw new ParseException("Warning: " + e);
        }
        return number;
    }
}
