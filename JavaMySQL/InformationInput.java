package InformationProject;

import java.sql.*;
import java.util.Scanner;

public class InformationInput {
	Scanner scan = new Scanner(System.in);
	InformationSet info = new InformationSet();
	
	void addInfo(Statement stmt) throws SQLException  {
		System.out.print("���̵� �Է� : ");
		info.userid = scan.next();
		System.out.print("�̸� �Է� : ");
		info.username = scan.next();
		System.out.print("����⵵ �Է� : ");
		info.birthyear = scan.nextInt();
		System.out.print("����(cm) �Է� : ");
		info.height = scan.nextInt();
		stmt.executeUpdate("insert into information values(' " + info.userid + " ', ' " + info.username + " ', " + info.birthyear + ", " + info.height + ")");
	}
}
