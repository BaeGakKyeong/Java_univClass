package class12;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

class GraphicMainFrame_5 extends JFrame{
    public GraphicMainFrame_5(){
        setTitle("문자열, Color, Font 사용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(300, 300);
        setVisible(true);
    }
    class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);

            g.setColor(Color.BLUE);
            g.drawString("자바가 정말 재밋다.~~", 30, 30);

            g.setColor(new Color(255, 0, 0));
            g.setFont(new Font("Arial", Font.ITALIC, 30));
            g.drawString("How much?", 30, 70);

            g.setColor(new Color(0x00ff00ff));
            for(int i = 1; i <= 4; i++){
                g.setFont(new Font("Jokerman", Font.ITALIC, i * 10));
                g.drawString("This much1!", 30, 60 + i * 40);
            }
        }
    }
}

public class Ex05 {
    public static void main(String[] args){
        new GraphicMainFrame_5();
    }
}
