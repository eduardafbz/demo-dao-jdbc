package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexao {
	
	private static Connection conn = null;  
	
	public static Connection getConnection() {
		if (conn == null) {
			try {
				String url = "jdbc:mysql://localhost:3306/cousejdbc?user=root&password=12345";
				conn = DriverManager.getConnection(url); 
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return conn;
	}
	
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void CloseStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void CloseResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
}
