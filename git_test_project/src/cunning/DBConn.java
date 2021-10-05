package cunning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	public static void main(String[] args) {
		//connect api(JDBC)를 이용하여 mysql에 접속해보자.
		try {
			//디비에 접속하기 위해서 Driver클래스를 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("클래스로드!");
			
			//mysql에 접속하기 위한 id, pass를 변수로 준비
			String id = "root";
			String password = "mysql";
			
			//mysql 접속 url을 셋팅
			//프로토콜://아이피주소:포트번호/디비이름?파라미터
			String url = "jdbc:mysql://localhost:3306/employee_db?characterEncoding=utf-8&serverTimezone=Asia/Seoul";
			
			//디비에 접속해보자
			//디비에 접속하고 접속한 (connection)객체를 반환받는다.
			Connection conn = DriverManager.getConnection(url,id,password);
			
			System.out.println("접속 성공");
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return null;
	}

	public static void close() {
		
	}

}
