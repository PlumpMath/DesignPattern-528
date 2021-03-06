package command.drawer;

import command.command.MacroCommand;
import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    // �`��F
    private final Color color = Color.red;
    // �`�悷��_�̔��a
    private final int radius = 6;
    // ����
    private final MacroCommand history;
    
    // �R���X�g���N�^
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }
    
    // ����S�̂��ĕ`��
    @Override
    public void paint(Graphics g) {
        history.execute();
    }
    
    // �`��
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
