package InformationProject;

import java.sql.*;
import java.util.Scanner;

public class InformationInput {
	Scanner scan = new Scanner(System.in);
	InformationSet info = new InformationSet();
	
	void addInfo(Statement stmt) throws SQLException  {
		System.out.print("아이디 입력 : ");
		info.userid = scan.next();
		System.out.print("이름 입력 : ");
		info.username = scan.next();
		System.out.print("출생년도 입력 : ");
		info.birthyear = scan.nextInt();
		System.out.print("신장(cm) 입력 : ");
		info.height = scan.nextInt();
		stmt.executeUpdate("insert into information values(' " + info.userid + " ', ' " + info.username + " ', " + info.birthyear + ", " + info.height + ")");
	}
}
