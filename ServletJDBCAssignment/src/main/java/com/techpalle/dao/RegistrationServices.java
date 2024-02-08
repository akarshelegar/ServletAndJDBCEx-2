package com.techpalle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techpalle.jdbc.RegistrationModel;

public class RegistrationServices {
	
	private static Connection cn = null;
	private static PreparedStatement ps = null;
	
	private static final String dburl = "jdbc:mysql://localhost:3306/j2ee";
	private static final String dbusername = "root";
	private static final String dbpassword = "7259";
	
	public static int doRegister(RegistrationModel rm)
	{
		int row =0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			cn = DriverManager.getConnection(dburl, dbusername, dbpassword);
			
			ps = cn.prepareStatement("insert into student(name, email, qual, pwd, state) values(?,?,?,?,?)");
			ps.setString(1, rm.getName());
			ps.setString(2, rm.getEmail());
			ps.setString(3, rm.getQual());
			ps.setString(4, rm.getPwd());
			ps.setString(5, rm.getState());
			
			row = ps.executeUpdate();
			
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		finally {
			if(ps!=null)
			{
			try {
				ps.close();
			} catch (SQLException e1) {
	
				e1.printStackTrace();
			}
			}
			if(cn!=null)
			{
				try {
					ps.close();
				} catch (SQLException e1) {
				
					e1.printStackTrace();
				}
			}
			
		}
		return row;
				
	}


}
