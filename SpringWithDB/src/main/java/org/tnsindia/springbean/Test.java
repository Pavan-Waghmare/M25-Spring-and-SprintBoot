package org.tnsindia.springbean;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*StudentDAO obj=new StudentDAO();
		obj.selectAllRows();*/
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO s1=((AbstractApplicationContext) c).getBean("Studentdao",StudentDAO.class);
		s1.selectAllRows();
	}

}