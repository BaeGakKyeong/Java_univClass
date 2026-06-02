package class09;
import javax.swing.*;
import java.awt.*;

public class Ex04 extends JFrame{
    public Ex04(){
        setTitle("데이터 입력창 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JLabel("이름:"));
        contentPane.add(new JTextField(10));
        contentPane.add(new JLabel("        직업:"));

        String[] jobs = {"학생", "직장인", "개발자", "기타"};
        contentPane.add(new JComboBox<>(jobs));
        contentPane.add(new JButton("Submit"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args){
        Ex04 ex = new Ex04();
    }
}
