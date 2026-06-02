package class12;

import java.awt.*;
import javax.swing.*;

class GraphicMainFrame_10 extends JFrame{
    public GraphicMainFrame_10(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(300, 400);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        private ImageIcon icon = new ImageIcon("images/image0.jpg");
        private Image img = icon.getImage();
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img, 20, 20, this);
        }
    }
}

public class Ex10 {
    public static void main(String[] args){
        new GraphicMainFrame_10();
    }
}
