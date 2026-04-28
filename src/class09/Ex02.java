package class09;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class Ex02 extends JFrame{
    public Ex02(){
        super("올해는 꼭 핑크빛 사랑을...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        Container c = getContentPane();
        c.setBackground(Color.PINK);
        setVisible(true);
    }

    public static void main(String[] args){
        new Ex02();
    }
}
