package UI_project;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class client_register extends JFrame implements ActionListener
{
	Container container = getContentPane();
	JLabel cenoLabel = new JLabel("CENO:");
    JLabel unameLabel = new JLabel("UNAME:");
    JLabel nameLabel = new JLabel("NAME:");
    JLabel phoneLabel = new JLabel("PHONE:");
    JLabel addressLabel = new JLabel("ADDRESS:");
    JLabel emailLabel = new JLabel("EMAIL:");
    
    JTextField cenoTextField = new JTextField();
    JTextField unameTextField = new JTextField();
    JTextField nameTextField = new JTextField();
    JTextField phoneTextField = new JTextField();
    JTextField addressTextField = new JTextField();
    JTextField emailTextField = new JTextField();
    
    JButton registerButton = new JButton("REGISTER");
    
    client_register()
    {
        setLayoutManager2();
        setLocationAndSize2();
        addComponentsToContainer2();
        addActionEvent2();

    }
    
    public void setLayoutManager2() 
    {
        container.setLayout(null);
    }
	
    public void setLocationAndSize2()
    {
    	cenoLabel.setBounds(50, 60, 100, 30);
        unameLabel.setBounds(50, 150, 100, 30);
        nameLabel.setBounds(50, 220, 100, 30);
        phoneLabel.setBounds(50, 290, 100, 30);
        addressLabel.setBounds(50, 360, 100, 30);
        emailLabel.setBounds(50, 430, 100, 30);
        
        cenoTextField.setBounds(150, 60, 150, 30);
        unameTextField.setBounds(150, 150, 150, 30);
        nameTextField.setBounds(150, 220, 150, 30);
        phoneTextField.setBounds(150, 290, 150, 30);
        addressTextField.setBounds(150, 360, 150, 30);
        emailTextField.setBounds(150, 430, 150, 30);
        
        registerButton.setBounds(150, 500, 100, 30);      
    }
    
    public void addComponentsToContainer2() {
    	container.add(cenoLabel);
        container.add(unameLabel);
        container.add(nameLabel);
        container.add(phoneLabel);
        container.add(addressLabel);
        container.add(emailLabel);
        
        container.add(cenoTextField);
        container.add(unameTextField);
        container.add(nameTextField);
        container.add(phoneTextField);
        container.add(addressTextField);
        container.add(emailTextField);
       
        container.add(registerButton);
       
    }
    
    public void addActionEvent2() {
        registerButton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
	 {
	        if (e.getSource() == registerButton) 
	        {
	        	JOptionPane.showMessageDialog(this, "Client Successfully Registered");
	        }
	 }
}
