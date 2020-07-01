package or.itschool.controller;
import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySqlConnectTest {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/spring?allowPublicKeyRetrival=true&useSSL=false&serverTimezone=Asia/Seoul";
    private static final String UID = "spring";
    private static final String UPW = "spring";
    
    
    @Test 
    public void connectTest() throws Exception {
        Class.forName(DRIVER);
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, UID, UPW);
            System.out.println(conn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(conn != null) conn.close();
        }
    }
}