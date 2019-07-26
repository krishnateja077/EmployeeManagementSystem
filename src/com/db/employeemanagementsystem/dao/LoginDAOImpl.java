package com.db.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.util.DbUtil;

public class LoginDAOImpl implements LoginDAO {
public boolean authenticate(LoginBean login) {
	String query="select * from login_table where UserName=? and password=?";
	Connection connection=null;
	PreparedStatement preparedstatement = null;
	ResultSet resultSet=null;
	connection=DbUtil.getConnection();
	System.out.println("null status "+connection==null);
	try {
		preparedstatement=connection.prepareStatement(query);
		preparedstatement.setString(1, login.getUserName());
		preparedstatement.setString(2, login.getPassword());
		resultSet=preparedstatement.executeQuery();
		if(resultSet.next()) {
			return true;
		}

	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	
	finally {
		DbUtil.closeConnection(connection);
	}

	return false;
}

}
