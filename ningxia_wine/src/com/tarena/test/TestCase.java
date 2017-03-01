package com.tarena.test;


import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class TestCase {
	String  cfgString="spring-mvc.xml";
	ApplicationContext ctxContext=new ClassPathXmlApplicationContext(cfgString);
	
	@Test
	public void  testJdbcTemplate() throws SQLException{
		JdbcTemplate jdbcTemplate=ctxContext.getBean("jdbcTemplate",JdbcTemplate.class);
		System.out.println(jdbcTemplate);
	}

}
