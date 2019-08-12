import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbcconnection {
 public static void main(String[] args) {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","aniket30");
		Statement st=con.createStatement();
		String sql="select * from Student25";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
			System.out.println(rs.getString(1));
		con.close();
		
	
}
	catch(Exception e)
	{
		System.out.println(e);
		e.printStackTrace();
	}
}
}
