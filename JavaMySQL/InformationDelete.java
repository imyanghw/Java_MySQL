package InformationProject;

import java.sql.*;
import java.util.Scanner;

public class InformationDelete {
	Scanner scan = new Scanner(System.in);
	
	void deleteInfo(Statement stmt) throws SQLException {
		System.out.print("이름 입력 : ");
		String del_username = scan.next();
		
		stmt.executeUpdate("delete from information where username=' " + del_username + " ';");
	}
}
