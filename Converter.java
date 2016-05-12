/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package converter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Yilin.Zhao14
 */
public class Converter extends JFrame {
    private static final int ConRate = 7;
    private JTextField humanYrs = new JTextField(3);
    private JTextField dogYrs = new JTextField(3);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Converter();// TODO code application logic here
    }
    public Converter(){
        super("Dog Year Converter");
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        
        JButton convertBtn = new JButton("Convert");
        convertBtn.addActionListener(new ConvertBtnListener());
        dogYrs.addActionListener(new ConvertBtnListener());
        humanYrs.setEditable(false);
        
        content.add(new JLabel("Dog Years"));
        content.add(dogYrs);
        content.add(new JLabel("Human Years"));
        content.add(humanYrs);
        
        setContentPane(content);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public class ConvertBtnListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String dyStr = dogYrs.getText();
            int dyears = Integer.parseInt(dyStr);
            int hyears = dyears*ConRate;
            humanYrs.setText(""+hyears);
        }
    }
}
