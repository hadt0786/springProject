package com.sutherland.mysqlConnection;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sutherland.mysqlConnection.modal.Emp;

public class EmpDao {
	
	DriverManagerDataSource ds=new DriverManagerDataSource("jdbc:mysql://localhost:3306/test", "root", "root");
	
	JdbcTemplate template=new JdbcTemplate(ds);
	
	public int save()
	{
		String query="INSERT INTO emp99 (`ID`,`NAME`,`SALARY`,`DESIGNATION`) VALUES (2,'abd',20000,'Software Engineer');";
		return template.update(query);
	}
}
