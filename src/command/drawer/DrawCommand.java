package command.drawer;

import command.command.Command;
import java.awt.Point;

/**
 *
 * @author kinoshita_h
 */
public class DrawCommand implements Command {
    // �`��Ώ�

    /**
     *
     */
        protected Drawable drawable;
    // �`��ʒu
    private final Point position;
    // �R���X�g���N�^

    /**
     *
     * @param drawable
     * @param position
     */
        public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    // ���s

    /**
     *
     */
        @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
