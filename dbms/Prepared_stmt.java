package dbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Prepared_stmt {

	private static Connection connection=null;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbURL ="jdbc:mysql://localhost:3307/employees";
			String username="root";
			String password="kaushik2002";
			
			connection=DriverManager.getConnection(dbURL,username,password);
			
			String sql="insert into personal_info(id, name, age, phn) values (6, 'Sathwik', 36, 2567) ";
            
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
