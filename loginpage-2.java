package UI_project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class loginpage1 extends JFrame implements ActionListener 
{
	 Container container1 = getContentPane();
	 JButton button1 = new JButton("EMPLOYEE");
	 JButton button2 = new JButton("CLIENT");
	 
	 Container container = getContentPane();
	 JLabel userLabel = new JLabel("USERNAME");
	 JLabel passwordLabel = new JLabel("PASSWORD");
	 JTextField userTextField = new JTextField();
	 JPasswordField passwordField = new JPasswordField();
	 JButton loginButton = new JButton("LOGIN");
	 JButton resetButton = new JButton("RESET");
	 JCheckBox showPassword = new JCheckBox("Show Password");
	    
	 loginpage1() 
	 {
	        setLayoutManager1();
	        setLocationAndSize1();
	        addComponentsToContainer1();
	        addActionEvent1();
	 }
	 public void setLayoutManager1() 
	 {
	        container1.setLayout(null);
	 }
	 public void setLocationAndSize1() 
	 {
		 button1.setBounds(50, 300, 110, 30);
	     button2.setBounds(200, 300, 100, 30);
	 }
	 public void addComponentsToContainer1() 
	 {
		 container1.add(button1);
	     container1.add(button2);
	 }
	 public void addActionEvent1() 
	 {
	     button1.addActionListener(this);
	     button2.addActionListener(this);
	 }
	 public void actionPerformed(ActionEvent e)
	 {
	        if (e.getSource() == button1) 
	        {
	        	JOptionPane.showMessageDialog(this, "WELCOME EMPLOYEE");
	        	
	        }
	        if(e.getSource() == button2)
	        {
	        	JOptionPane.showMessageDialog(this, "WELCOME CLIENT");
	        }
	 }
}
