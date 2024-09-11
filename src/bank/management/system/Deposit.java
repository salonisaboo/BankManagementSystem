package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
	String pin;
	TextField textField;
	JButton d1,b1;
    Deposit(String pin){
    	
    	this.pin = pin;
    	
    	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
    	Image i2 = i1.getImage().getScaledInstance(1300, 650,Image.SCALE_DEFAULT);
    	ImageIcon i3 = new ImageIcon(i2);
    	JLabel l3 = new JLabel(i3);
    	l3.setBounds(0,0,1300,650);
    	add(l3);
    	
    	JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
    	label1.setForeground(Color.WHITE);
    	label1.setFont(new Font("System",Font.BOLD,16));
    	label1.setBounds(360,130,400,35);
    	l3.add(label1);
    	
    	textField = new TextField();
    	textField.setBackground(new Color(65,125,128));
    	textField.setForeground(Color.WHITE);
    	textField.setBounds(360,180,320,25);
    	textField.setFont(new Font("Raleway",Font.BOLD,22));
    	l3.add(textField);
    	
    	d1 = new JButton("DEPOSIT");
    	d1.setBounds(550,285,150,25);
    	d1.setBackground(new Color(65,125,128));
    	d1.setForeground(Color.WHITE);
    	d1.addActionListener(this);
    	l3.add(d1);
    	
    	
    	b1 = new JButton("BACK");
    	b1.setBounds(550,320,150,25);
    	b1.setBackground(new Color(65,125,128));
    	b1.setForeground(Color.WHITE);
    	b1.addActionListener(this);
    	l3.add(b1);
    	
    	setLayout(null);
    	setSize(1530,1000);
		setLocation(0,0);
		setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	        try {
    	            String amount = textField.getText();
    	            Date date = new Date();
    	            if (e.getSource()==d1){
    	                if (textField.getText().equals("")){
    	                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
    	                }else {
    	                    Conn c2 = new Conn();
    	                    c2.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"','Deposit', '"+amount+"')");
    	                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
    	                    setVisible(false);
    	                    new main_Class(pin);
    	                }
    	            }else if (e.getSource()==b1){
    	                setVisible(false);
    	                new main_Class(pin);
    	            }
    	        }catch (Exception E){
    	            E.printStackTrace();
    	        }
    	
    	
    }
	
	public static void main(String[] args) {
		new Deposit("");
	}
}
