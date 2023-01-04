import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import next.xadmin.login.bean.loginbean;

public class RegDao {
	
	private String dburl="jdbc:mysql://localhost:3307/userdb";
	private String dbUname="root";
	private String dbpass="kaushik2002";
	
	private String dbdriver="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbdriver) {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con=null;
		try {
			con =DriverManager.getConnection(dburl,dbUname,dbpass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	

	public boolean insert(Member member) {
		loadDriver(dbdriver);
		Connection con=getConnection();
		
		boolean result=true;
		
		String sql="insert into member values(?,?,?)";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getUname());
			ps.setString(2,member.getPassword());
			ps.setString(3,member.getEmail());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			result=false;
			
		}
		return result;
		
	}
	
	public boolean validate(loginbean lb) {
		loadDriver(dbdriver);
		Connection con=getConnection();
		
		boolean status=false;
		String sql="select password from member where uname = ? ";
		
		PreparedStatement ps;
		
		try {
			ps=con.prepareStatement(sql);
			ps.setString(1, lb.getUsername());
			
			ResultSet rs=ps.executeQuery();
			
			String pwd=lb.getPassword();
			
			String dbpwd=rs.getString("password");
			if(pwd==dbpwd) {
				status=true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return status;
	}

}
