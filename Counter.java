/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package counter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Yilin.Zhao14
 */
public class Counter extends JFrame{
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Counter();// TODO code application logic here
    }
    public Counter(){
        super("Counter");
        setSize(300,235);
        setLocationRelativeTo(null);
        setLayout(null); 
        
        JButton countU = new JButton("Count Up");
        countU.addActionListener(new CountUp());
        JLabel count = new JLabel("Count is:");
        JTextField num = new JTextField();
        JButton countD = new JButton("Count Down");
        //countD.addActionListener(new CountDown());
        getContentPane().add(countU);
        countU.setBounds(90,30,120,35);
        getContentPane().add(count);
        count.setBounds(125, 80, 70, 35);
        getContentPane().add(num);
        num.setBounds(180, 80, 30,30);
        getContentPane().add(countD);
        countD.setBounds(90, 130, 120, 35);
             
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        setVisible(true);
    }
    public class CountUp implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
        }                   
    }
}
