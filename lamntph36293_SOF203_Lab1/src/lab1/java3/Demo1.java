/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1.java3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class Demo1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("JPanel - Fpoly");
        f.setLocation(200, 200);
        f.setSize(400, 200);
        JPanel p = new JPanel();
        f.add(p);
        JButton buttons[] = new JButton[9];
        for(int i=0;i<9;i++){
            buttons[i]=new JButton("Button"+(i+1));
            p.add(buttons[i]);
        }
        f.setVisible(true);
    }
}
