package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class SignUp extends JFrame implements ActionListener{
	JRadioButton r1,r2,r3,m1,m2,m3;
	JButton next;
	
	JTextField textName,textFathersName,textEmail,textMs,textAdd,textCity,textPin,textState;
	JDateChooser dateChooser;
	Random ran = new Random();
	long first4 = (ran.nextLong()%9000L)+1000L;
	String first = " " + Math.abs(first4);
SignUp(){
	super("SIGN UP FORM");
	

	 ImageIcon bank=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.jpg"));
	 Image i2=bank.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
	 ImageIcon i3= new ImageIcon(i2);
	 JLabel bankImage= new JLabel(i3);
	 bankImage.setBounds(125,10,100,100);
	 add(bankImage);
	 
	 JLabel label1 = new JLabel("APPLICATION FORM NO"+first);
	 label1.setBounds(400,20,600,40);
	 label1.setForeground(Color.black);
	 label1.setFont(new Font("Raleway",Font.BOLD,40));
	 add(label1);
	
	 JLabel label2 = new JLabel("Page 1");
	 label2.setForeground(Color.black);
	 label2.setFont(new Font("Ralway",Font.BOLD,22));
	 label2.setBounds(650,70,600,30);
	 add(label2);
	 
	 JLabel label3 = new JLabel("Personal Details");
	 label3.setForeground(Color.black);
	 label3.setFont(new Font("Raleway",Font.BOLD,22));
	 label3.setBounds(600,90,600,30);
	 add(label3);
	 
	 JLabel labelName = new JLabel("Name :");
	 labelName.setFont(new Font("Raleway",Font.BOLD,20));
	 labelName.setBounds(390,130,100,100);
	 add(labelName);
	 
	 textName = new JTextField();
	 textName.setFont(new Font("Raleway",Font.BOLD,14));
	 textName.setBounds(590,165,400,30);
	 add(textName);
	 
	 JLabel labelFname = new JLabel("Father's Name :");
	 labelFname.setFont(new Font("Raleway",Font.BOLD,20));
	 labelFname.setBounds(390,180,300,100);
	 add(labelFname);
	 
	 textFathersName = new JTextField();
	 textFathersName.setFont(new Font("Raleway",Font.BOLD,14));
	 textFathersName.setBounds(590,215,400,30);
	 add(textFathersName);
	 
	 
	 JLabel labelG = new JLabel("Gender:");
	 labelG.setFont(new Font("Raleway",Font.BOLD,20));
	 labelG.setBounds(390,265,200,30);
	 add(labelG);
	 
	r1 = new JRadioButton("Male");
	r1.setFont(new Font("Raleway",Font.BOLD,20));
	r1.setBackground(new Color(222,255,220));
	r1.setBounds(590,265,100,30);
	add(r1);
	r2 = new JRadioButton("Female");
	r2.setFont(new Font("Raleway",Font.BOLD,20));
	r2.setBackground(new Color(222,255,220));
	r2.setBounds(690,265,120,30);
	add(r2);
	r3 = new JRadioButton("Other");
	r3.setFont(new Font("Raleway",Font.BOLD,20));
	r3.setBackground(new Color(222,255,220));
	r3.setBounds(810,265,120,30);
	add(r3);
	
	ButtonGroup buttonGroup = new ButtonGroup();
	buttonGroup.add(r1);
	buttonGroup.add(r2);
	buttonGroup.add(r3);
	
	JLabel DOB = new JLabel("Date of Birth");
	DOB.setFont(new Font("Raleway",Font.BOLD,20));
	DOB.setBounds(390,310,200,30);
	add(DOB);
	
	dateChooser = new JDateChooser();
	dateChooser.setForeground(new Color(105,105,105));
	dateChooser.setBounds(590,310,400,30);
	add(dateChooser);
	JLabel labelEmail = new JLabel("Email address :");
	labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
	labelEmail.setBounds(390,360,200,30);
	add(labelEmail);
	
	textEmail = new JTextField();
	textEmail.setFont(new Font("Raleway",Font.BOLD,14));
	textEmail.setBounds(590,360,400,30);
	add(textEmail);
	
	JLabel labelMs = new JLabel("Marital Status :");
	labelMs.setFont(new Font("Raleway",Font.BOLD,20));
	labelMs.setBounds(390,400,200,30);
	add(labelMs);
	
	m1 = new JRadioButton("Married");
	m1.setFont(new Font("Raleway",Font.BOLD,20));
	m1.setBackground(new Color(222,255,220));
	m1.setBounds(590,400,100,30);
	add(m1);
	m2 = new JRadioButton("Unmarried");
	m2.setFont(new Font("Raleway",Font.BOLD,20));
	m2.setBackground(new Color(222,255,220));
	m2.setBounds(690,400,130,30);
	add(m2);
	m3 = new JRadioButton("Other");
	m3.setFont(new Font("Raleway",Font.BOLD,20));
	m3.setBackground(new Color(222,255,220));
	m3.setBounds(810,400,100,30);
	add(m3);
	
	ButtonGroup buttonGroup1 = new ButtonGroup();
	buttonGroup1.add(m1);
	buttonGroup1.add(m2);
	buttonGroup1.add(m3);
	
	JLabel labelAdd = new JLabel("Address :");
	labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
	labelAdd.setBounds(390,440,200,30);
	add(labelAdd);
	
	textAdd = new JTextField();
	textAdd.setFont(new Font("Raleway",Font.BOLD,14));
	textAdd.setBounds(590,440,400,30);
	add(textAdd);
	
	JLabel labelCity = new JLabel("City :");
	labelCity.setFont(new Font("Raleway",Font.BOLD,20));
	labelCity.setBounds(390,480,200,30);
	add(labelCity);
	
	textCity = new JTextField();
	textCity.setFont(new Font("Raleway",Font.BOLD,14));
	textCity.setBounds(590,480,400,30);
	add(textCity);
	
	JLabel labelPin = new JLabel("Pin Code :");
	labelPin.setFont(new Font("Raleway",Font.BOLD,20));
	labelPin.setBounds(390,520,200,30);
	add(labelPin);
	
	textPin = new JTextField();
	textPin.setFont(new Font("Raleway",Font.BOLD,14));
	textPin.setBounds(590,520,400,30);
	add(textPin);
	
	JLabel labelState = new JLabel("State :");
	labelState.setFont(new Font("Raleway",Font.BOLD,20));
	labelState.setBounds(390,560,200,30);
	add(labelState);
	
	textState = new JTextField();
	textState.setFont(new Font("Raleway",Font.BOLD,14));
	textState.setBounds(590,560,400,30);
	add(textState);
	
	next = new JButton("Next");
	next.setFont(new Font("Raleway",Font.BOLD,15));
	next.setBackground(Color.BLACK);
	next.setForeground(Color.WHITE);
	next.setBounds(1000,610,80,25);
	next.addActionListener(this);
	add(next);
	
	
	getContentPane().setBackground(new Color(222,255,228));
	setLayout(null);
	setSize(2000,2500);
	setLocation(-5,-5);
	setVisible(true);
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	String formno = first;
	String name = textName.getText();
	String Fname = textFathersName.getText();
	String gender = null;
	if(r1.isSelected()) {
		gender = "Male";
	}
	else if(r2.isSelected()) {
		gender =" Female";
	}
	else if(r3.isSelected()) {
		gender = "Other";
	}
	String DOB =((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
	String email = textEmail.getText();
	String marital = null;
	if(m1.isSelected()) {
		marital = "Married";
	}
	else if(m2.isSelected()) {
		marital ="Unamrried";
	}else if(m3.isSelected()) {
		marital ="Other";
	}
	String address = textAdd.getText();
	String city = textCity.getText();
	String pincode = textPin.getText();
	String state = textState.getText();
	
	try {
		if(textName.getText().equals("")) {
			JOptionPane.showMessageDialog(null,"Fill all the feilds");
		}else {
			Conn con1 = new Conn();
			String q = "insert into signup values(' "+formno+" ','"+name+"','"+Fname+"','"+gender+"','"+DOB+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
			con1.statement.executeUpdate(q);
			new SignUp2(formno);
			setVisible(false);
			
		}
	}catch(Exception E) {
		E.printStackTrace();
	}
	
}
public static void main(String[] args) {
	new SignUp();
}
}
