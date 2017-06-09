package org.susi.spring.hibernate.jpa.exersise.main;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.susi.spring.hibernate.jpa.exersise.model.User;
import org.susi.spring.hibernate.jpa.exersise.model.UserBase;
import org.susi.spring.hibernate.jpa.exersise.service.UserService;

public class TestMain {
	
	public static void main(String[] args) {
		
		//Create Spring application context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");
		
		//Get service from context. (service's dependency (ProductDAO) is autowired in UserService)
		UserService userService = (UserService) ctx.getBean("UserService");
		
		//Do some data operation
		
		userService.add(new User("susi@gmail.com", "Susi", "Dman", UserBase.INTERNAL));
		userService.add(new User("amal@gmail.com", "Amal", "Perera", UserBase.FACEBOOK));
		
		System.out.println("listAll: " + userService.listAll());
		
		//Test transaction rollback (duplicated key)
//		try {
//			productService.addAll(Arrays.asList(new User(1, "Book"), new User(6, "Soap"), new User(7, "Computer")));
//		} catch (DataAccessException dataAccessException) {
//		}
		
		//Test element list after rollback
		System.out.println("listAll: " + userService.listAll());
		
		ctx.close();
		
	}
}
