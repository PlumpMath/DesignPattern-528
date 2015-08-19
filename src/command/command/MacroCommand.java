package command.command;

import java.util.Stack;
import java.util.Iterator;

/**
 *
 * @author kinoshita_h
 */
public class MacroCommand implements Command {
    // ���߂̏W��
    private final Stack commands = new Stack();
    // ���s

    /**
     *
     */
        @Override
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) 
            ((Command)it.next()).execute();
    }
    // �ǉ�

    /**
     *
     * @param cmd
     */
        public void append(Command cmd) {
        if (cmd != this) 
            commands.push(cmd);
    }
    // �Ō�̖��߂��폜

    /**
     *
     */
    public void undo() {
        if (!commands.empty())
            commands.pop();
    }
    // �S���폜

    /**
     *
     */
    public void clear() {
        commands.clear();
    }
}
