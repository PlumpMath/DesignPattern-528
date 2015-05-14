package command;

import command.drawer.DrawCommand;
import command.drawer.DrawCanvas;
import command.command.MacroCommand;
import command.command.Command;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author kinoshita_h
 */
public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    // �`�旚��
    private final MacroCommand history = new MacroCommand();
    // �`��̈�
    private final DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // �����{�^��
    private final JButton clearButton  = new JButton("clear");

    // �R���X�g���N�^

    /**
     *
     * @param title
     */
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        show();
    }

    // ActionListener�p
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.repaint();
        }
    }

    // MouseMotionListener�p
    @Override
    public void mouseMoved(MouseEvent e) {
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener�p
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowOpened(WindowEvent e) {}

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
