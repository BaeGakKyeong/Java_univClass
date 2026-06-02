package class12;

import java.awt.*;
import javax.swing.*;

class CoordinatePanel extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.RED);

        g.drawLine(15, 15, 200, 15);
        g.drawString("X 축", 100, 30);

        g.drawLine(15, 15, 15, 150);
        g.drawString("Y 축", 20, 100);
        
        g.drawString("(0, 0)", 10, 10);
    }
}
class GraphicMainFrame_1 extends JFrame{
    public GraphicMainFrame_1(){
        setTitle("X/Y Coordinates");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        setContentPane(new CoordinatePanel());

        setSize(250, 250);
        setVisible(true);
    }
}


public class Ex01{
    public static void main(String[] args){
        new GraphicMainFrame_1();
    }
}

