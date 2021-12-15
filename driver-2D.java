package UI_project;

import javax.swing.JFrame;

public class driver 
{
	public static void main(String[] a) 
	{
	    loginpage1 frame1 = new loginpage1();
        frame1.setTitle("Login");
        frame1.setVisible(true);
        frame1.setBounds(10, 10, 370, 600);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setResizable(false);
        
	}
}
