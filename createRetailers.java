package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class createRetailers
	extends JFrame
	implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel comp_code;
	private JTextField tcomp_code;
	private JLabel company;
	private JTextField tcompany;
	private JLabel contact;
	private JTextField tcontact;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
	public createRetailers()
	{
		setTitle("Create Retailers");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Create Retailers");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);
		
		comp_code = new JLabel("comp_code");
		comp_code.setFont(new Font("Arial", Font.PLAIN, 20));
		comp_code.setSize(100, 20);
		comp_code.setLocation(100, 100);
		c.add(comp_code);

		tcomp_code = new JTextField();
		tcomp_code.setFont(new Font("Arial", Font.PLAIN, 15));
		tcomp_code.setSize(190, 20);
		tcomp_code.setLocation(200, 100);
		c.add(tcomp_code);
		
		company = new JLabel("company");
		company.setFont(new Font("Arial", Font.PLAIN, 20));
		company.setSize(100, 20);
		company.setLocation(100, 150);
		c.add(company);

		tcompany = new JTextField();
		tcompany.setFont(new Font("Arial", Font.PLAIN, 15));
		tcompany.setSize(150, 20);
		tcompany.setLocation(200, 150);
		c.add(tcompany);

		contact = new JLabel("contact");
		contact.setFont(new Font("Arial", Font.PLAIN, 20));
		contact.setSize(100, 20);
		contact.setLocation(100, 200);
		c.add(contact);

		tcontact = new JTextField();
		tcontact.setFont(new Font("Arial", Font.PLAIN, 15));
		tcontact.setSize(190, 20);
		tcontact.setLocation(200, 200);
		c.add(tcontact);

		term = new JCheckBox("Accept Terms And Conditions.");
		term.setFont(new Font("Arial", Font.PLAIN, 15));
		term.setSize(250, 20);
		term.setLocation(150, 400);
		c.add(term);

		sub = new JButton("Create");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);
		c.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		c.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		c.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		c.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		c.add(resadd);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == sub) {
			if (term.isSelected()) {
				String data
					= "Company : "
					+ tcompany.getText() + "\n";
				String data3 = "Contact : " + tcontact.getText();
				tout.setText(data + data3);
				tout.setEditable(false);
				res.setText("Registration Successfully..");
			}
			else {
				tout.setText("");
				resadd.setText("");
				res.setText("Please accept the"
							+ " terms & conditions..");
			}
		}

		else if (e.getSource() == reset) {
			String def = "";
			tcomp_code.setText(def);
			tcompany.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			resadd.setText(def);
		}
	}
}


