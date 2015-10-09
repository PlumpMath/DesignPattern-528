package command.command;

import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements Command {
    // –½—ß‚ÌW‡
    private final Stack commands = new Stack();
    
    // Às
    @Override
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) 
            ((Command)it.next()).execute();
    }
    
    // ’Ç‰Á
    public void append(Command cmd) {
        if (cmd != this) 
            commands.push(cmd);
    }
    
    // ÅŒã‚Ì–½—ß‚ğíœ
    public void undo() {
        if (!commands.empty())
            commands.pop();
    }
    
    // ‘S•”íœ
    public void clear() {
        commands.clear();
    }
}
