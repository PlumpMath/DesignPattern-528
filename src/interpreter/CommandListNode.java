package interpreter;

import java.util.ArrayList;

// <command list> ::= <command>* end

/**
 *
 * @author kinoshita_h
 */
public class CommandListNode extends Node {
    private final ArrayList list = new ArrayList();

    /**
     *
     * @param context
     * @throws ParseException
     */
    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }
    @Override
    public String toString() {
        return list.toString();
    }
}
