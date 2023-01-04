package dbms;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Callable_stmt {

	private static Connection connection=null;

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbURL ="jdbc:mysql://localhost:3307/employees";
			String username="root";
			String password="kaushik2002";
			
			connection=DriverManager.getConnection(dbURL,username,password);
			
			CallableStatement callableStatement = connection.prepareCall("{ call get_info(20)}");
			ResultSet res=callableStatement.executeQuery(); 
			
			while(res.next()) {
				System.out.println(" "+res.getInt("id")+" "+res.getString("name")+" "+res.getInt("age")+" "+res.getInt("phn"));
			}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
