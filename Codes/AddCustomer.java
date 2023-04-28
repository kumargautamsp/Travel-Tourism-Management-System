
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.*;
public class AddCustomer extends JFrame implements ActionListener {
    JLabel labelusername,labelname;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfphone,tfemail;
    JRadioButton rmale,rfemale;
    JButton back,add;
    AddCustomer()
    {
        setBounds(450,200,850,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);

        labelusername=new JLabel();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);

        JLabel lblid=new JLabel("ID");
        lblid.setBounds(30,110,150,25);
        add(lblid);

         comboid =new JComboBox(new String[]{"Passport","Aadhar Card","Pan Card","Ration Card"});
         comboid.setBounds(220,90,150,25);
         comboid.setBackground(Color.WHITE);
         add(comboid);


        JLabel labelid=new JLabel();
        labelid.setBounds(220,110,150,25);
        add(labelid);

        JLabel lblnumber=new JLabel("Number");
        lblnumber.setBounds(30,170,150,25);
        add(lblnumber);

        tfnumber =new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);

        JLabel lblname=new JLabel("Name");
        lblname.setBounds(30,230,150,25);
        add(lblname);

        labelname=new JLabel();
        labelname.setBounds(220,230,150,25);
        add(labelname);//we have taken the jlabel because the jlabel is uneditabele

        JLabel lblgender=new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        add(lblgender);

        rmale=new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);

        rfemale=new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rmale);//we are using the button group here to select any one otpion only
        bg.add(rfemale);

        JLabel lblcountry=new JLabel("Country");
        lblcountry.setBounds(30,250,150,25);
        add(lblcountry);

        tfcountry=new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry );

        JLabel lbladdress=new JLabel("address");
        lblnumber.setBounds(30,290,150,25);
        add(lbladdress);


        tfaddress=new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);

        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(30,330,150,25);
        add(lblphone);

        tfphone=new JTextField();
        tfphone.setBounds(220,330,150,25);
        add(tfphone);

        JLabel lblemail=new JLabel("Email");
        lblemail.setBounds(30,370,150,25);
        add(lblemail);

        tfemail=new JTextField();
        tfemail.setBounds(220,370,150,25);
        add(tfemail);

        add =new JButton("ADD");
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setBounds(70,430,100,25);
        add.addActionListener();
        add(add);

        back =new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(220,430,100,25);
        back.addActionListener();
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg")); //Add image
        Image i2=i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel (i3);
        image.setBounds(400,40,450,420);
        add(image);

        try {
            Conn conn =new Conn();
            ResultSet rs=conn.s.executeQuery("select * from account  where username=' '"));
            while(rs.next());{
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                labelid.setText(rs.getString("id"));

            }
        }
        catch(Exception e) {
            e.printStackTrace();

        }
        setVisible(true);
    }
    public void actionPerormed(ActionEvent ae){
        if(ae.getSource() == add);{
        String username = labelusername.getText();
        String id = (String)comboid.getSelectedItem();
        String number=tfnumber.getText();
        String name  = labelname.getText();
        String gender=null;
        if(rmale.isSelected()){
            gender="Male";
        }else{
            gender="Female";
        }
        String country=tfcountry.getText();
        String address=tfaddress.getText();
        String phone=tfphone.getText();
        String email=tfemail.getText();
        try{
            Conn c=new Conn();
            String query="insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
            c.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null,"Customer Details Added Successfully");
           setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
        }else{
            setVisible(false);
        }
    }
}
