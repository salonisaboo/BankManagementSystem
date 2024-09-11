package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PinChange extends JFrame implements ActionListener{
	JButton d1,b1;
	String pin;
	JPasswordField p1,p2;
	
	PinChange(String pin){
		this.pin=pin;
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
    	Image i2 = i1.getImage().getScaledInstance(1300, 650,Image.SCALE_DEFAULT);
    	ImageIcon i3 = new ImageIcon(i2);
    	JLabel l3 = new JLabel(i3);
    	l3.setBounds(0,0,1300,650);
    	add(l3);
    	
    	JLabel label1 = new JLabel("CHANGE PIN");
    	label1.setForeground(Color.WHITE);
    	label1.setFont(new Font("System",Font.BOLD,16));
    	label1.setBounds(460,120,400,35);
    	l3.add(label1);
    	
    	JLabel label2 = new JLabel("New PIN :");
    	label2.setForeground(Color.WHITE);
    	label2.setFont(new Font("System",Font.BOLD,16));
    	label2.setBounds(350,170,200,25);
    	l3.add(label2);
    	
    	p1 = new JPasswordField();
    	p1.setBackground(new Color(65,125,128));
    	p1.setForeground(Color.WHITE);
    	p1.setBounds(510,170,200,25);
    	p1.setFont(new Font("Raleway",Font.BOLD,22));
    	l3.add(p1);
    	
    	JLabel label3 = new JLabel("Re-Enter New PIN :");
    	label3.setForeground(Color.WHITE);
    	label3.setFont(new Font("System",Font.BOLD,16));
    	label3.setBounds(350,210,200,25);
    	l3.add(label3);
    	
    	p2 = new JPasswordField();
    	p2.setBackground(new Color(65,125,128));
    	p2.setForeground(Color.WHITE);
    	p2.setBounds(510,210,200,25);
    	p2.setFont(new Font("Raleway",Font.BOLD,22));
    	l3.add(p2);
    	
    	
    	d1 = new JButton("CHANGE");
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
    	
		setSize(1550,1000);
		setLayout(null);
		setLocation(0,0);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String pin1 = p1.getText();
			String pin2 = p2.getText();
			
			if(!pin1.equals(pin2)) {
				JOptionPane.showMessageDialog(null, "Entered PIN does not match");
				return ;
			}
			if(e.getSource()==d1) {
				if(p1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Enter New PIN");
					return ;
				}
				if(p2.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Re-Enter New PIN");
					return;
				}
				Conn c = new Conn();
				String q1 = "update bank set pin = '"+pin1+"' where pin ='"+pin+"'";
				String q2 = "update login  set pin = '"+pin1+"' where pin ='"+pin+"'";
				String q3 = "update signupThree set pin = '"+pin1+"' where pin ='"+pin+"'";
				
				c.statement.executeUpdate(q1);
				c.statement.executeUpdate(q2);
				c.statement.executeUpdate(q3);

				JOptionPane.showMessageDialog(null, "PIN changed successfully");
				setVisible(false);
				new main_Class(pin);
				
			}else if(e.getSource()==b1) {
				new main_Class(pin);
				setVisible(false);
			}
		}catch(Exception E) {
			E.printStackTrace();
		}
	}
public static void main(String[] args) {
	new PinChange("");
}
}
