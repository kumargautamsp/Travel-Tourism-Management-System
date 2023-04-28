import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Signup extends JFrame implements ActionListener
{
	JButton create,back;
	JTextField tfusername,tfname,tfpassword,tfanswer;
	Choice security;
	Signup()
	{
		setBounds(350,200,900,360);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(130,190,230));
		p1.setBounds(0,0,500,400);
		p1.setLayout(null);
		add(p1);
		
		JLabel lblusername = new JLabel("USERNAME");
		lblusername.setBounds(40,20,120,25);
		lblusername.setFont(new Font("SAN_SARIF",Font.BOLD,16));
		p1.add(lblusername);
		
		tfusername = new JTextField();
		tfusername.setBounds(190,20,190,25);
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfusername);
		
		JLabel lblname = new JLabel("NAME");
		lblname.setBounds(40,60,120,25);
		lblname.setFont(new Font("SAN_SARIF",Font.BOLD,16));
		p1.add(lblname);
		
		tfname = new JTextField();
		tfname.setBounds(190,60,190,25);
		tfname.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfname);
		
		JLabel lblpassword = new JLabel("PASSWORD");
		lblpassword.setBounds(40,100,120,25);
		lblpassword.setFont(new Font("SAN_SARIF",Font.BOLD,16));
		p1.add(lblpassword);
		
		tfpassword = new JTextField();
		tfpassword.setBounds(190,100,190,25);
		tfpassword.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfpassword);
		
		JLabel lblsecurity = new JLabel("SECURITY");
		lblsecurity.setBounds(40,140,120,25);
		lblsecurity.setFont(new Font("SAN_SARIF",Font.BOLD,16));
		p1.add(lblsecurity);
		
		security = new Choice();
		security.add("Ravi Kant's Favourite student ?");
		security.add("Ravi Kant's Favourite topic ?");
		security.add("Ravi Kant's Favourite place ?");
		security.setBounds(190,140,180,25);
		p1.add(security);
		
		JLabel lblanswer = new JLabel("ANSWER");
		lblanswer.setBounds(40,180,120,25);
		lblanswer.setFont(new Font("SAN_SARIF",Font.BOLD,16));
		p1.add(lblanswer);
		
		tfanswer = new JTextField();
		tfanswer.setBounds(190,180,190,25);
		tfanswer.setBorder(BorderFactory.createEmptyBorder());
		p1.add(tfanswer);
		
		create = new JButton("CREATE");
		create.setBounds(80,250,100,30);
		create.setBackground(new Color(0,0,130));
		create.setForeground(Color.WHITE);
		create.setBorder(new LineBorder(new Color(130,200,240)));
		create.setFont(new Font("SAN_SARIF",Font.BOLD,16));
		create.addActionListener(this);
		p1.add(create);
		
		back = new JButton("BACK");
		back.setBounds(250,250,100,30);
		back.setBackground(Color.WHITE);
		back.setForeground(new Color(130,190,230));
		back.setBorder(new LineBorder(new Color(130,200,240)));
		back.setFont(new Font("SAN_SARIF",Font.BOLD,16));
		back.addActionListener(this);
		p1.add(back);
		
		//ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("addressofimage"));
		//Image i2= i1.getImage().getScaledInstance(lenght,widht,Image.SCALE_DEFAULT);
		//ImageIcon i3 = new ImageIcon(i2);
		//JLabel image = new JLabel(i3);
		//image.setBounds(580,50,250,250);
		//p1.add(image);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if (ae.getSource()==create)
		{/*
			String username = tfusername.getText();
			String name = tfname.getText();
			String password = tfpassword.getText();
			String question= security.getSelectedItem();
			String answer = tfanswer.getText();
			
			String query="insert into account values('"+username+"','"+name+"','"+password+"','"+question+"','"+answer+"')";
			
			try
			{
				Conn c = new Conn();
				c.s.executeUpdate(query);
				
				JOptionPane.showMessageDialog(null,"Account Created Succesfully");
				setVisible(false);
				new Login();
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			*/
		}
		else if(ae.getSource()==back)
		{
			setVisible(false);
			new Login();
		}
	}
	
	public static void main(String []dj)
	{
		Signup s = new Signup();
	}
}