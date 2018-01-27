package model;
import java.sql.*;
public class SqliteConnection {
	public static Connection Connector() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/logindata","root","");
			return conn;
		} catch(Exception e) {	}
		return null;
	}
}
