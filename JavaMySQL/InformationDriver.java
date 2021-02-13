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
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			stmt.close();
			con.close();
		}
	}
	
	void menu() {
		System.out.println("========");
		System.out.println("1.정보입력");
		System.out.println("2.목록확인");
		System.out.println("3.정보삭제");
		System.out.println("4.작업종료");
		System.out.println("========");
		System.out.print("원하는 작업선택 : ");	
		menu = scan.nextInt();	
	}
}
