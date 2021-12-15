package UI_project;

import javax.swing.*;
import javax.swing.JFrame;

public class client_invent
{
	JFrame f;    
    client_invent()
    {    
    f=new JFrame();    
    String data[][]={ {"1","A1","PURCHASED"},    
                          {"2","E27","PENDING"},    
                          {"","",""}};    
    String column[]={"RegNo","SNo","STATUS"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp); 
    f.setTitle("CLIENT INVENTORY");
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) 
{    
 new client_invent();
}
} 
