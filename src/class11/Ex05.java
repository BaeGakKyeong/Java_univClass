package class11;

import javax.swing.*;
import java.awt.*;

public class Ex05 extends JFrame{
    public Ex05(){
        setTitle("체크박스 만들기 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame의 X단추를 눌렀을 때, default값으로 설정하는 것. 
                                                        //EXIT_ON_CLOSE는 X단추를 누를 때, 메모리 값이 반환되며 프로그램을 완전히 종료하는 것을 의미

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //세개의 체크박스를 생성한다.
        
        JCheckBox apple = new JCheckBox("사과");
        JCheckBox pear = new JCheckBox("배", true); //true는 default값으로 체크박스에 체크됨.
        JCheckBox cherry = new JCheckBox("체리");

        c.add(apple);
        c.add(pear);
        c.add(cherry);

        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args){
        new Ex05();
    }
}
