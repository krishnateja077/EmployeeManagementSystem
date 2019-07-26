package com.db.employeemanagementsystem.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.db.employeemanagementsystem.bean.LoginBean;

class LoginDAOImplTest {
	
	LoginBean loginBean = new LoginBean("root","root");
	
	@Test
	void testAuthenticate() {
		//fail("Not yet implemented");
		LoginDAOImpl loginDAOImpl = new LoginDAOImpl();
		Assertions.assertEquals(loginDAOImpl.authenticate(loginBean), true);
	}
}
