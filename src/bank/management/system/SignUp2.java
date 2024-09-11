package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class SignUp2 extends JFrame implements ActionListener {
	JComboBox comboBox, comboBox2,comboBox3,comboBox4,comboBox5;
	JTextField textPan,textAadhar;
	JRadioButton r1,r2,r3,r4;
	JButton next;
	String formno;
	SignUp2(String formno){
		
		super("SIGN UP FORM");
		 
		ImageIcon bank=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.jpg"));
		 Image i2=bank.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		 ImageIcon i3= new ImageIcon(i2);
		 JLabel bankImage= new JLabel(i3);
		 bankImage.setBounds(25,10,100,100);
		 add(bankImage);
		 
		 this.formno = formno;
		 
		 JLabel l1 = new JLabel("Page 2 :- ");
		 l1.setFont(new Font("Raleway",Font.BOLD,30));
		 l1.setBounds(600,30,600,40);
		 add(l1);
		 
		 JLabel l2 = new JLabel("Additional Details");
		 l2.setFont(new Font("Raleway",Font.BOLD,30));
		 l2.setBounds(530,80,600,30);
		 add(l2);
		 
		 JLabel l3 = new JLabel("Religion :");
		 l3.setFont(new Font("Raleway",Font.BOLD,18));
		 l3.setBounds(400,140,100,30);
		 add(l3);
		 
		 String religion[] = {"Select","Hindu","Islam","Sikh","Christian","Buddhists","Jainists","Judaists","Other"};
		 comboBox = new JComboBox<Object>(religion);
		 comboBox.setBackground(new Color(252,248,248));
		 comboBox.setFont(new Font("Raleway",Font.BOLD,14));
		 comboBox.setBounds(600,140,320,30);
		 add(comboBox);
		 
		 JLabel l4 = new JLabel("Category :");
		 l4.setFont(new Font("Raleway",Font.BOLD,18));
		 l4.setBounds(400,190,100,30);
		 add(l4);
		 
		 String category[] = {"Select","General","OBC","SC","ST","Other"};
		 comboBox2 = new JComboBox<Object>(category);
		 comboBox2.setBackground(new Color(252,248,248));
		 comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
		 comboBox2.setBounds(600,190,320,30);
		 add(comboBox2);
		 
		 JLabel l5 = new JLabel("Income :");
		 l5.setFont(new Font("Raleway",Font.BOLD,18));
		 l5.setBounds(400,240,100,30);
		 add(l5);
		 
		 String income[] = {"Select","Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
		 comboBox3 = new JComboBox<Object>(income);
		 comboBox3.setBackground(new Color(252,248,248));
		 comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
		 comboBox3.setBounds(600,240,320,30);
		 add(comboBox3);
		 
		 JLabel l6 = new JLabel("Education :");
		 l6.setFont(new Font("Raleway",Font.BOLD,18));
		 l6.setBounds(400,300,150,30);
		 add(l6);
		 
		 String education[] = {"Select","Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
		 comboBox4 = new JComboBox<Object>(education);
		 comboBox4.setBackground(new Color(252,248,248));
		 comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
		 comboBox4.setBounds(600,300,320,30);
		 add(comboBox4);
		 
		 
		 JLabel l7 = new JLabel("Occupation :");
		 l7.setFont(new Font("Raleway",Font.BOLD,18));
		 l7.setBounds(400,340,150,30);
		 add(l7);
		 
		 String occupation[] = {"Select","Salaried","Self-Employed","Business","Student","Retired","Other"};
		 comboBox5 = new JComboBox<Object>(occupation);
		 comboBox5.setBackground(new Color(252,248,248));
		 comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
		 comboBox5.setBounds(600,340,320,30);
		 add(comboBox5);
		 
		 JLabel l8 = new JLabel("PAN Number : ");
		 l8.setFont(new Font("Raleway",Font.BOLD,18));
		 l8.setBounds(400,390,150,30);
		 add(l8);
		 
		 textPan = new JTextField();
		 textPan.setFont(new Font("Raleway",Font.BOLD,18));
		 textPan.setBounds(600,390,320,30);
		 add(textPan);
		 
		 JLabel l9 = new JLabel("Aadhar Number : ");
		 l9.setFont(new Font("Raleway",Font.BOLD,18));
		 l9.setBounds(400,440,300,30);
		 add(l9);
		 
		 textAadhar = new JTextField();
		 textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
		 textAadhar.setBounds(600,440,320,30);
		 add(textAadhar);
		 
		 JLabel l10 = new JLabel("Senior Citizen : ");
		 l10.setFont(new Font("Raleway",Font.BOLD,18));
		 l10.setBounds(400,510,180,30);
		 add(l10);
		 r1 = new JRadioButton("Yes");
		 r1.setFont(new Font("Raleway",Font.BOLD,18));
		 r1.setBackground(new Color(252,248,248));
		 r1.setBounds(640,510,100,30);
		 add(r1);
		 r2 = new JRadioButton("No");
		 r2.setFont(new Font("Raleway",Font.BOLD,18));
		 r2.setBackground(new Color(252,248,248));
		 r2.setBounds(780,510,100,30);
		 add(r2);
		 
		 ButtonGroup buttonGroup = new ButtonGroup();
		 buttonGroup.add(r1);
		 buttonGroup.add(r2);
			
		 JLabel l11 = new JLabel("Existing Account : ");
		 l11.setFont(new Font("Raleway",Font.BOLD,18));
		 l11.setBounds(400,560,180,30);
		 add(l11);
		 r3 = new JRadioButton("Yes");
		 r3.setFont(new Font("Raleway",Font.BOLD,18));
		 r3.setBackground(new Color(252,248,248));
		 r3.setBounds(640,560,100,30);
		 add(r3);
		 r4 = new JRadioButton("No");
		 r4.setFont(new Font("Raleway",Font.BOLD,18));
		 r4.setBackground(new Color(252,248,248));
		 r4.setBounds(780,560,100,30);
		 add(r4);
		 
		 ButtonGroup buttonGroup2 = new ButtonGroup();
		 buttonGroup2.add(r3);
		 buttonGroup2.add(r4);
		 JLabel l12 = new JLabel("Form No : ");
		 l12.setFont(new Font("Raleway",Font.BOLD,26));
		 l12.setBounds(1000,10,180,30);
		 add(l12);
		 
		 JLabel l13 = new JLabel(formno);
		 l13.setFont(new Font("Raleway",Font.BOLD,24));
		 l13.setBounds(1200,10,100,30);
		 add(l13);
		 
		 
		 
		 next = new JButton("Next");
		 next.setFont(new Font("Raleway",Font.BOLD,18));
		 next.setBackground(Color.BLACK);
		 next.setForeground(Color.WHITE);
		 next.setBounds(1100,600,150,30);
		 next.addActionListener(this);
		 add(next);
		 
		 
		 
		
		setLayout(null);
		setSize(2000,2000);
		setLocation(-5,-5);
		getContentPane().setBackground(new Color(240,230,140));
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String rel = (String) comboBox.getSelectedItem();
		String cate =(String) comboBox2.getSelectedItem();
		String inc = (String) comboBox3.getSelectedItem();
		String edu = (String) comboBox4.getSelectedItem();
		String occ = (String) comboBox5.getSelectedItem();
		String pan = textPan.getText();
		String aadhar = textAadhar.getText();
		String sCitizen = " ";
		if((r1.isSelected())) {
			sCitizen = "Yes";
		}else if(r2.isSelected()) {
			sCitizen = "No";
		}
		
		String eAccount  = " ";
		if((r3.isSelected())) {
			eAccount = "Yes";
		}else if(r4.isSelected()) {
			eAccount = "No";
		}
		
		try {
			if(textPan.getText().equals("")|| textAadhar.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Fill all the fields");
			}else {
				Conn c = new Conn();
				String q ="insert into SignupTwo values('"+formno+ "','"+rel+"','"+cate+ "','"+inc+ "','"+edu+ "','"+occ+ "','"+pan+ "','"+aadhar+"','"+sCitizen+ "','"+eAccount+ "' )";
				c.statement.executeUpdate(q);
				new SignUp3(formno);
				setVisible(false);
			}
		}catch (Exception E) {
			E.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new SignUp2("");
	}

}
