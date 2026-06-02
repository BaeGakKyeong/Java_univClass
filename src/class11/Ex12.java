package class11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ex12 extends JFrame{
    private JLabel imgLabel = new JLabel();

    public Ex12(){
        setTitle("Menu에 Action 리스너 만들기 예제");
        createMenu();
        getContentPane().add(imgLabel, BorderLayout.CENTER);
        setSize(250, 200);
        setVisible(true);
    }

    public void createMenu(){
        JMenuBar mb = new JMenuBar();
        JMenuItem[] menuItem = new JMenuItem[4];

        String[] itemTitle = {"Load", "Hide", "ReShow", "Exit"};
        JMenu screeMenu = new JMenu("Screen");

        MenuActionListener listener = new MenuActionListener();

        for(int i = 0; i < menuItem.length; i++){
            menuItem[i] = new JMenuItem(itemTitle[i]);
            menuItem[i].addActionListener(listener);
            screeMenu.add(menuItem[i]);
        }

        mb.add(screeMenu);
        setJMenuBar(mb);
    }

    class MenuActionListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String cmd = e.getActionCommand();
            switch(cmd){
                case "Load" :
                    if(imgLabel.getIcon() != null) return;
                    imgLabel.setIcon(new ImageIcon("images/img.jpg"));
                    break;
                case "Hide" :
                    imgLabel.setVisible(false); break;
                case "ReShow" : 
                    imgLabel.setVisible(true); break;
                case "Exit" : 
                    System.exit(0); break;
            }
        }
    }

    public static void main(String[] args){
        new Ex12();
    }
}
