package class12;

import java.awt.*;
import javax.swing.*;

class ShapePanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.drawRect(10, 10, 50, 50);
        g.drawRect(50, 50, 50, 50);

        g.setColor(Color.MAGENTA);
        g.drawRect(90, 90, 50, 50);
    }
}

class GraphicMainFrame_2 extends JFrame{
    public GraphicMainFrame_2(){
        setTitle("Rectangles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new ShapePanel());

        setSize(250, 250);
        setVisible(true);
    }
}

public class Ex02 {
    public static void main(String[] args){
        new GraphicMainFrame_2();
    }
}
