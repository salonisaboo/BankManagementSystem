package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
	 String pin;
	 JLabel label2;
	 JButton b1;
	 
     BalanceEnquiry(String pin){
    	this.pin=pin;
    	 
    	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
     	Image i2 = i1.getImage().getScaledInstance(1300, 650,Image.SCALE_DEFAULT);
     	ImageIcon i3 = new ImageIcon(i2);
     	JLabel l3 = new JLabel(i3);
     	l3.setBounds(0,0,1300,650);
     	add(l3);
     	
     	JLabel label1 = new JLabel("YOUR CURRENT BALANCE IS Rs.");
    	label1.setForeground(Color.WHITE);
    	label1.setFont(new Font("System",Font.BOLD,16));
    	label1.setBounds(350,130,700,35);
    	l3.add(label1);
    	
    	label2 = new JLabel();
    	label2.setForeground(Color.WHITE);
    	label2.setFont(new Font("System",Font.BOLD,16));
    	label2.setBounds(355,160,400,35);
    	l3.add(label2);
    	
    	b1 = new JButton("BACK");
    	b1.setForeground(Color.WHITE);
    	b1.setBackground(new Color(65,125,128));
    	b1.setBounds(540,320,150,35);
    	b1.addActionListener(this);
    	l3.add(b1);
    	
    	int balance = 0;
    	try {
    		Conn c3 = new Conn();
    		ResultSet resultSet = c3.statement.executeQuery("Select * from bank where pin ='"+pin+"'");
    		while(resultSet.next()) {
    			if(resultSet.getString("type").equals("Deposit")) {
					balance += Integer.parseInt(resultSet.getString("amount"));
				}else {
					balance -= Integer.parseInt(resultSet.getString("amount"));
				}
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	label2.setText(""+balance);

     	
    	setLayout(null);
     	setSize(1530,1000);
 		setLocation(0,0);
 		setVisible(true);
     }
     
     @Override
     public void actionPerformed(ActionEvent e) {
    	 setVisible(false);
    	 new main_Class(pin);
    	 
     }
     
     public static void main(String[] args) {
    	 new BalanceEnquiry("");
     }
}
