package InformationProject;

import java.sql.*;

public class InformationOutput {
	void getInfo(Statement stmt, ResultSet rs) throws SQLException {
		InformationSet info = new InformationSet();
		rs = stmt.executeQuery("SELECT * FROM information");
		
		while(rs.next()) {
			System.out.println("userid = " + rs.getString("userid") + " | username = " + rs.getString("username")
					+ " | birthyear = " + rs.getInt("birthyear") + " | height = " + rs.getInt("height"));
		}		
	}
}
