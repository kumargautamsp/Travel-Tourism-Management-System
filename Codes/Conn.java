import java.sql.*;

public class Conn
{
	Connection c;
	Statement s;
	Conn()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverMAnager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem","usernameofmysql","passwordofit");
			s =c.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}