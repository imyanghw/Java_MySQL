package InformationProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class InformationDriver {
	Connection con;
	Statement stmt;
	ResultSet rs;
	int menu;
	Scanner scan = new Scanner(System.in);
	
	public InformationDriver() throws SQLException {
		String url = "jdbc:mysql://localhost/testdb";
		String id = "****";
		String password = "****";
		
		con = DriverManager.getConnection(url, id, password);
		stmt = con.createStatement();	
		run();
	}
	
	void run() throws SQLException {
		while(true) {
			menu();
			if(menu==1) {
				new InformationInput().addInfo(stmt);
			}
			if(menu==2) {
				new InformationOutput().getInfo(stmt, rs);
			}
			if(menu==3) {
				new InformationDelete().deleteInfo(stmt);
			}
			if(menu==4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			stmt.close();
			con.close();
		}
	}
	
	void menu() {
		System.out.println("========");
		System.out.println("1.�����Է�");
		System.out.println("2.���Ȯ��");
		System.out.println("3.��������");
		System.out.println("4.�۾�����");
		System.out.println("========");
		System.out.print("���ϴ� �۾����� : ");	
		menu = scan.nextInt();	
	}
}
