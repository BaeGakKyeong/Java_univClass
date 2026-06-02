package class12;

import java.awt.*;
import javax.swing.*;

class GraphicMainFrame_7 extends JFrame{
    public GraphicMainFrame_7(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setContentPane(new MyPanel());

        setSize(250, 250);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            
            g.setColor(Color.RED);
            g.drawOval(20, 20, 80, 80);

            g.setColor(Color.GREEN);
            g.drawRect(110, 20, 80, 80);

            g.setColor(Color.BLUE);
            g.drawRoundRect(20, 120, 120, 80, 40, 60);
        }
    }
}

public class Ex07 {
    public static void main(String[] args){
        new GraphicMainFrame_7();
    }
}
