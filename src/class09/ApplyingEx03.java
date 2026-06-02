package class09;
import java.awt.*;
import javax.swing.*;

public class ApplyingEx03 extends JFrame{
    public ApplyingEx03(){
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(5, 10));

        String text;
        JButton button;
        for(int i = 1; i <= 50; i++){
            if(i % 10 == 0){

            }
            text = Integer.toString(i);
            button = new JButton(text);
            contentPane.add(button);
        }

        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args){
        new ApplyingEx03();
    }
}
