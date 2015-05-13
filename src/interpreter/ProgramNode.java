package interpreter;

// <program> ::= program <command list>

/**
 *
 * @author kinoshita_h
 */
public class ProgramNode extends Node {
    private Node commandListNode;

    /**
     *
     * @param context
     * @throws ParseException
     */
    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);
    }
    @Override
    public String toString() {
        return "[program " + commandListNode + "]";
    }
}
