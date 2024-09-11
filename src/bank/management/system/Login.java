package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{

	JLabel label1, label2, label3;
	JTextField textField2;
	JPasswordField passwordField3;
	JButton button1,button2,button3;
	Login(){
		 super("Bank Management System");
		 
		 ImageIcon bank=new ImageIcon(ClassLoader.getSystemResource("Icons/bank.jpg"));
		 Image i2=bank.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		 ImageIcon i3= new ImageIcon(i2);
		 JLabel bankImage= new JLabel(i3);
		 bankImage.setBounds(600,10,100,100);
		 add(bankImage);
		 
		 
		 ImageIcon card=new ImageIcon(ClassLoader.getSystemResource("Icons/card.png"));
		 Image i22=card.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		 ImageIcon i33= new ImageIcon(i22);
		 JLabel cardImage= new JLabel(i33);
		 cardImage.setBounds(1050,430,200,300);
		 add(cardImage);
		 
		 
		 label1 = new JLabel("WELCOME TO ATM");
		 label1.setForeground(Color.WHITE);
		 label1.setFont(new Font("AvantGarde",Font.BOLD,72));
		 label1.setBounds(330,205,1000,70);
		 add(label1);
		 
		 label2=new JLabel("Card No:");
		 label2.setFont(new Font("Ralway", Font.BOLD,38));
		 label2.setForeground(Color.WHITE);
		 label2.setBounds(440,350,375,30);
		 add(label2);
		 
		 textField2=new JTextField(15);
		 textField2.setBounds(675,350,230,30);
		 textField2.setFont(new Font("Arial",Font.BOLD,20));
		 add(textField2);
		 
		 
		 label3=new JLabel("PIN: ");
		 label3.setFont(new Font("Ralway",Font.BOLD,38));
		 label3.setForeground(Color.WHITE);
		 label3.setBounds(450,400,375,30);
		 add(label3);
		 
		 passwordField3=new JPasswordField(15);
		 passwordField3.setBounds(675,400,230,30);
		 passwordField3.setFont(new Font("Arial",Font.BOLD,20));
		 add(passwordField3);
		 
		 button1=new JButton("SIGN IN");
		 button1.setFont(new Font("Arial",Font.BOLD,14));
		 button1.setForeground(Color.WHITE);
		 button1.setBackground(Color.DARK_GRAY);
		 button1.setBounds(500,500,150,30);
		 button1.addActionListener(this);
		 add(button1);
		 
		 button2=new JButton("CLEAR");
		 button2.setFont(new Font("Arial",Font.BOLD,14));
		 button2.setForeground(Color.WHITE);
		 button2.setBackground(Color.DARK_GRAY);
		 button2.setBounds(720,500,150,30);
		 button2.addActionListener(this);
		 add(button2);
		 
		 button3=new JButton("SIGN UP");
		 button3.setFont(new Font("Arial",Font.BOLD,14));
		 button3.setForeground(Color.WHITE);
		 button3.setBackground(Color.DARK_GRAY);
		 button3.setBounds(510,550,350,30);
		 button3.addActionListener(this);
		 add(button3);

		 ImageIcon bg=new ImageIcon(ClassLoader.getSystemResource("Icons/backbg.png"));
		 Image ii2=bg.getImage().getScaledInstance(2000,2000,Image.SCALE_DEFAULT);
		 ImageIcon ii3= new ImageIcon(ii2);
		 JLabel bgImage= new JLabel(ii3);
		 bgImage.setBounds(0,0,1500,700);
		 add(bgImage);
		 
		 setLayout(null);
		 setSize(2000,2000);
		 setLocation(0,0);
		 setVisible(true);
		 
	}
	
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==button1) {
				Conn c = new Conn();
				String cardno = textField2.getText();
				String pin = passwordField3.getText();
				String q ="Select * from login where card_number ='"+cardno+"' and pin ='"+pin+"'";
				ResultSet resultSet = c.statement.executeQuery(q);
				if(resultSet.next()) {
					setVisible(false);
					new main_Class(pin);
				}else {
	            	JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN" );
	            }
				
			}else if(e.getSource()==button2) {
				textField2.setText("");
				passwordField3.setText("");
			}else if(e.getSource()==button3) {
				new SignUp();
				setVisible(false);
			}
			
		}catch(Exception E) {
			E.printStackTrace();
		}
		
	}
       public static void main(String[] args) {
    	   new Login();
       }

	
}
