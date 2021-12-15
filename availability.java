package UI_project;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class availability 
{
	JFrame fr;    
    availability()
    {    
    fr=new JFrame();    
    String data[][]={ {"HOUSE","34"},    
                          {"OFFICE","27"},    
                          {"",""}};    
    String column[]={"TYPE","QUANTITY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    fr.add(sp); 
    fr.setTitle("AVAILABILITY");
    fr.setSize(300,400);    
    fr.setVisible(true);    
}     
public static void main(String[] args) 
{    
 new availability();
}
}
