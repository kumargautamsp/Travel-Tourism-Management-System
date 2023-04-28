import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
	JButton login,signup,fpassword;
	Login()
	{
		setSize(900,400);
		setLocation(300,300);
		setLayout(null);

		JPanel p1 = new JPanel();
		p1.setBackground(new Color(130,200,230));
		p1.setBounds(0,0,400,400);
		p1.setLayout(null);
		add(p1);
		
		JPanel p2 =new JPanel();
		p2.setLayout(null);
		p2.setBounds(400,40,450,300);
		add(p2);
		
		JLabel lblusername = new JLabel("USERNAME");
		lblusername.setBounds(60,20,200,25);
		lblusername.setFont(new Font("SAN_SARIF",Font.PLAIN,22));
		p2.add(lblusername);
		
		JTextField tfusername = new JTextField();
		tfusername.setBounds(60,60,300,30);
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		p2.add(tfusername);
		
		JLabel lblpassword = new JLabel("PASSWORD");
		lblpassword.setBounds(60,120,200,25);
		lblpassword.setFont(new Font("SAN_SARIF",Font.PLAIN,22));
		p2.add(lblpassword);
		
		JTextField tfpassword = new JTextField();
		tfpassword.setBounds(60,150,300,30);
		tfpassword.setBorder(BorderFactory.createEmptyBorder());
		p2.add(tfpassword);
		
		login = new JButton("Login");
		login.setBounds(60,200,130,30);
		login.setBackground(new Color(200,250,130));
		login.setForeground(Color.WHITE);
		login.setBorder(new LineBorder(new Color(130,200,240)));
		login.addActionListener(this);
		p2.add(login);
		
		signup = new JButton("Signup");
		signup.setBounds(220,200,130,30);
		signup.setBackground(new Color(130,200,230));
		signup.setForeground(Color.WHITE);
		signup.setBorder(new LineBorder(new Color(130,200,240)));
		signup.addActionListener(this);
		p2.add(signup);
		
		fpassword = new JButton("Forget Password");
		fpassword.setBounds(120,250,130,30);
		fpassword.setBackground(new Color(0,0,230));
		fpassword.setForeground(Color.WHITE);
		fpassword.setBorder(new LineBorder(new Color(130,200,240)));
		fpassword.addActionListener(this);
		p2.add(fpassword);
		
		JLabel text = new JLabel("Trouble in login");
		text.setBounds(300,250,150,20);
		p2.add(text);
		
		//ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("addressofimage"));
		//Image i2= i1.getImage().getScaledInstance(lenght,widht,Image.SCALE_DEFAULT);
		//ImageIcon i3 = new ImageIcon(i2);
		//JLabel image = new JLabel(i3);
		//image.setBounds(100,120,200,200);
		//p1.add(image);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==login)
		{
		
		}
		else if(ae.getSource()==signup)
		{
			setVisible(false);
			new Signup();
		}
		else
		{
			setVisible(false);
			new ForgetPassword();
		}
	}
	public static void main(String []dj)
	{
		Login l = new Login();
	}
}