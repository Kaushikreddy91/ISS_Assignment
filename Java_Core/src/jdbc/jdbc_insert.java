package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc_insert {
	
	private static Connection connection=null;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbURL ="jdbc:mysql://localhost:3307/sample";
			String username="root";
			String password="kaushik2002";
			
			connection=DriverManager.getConnection(dbURL,username,password);
			
			String sql="insert into student(roll, name) values (1, 'Kaushik') ";
            
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			int rows=preparedStatement.executeUpdate();
			if(rows>0) {
				System.out.println("inserted sucessfully");
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
