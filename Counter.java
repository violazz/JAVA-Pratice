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
 * @author Yilin.Zhao 1405254
 */
public class Counter extends JFrame{
    JTextField num = new JTextField();   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Counter();
    }
    public Counter(){
        super("Counter");              
        JPanel c = new JPanel();
        c.setLayout(null); //use null layout to put the subassembly on the oedered place
        //initialize subassembly and register event listener 
        JButton countU = new JButton("Count Up");
        countU.addActionListener(new CountUp());
        JLabel label = new JLabel("Count is:");        
        JButton countD = new JButton("Count Down");
        countD.addActionListener(new CountDown());
        //add subassembly into the panel
        c.add(countU);
        countU.setBounds(90,30,120,35); //x:90 y:30 width:120 height:35
        c.add(label);
        label.setBounds(120,80,55,35); //x:120 y:30+35+15=80 width:70 hieght:35
        c.add(num);
        num.setBounds(175,85,35,25); //x:120+55=175 y:80 width:35 height:25
        c.add(countD);
        countD.setBounds(90,130,120,35); //x:90 y:80+35+15=130 width:120 height:35
        
        setSize(300,235); //Frame size 
        setContentPane(c); //replace to the container c
        setLocationRelativeTo(null); //center of the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        setVisible(true);
    }
    //Event: increment by 5 
    public class CountUp implements ActionListener{
        public void actionPerformed(ActionEvent e){            
            String numStr = num.getText();
            boolean isNum = numStr.matches("^[+-]?[0-9]+$"); //use regular expressoin to check if the input is integer number
            if (isNum==false){
                JOptionPane.showMessageDialog(null,"Please enter a integer number.","Attention",JOptionPane.ERROR_MESSAGE); //pop up a error dialog
            }else{
                int countNum = Integer.parseInt(numStr);
                int newNum = countNum + 5;
                num.setText("" + newNum);
            }                    
        }                   
    }
    //Event: decrement by 2 
    public class CountDown implements ActionListener{       
        public void actionPerformed(ActionEvent e) {           
            String numStr = num.getText();
            boolean isNum = numStr.matches("^[+-]?[0-9]+$");
            if (isNum==false){
                JOptionPane.showMessageDialog(null,"Please enter a integer number.","Attention",JOptionPane.ERROR_MESSAGE);
            }else{
                int countNum = Integer.parseInt(numStr);
                int newNum = countNum - 2;
                num.setText("" + newNum);
            }            
        }
    }
}
