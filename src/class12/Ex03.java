package class12;

import java.awt.*;
import javax.swing.*;

class CanvasPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.ORANGE);
        g.fillOval(25, 25, 80, 80);

        g.setColor(Color.GREEN);
        g.fillOval(40, 40, 80, 80);

        g.setColor(Color.BLACK);
        g.drawString("그래픽 기반 GUI", 60, 190);
    }
}

class GraphicMainFrame_3 extends JFrame{
    public GraphicMainFrame_3(){
        setTitle("Circles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new CanvasPanel());

        setSize(250, 250);
        setVisible(true);
    }
}

public class Ex03 {
    public static void main(String[] args){
        new GraphicMainFrame_3();
    }
}
