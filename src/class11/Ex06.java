package class11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex06 extends JFrame{
    private JCheckBox [] fruits = new JCheckBox[3];
    private String[] names = {"사과", "배", "체리"};
    private JLabel sumLabel;

    public Ex06() {
        setTitle("체크박스와 ItemEvent 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));

        MyItemListener listener = new MyItemListener();

        for(int i = 0; i < fruits.length; i++){
            
        }
    }

    class MyItemListener implements ItemListener{
        private int sum = 0;

        public void itemStateChanged(ItemEvent e){
            if(e.getStateChange() == ItemEvent.SELECTED){
                if(e.getItem() == fruits[0]){
                    sum += 100;
                }
                else if(e.getItem() == fruits[1]){
                    sum += 500;
                }
                else{
                    sum += 20000;
                }
            }
            else{
                if(e.getItem() == fruits[0]){
                    sum -= 100;
                }
                else if(e.getItem() == fruits[1]){
                    sum -= 500;
                }
                else{
                    sum -= 20000;
                }
            }
            sumLabel.setText("현재 " + sum + "원 입니다.");
        }
    }

    public static void main(String[] args){
        new Ex06();
    }
}

