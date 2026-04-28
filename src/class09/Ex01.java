package class09;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex01 extends JFrame{
    public Ex01(){
        setTitle("300 * 300 스윙 프레임 만들기");
        setSize(300, 300);
        setVisible(true);
    }

    public class FirstGUI{
        public static void main(String[] args){
            Ex01 fm = new Ex01();
        }
    }
}
