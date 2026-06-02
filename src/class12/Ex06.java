package class12;

import java.awt.*;
import javax.swing.*;

class GraphicMainFrame_6 extends JFrame{
    public GraphicMainFrame_6() {
        setTitle("drawLine 사용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());
        
        setSize(200, 150);
        setVisible(true);
    }
    class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.drawLine(20, 20, 100, 100);
        }
    }
}

public class Ex06 {
    public static void main(String[] args){
        new GraphicMainFrame_6();
    }
}
