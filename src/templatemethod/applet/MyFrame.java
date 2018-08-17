package templatemethod.applet;

import javax.swing.*;
import java.awt.*;

/**
 * @author Tianlong Zhang
 * @time 2018/8/17 20:55
 * @project DesignPattern
 * @Version 1.0.0
 */
public class MyFrame extends JFrame {
    private static final long serialVersionUID = 2L;

    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Head First Design Patterns");
    }
}
