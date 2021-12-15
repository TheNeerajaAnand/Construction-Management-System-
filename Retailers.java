package Project;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Retailers {
   private JFrame mainFrame;
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
   private JPanel buttonPanel;
   public Retailers(){
      prepareGUI();
   }
   public static void main(String[] args){
	   Retailers swingControlDemo = new Retailers();      
      swingControlDemo.showTableDemo();
   }
   private void prepareGUI(){
      mainFrame = new JFrame("Construction Management");
      mainFrame.setSize(500,400);
      mainFrame.setLayout(new GridLayout(3, 1));

      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });   
      
      JButton submitButton = new JButton("Create");
		
      submitButton.setBounds(10, 160, 80, 25);
      buttonPanel = new JPanel();
      buttonPanel.add(submitButton);
      headerLabel = new JLabel("", JLabel.CENTER);        
      statusLabel = new JLabel("",JLabel.CENTER);    
      statusLabel.setSize(350,100);

      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(buttonPanel);
      //mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }
   private void showTableDemo(){
      headerLabel.setText("Retailers"); 
      
      String[] columnNames = {"Comp code", "Company" , "Cost"};
      Object[][] data = {
    	      };
      JTable table = new JTable(data, columnNames);
      JScrollPane scrollPane = new JScrollPane(table);
      scrollPane.setSize(300, 300);
      table.setFillsViewportHeight(true);
      controlPanel.add(scrollPane);      
      mainFrame.setVisible(true);     
   }    
}