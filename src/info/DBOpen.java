package info;


import java.sql.*;

public class DBOpen {

	public Connection getConnection() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "test01";
		String pw = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pw);
		} catch(ClassNotFoundException e) {
			System.out.println("oracle 드라이버를 찾을 수 없습니다.");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
