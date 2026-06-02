package class12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class ShapePanel_ExPlus extends JPanel{
    private Color color1 = Color.BLUE;
    private Color color2 = Color.BLUE;
    private Color color3 = Color.MAGENTA;

    private int x1 = 10, y1 = 10;
    private int x2 = 50, y2 = 50;
    private int x3 = 90, y3 = 90;

    public void changeColors(){
        Random rand = new Random();
        color1 = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        color2 = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        color3 = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
    public void changePositions(){
        Random rand = new Random();

        int maxX = Math.max(1, getWidth() - 50);
        int maxY = Math.max(1, getHeight() - 50);

        x1 = rand.nextInt(maxX); y1 = rand.nextInt(maxY);
        x2 = rand.nextInt(maxX); y2 = rand.nextInt(maxY);
        x3 = rand.nextInt(maxX); y3 = rand.nextInt(maxY);
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(color1);
        g.drawRect(x1, y1, 50, 50);

        g.setColor(color2);
        g.drawRect(x2, y2, 50, 50);

        g.setColor(color3);
        g.drawRect(x3, y3, 50, 50);
    }
}

class GraphicMainFrame_ExPlus extends JFrame{
    public GraphicMainFrame_ExPlus(){
        ShapePanel_ExPlus shapePanel = new ShapePanel_ExPlus();
        JPanel buttonPanel = new JPanel();
        JButton colorBtn = new JButton("색상 변경");
        JButton positionBtn = new JButton("위치 변경");

        setTitle("Random Color & Position Rectangles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(shapePanel, BorderLayout.CENTER);

        buttonPanel.add(colorBtn);
        buttonPanel.add(positionBtn);
        add(buttonPanel, BorderLayout.SOUTH);

        colorBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                shapePanel.changeColors();
                shapePanel.repaint();
            }
        });

        positionBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                shapePanel.changePositions();
                shapePanel.repaint();
            }
        });

        setSize(350, 400);
        setVisible(true);
    }
}

public class Ex04 {
    public static void main(String[] args){
        new GraphicMainFrame_ExPlus();
    }
}
