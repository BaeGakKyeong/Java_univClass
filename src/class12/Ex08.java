package class12;

import java.awt.*;
import javax.swing.*;

class GraphicMainFrame_8 extends JFrame{
    public GraphicMainFrame_8() {
        setTitle("drawLine 사용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());

        setSize(250, 350);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            g.setColor(Color.RED);
            g.drawArc(20, 20, 80, 80, 90, 270);
            
            int[] x = {140, 100, 140, 180};
            int[] y = {100, 180, 260, 180};

            g.setColor(Color.BLUE);
            g.drawPolygon(x, y, 4);
        }
    }
}

public class Ex08 {
    public static void main(String[] args){
        new GraphicMainFrame_8();
    }
}
