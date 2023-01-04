package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class jdbc_read {
	private static Connection connector=null;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbURL ="jdbc:mysql://localhost:3307/sample";
			String username="root";
			String password="kaushik2002";
			
			connector=DriverManager.getConnection(dbURL,username,password);
			
			String sql="select * from student";
            
			Statement statement = connector.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			while(result.next()) {
				int roll_num=result.getInt("roll");
				String name=result.getString("name");
				System.out.println(" "+roll_num+"   "+name);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
