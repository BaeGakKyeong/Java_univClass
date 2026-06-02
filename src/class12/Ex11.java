package class12;

import java.awt.*;
import javax.swing.*;

class GraphicMainFrame_11 extends JFrame{
    public GraphicMainFrame_11(){
        setTitle("패널의 크기에 맞추어 이미지 그리기"); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new MyPanel());
        setSize(200, 300);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        private ImageIcon icon = new ImageIcon("images/image0.jpg");
        private Image img = icon.getImage();

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
        }
    }
}

public class Ex11 {
    public static void main(String[] args){
        new GraphicMainFrame_11();
    }
}
