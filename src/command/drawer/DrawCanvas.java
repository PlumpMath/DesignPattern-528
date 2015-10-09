package command.drawer;

import command.command.MacroCommand;
import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    // •`‰æF
    private final Color color = Color.red;
    // •`‰æ‚·‚é“_‚Ì”¼Œa
    private final int radius = 6;
    // —š—ğ
    private final MacroCommand history;
    
    // ƒRƒ“ƒXƒgƒ‰ƒNƒ^
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }
    
    // —š—ğ‘S‘Ì‚ğÄ•`‰æ
    @Override
    public void paint(Graphics g) {
        history.execute();
    }
    
    // •`‰æ
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
