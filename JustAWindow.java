/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package justawindow;
import javax.swing.*;
 import javax.swing.event.*;
 import java.awt.*;
 import java.awt.event.*;
 public class JustAWindow {
  public static void main(String[] args) {
   JFrame a=new JFrame("中继数据库系统");
   Container c=new  Container();
   //Swing更强调容器的概念，一般不允许之间将组件放置到顶层容器中
  //而是放在容器框架中，而awt则是直接放的
  a.setSize(200,200);
   a.setLocation(100, 200);
   a.setLayout(new BorderLayout());
   JButton b=new JButton("GO");
   c=a.getContentPane();
   c.add(b,BorderLayout.SOUTH);
   a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   a.setVisible(true);
  }

}




