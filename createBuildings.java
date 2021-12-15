package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class createBuildings
	extends JFrame
	implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel BNo;
	private JTextField tBNo;
	private JLabel type;
	private JTextField ttype;
	private JLabel name;
	private JTextField tname;
	private JLabel add;
	private JTextArea tadd;
	private JLabel cost;
	private JTextField tcost;	
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
	public createBuildings()
	{
		setTitle("Create Sites");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Create Sites");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);
		
		BNo = new JLabel("SNo");
		BNo.setFont(new Font("Arial", Font.PLAIN, 20));
		BNo.setSize(100, 20);
		BNo.setLocation(100, 100);
		c.add(BNo);

		tBNo = new JTextField();
		tBNo.setFont(new Font("Arial", Font.PLAIN, 15));
		tBNo.setSize(190, 20);
		tBNo.setLocation(200, 100);
		c.add(tBNo);
		
		type = new JLabel("Type");
		type.setFont(new Font("Arial", Font.PLAIN, 20));
		type.setSize(100, 20);
		type.setLocation(100, 150);
		c.add(type);

		ttype = new JTextField();
		ttype.setFont(new Font("Arial", Font.PLAIN, 15));
		ttype.setSize(150, 20);
		ttype.setLocation(200, 150);
		c.add(ttype);

		name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 200);
		c.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 200);
		c.add(tname);

		add = new JLabel("Address");
		add.setFont(new Font("Arial", Font.PLAIN, 20));
		add.setSize(100, 20);
		add.setLocation(100, 250);
		c.add(add);

		tadd = new JTextArea();
		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
		tadd.setSize(200, 75);
		tadd.setLocation(200, 250);
		tadd.setLineWrap(true);
		c.add(tadd);
		
		cost = new JLabel("Cost");
		cost.setFont(new Font("Arial", Font.PLAIN, 20));
		cost.setSize(100, 20);
		cost.setLocation(100, 350);
		c.add(cost);

		tcost = new JTextField();
		tcost.setFont(new Font("Arial", Font.PLAIN, 15));
		tcost.setSize(190, 20);
		tcost.setLocation(200, 350);
		c.add(tcost);

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
				String data1;
				String data
					= "Name : "
					+ tname.getText() + "\n";
				String data3 = "Address : " + tadd.getText();
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
			tname.setText(def);
			tadd.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			resadd.setText(def);
		}
	}
}


