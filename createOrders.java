package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class createOrders
	extends JFrame
	implements ActionListener {

	// Components of the Form
	private Container c;
	private JLabel title;
	private JLabel mcode;
	private JTextField tmcode;
	private JLabel dod;
	private JTextField tdod;
	private JLabel status;
	private JTextField tstatus;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
	public createOrders()
	{
		setTitle("Create Orders");
		setBounds(300, 90, 900, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);

		title = new JLabel("Create Orders");
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		title.setSize(300, 30);
		title.setLocation(300, 30);
		c.add(title);
		
		mcode = new JLabel("mcode");
		mcode.setFont(new Font("Arial", Font.PLAIN, 20));
		mcode.setSize(100, 20);
		mcode.setLocation(100, 100);
		c.add(mcode);

		tmcode = new JTextField();
		tmcode.setFont(new Font("Arial", Font.PLAIN, 15));
		tmcode.setSize(190, 20);
		tmcode.setLocation(200, 100);
		c.add(tmcode);
		
		dod = new JLabel("DOD");
		dod.setFont(new Font("Arial", Font.PLAIN, 20));
		dod.setSize(100, 20);
		dod.setLocation(100, 150);
		c.add(dod);

		tdod = new JTextField();
		tdod.setFont(new Font("Arial", Font.PLAIN, 15));
		tdod.setSize(150, 20);
		tdod.setLocation(200, 150);
		c.add(tdod);

		status = new JLabel("status");
		status.setFont(new Font("Arial", Font.PLAIN, 20));
		status.setSize(100, 20);
		status.setLocation(100, 200);
		c.add(status);

		tstatus = new JTextField();
		tstatus.setFont(new Font("Arial", Font.PLAIN, 15));
		tstatus.setSize(190, 20);
		tstatus.setLocation(200, 200);
		c.add(tstatus);

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
					= "Date of delivery : "
					+ tdod.getText() + "\n";
				String data3 = "Status : " + tstatus.getText();
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
			tmcode.setText(def);
			tdod.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			resadd.setText(def);
		}
	}
}


