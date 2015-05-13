package interpreter;

// <repeat command> ::= repeat <number> <command list>

/**
 *
 * @author kinoshita_h
 */
public class RepeatCommandNode extends Node {
    private int number;
    private Node commandListNode;

    /**
     *
     * @param context
     * @throws ParseException
     */
    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("repeat");
        number = context.currentNumber();
        context.nextToken();
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }
    @Override
    public String toString() {
        return "[repeat " + number + " " + commandListNode + "]";
    }
}
