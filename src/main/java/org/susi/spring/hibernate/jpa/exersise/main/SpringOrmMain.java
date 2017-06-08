package org.susi.spring.hibernate.jpa.exersise.main;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.susi.spring.hibernate.jpa.exersise.model.Product;
import org.susi.spring.hibernate.jpa.exersise.service.ProductService;

public class SpringOrmMain {
	
	public static void main(String[] args) {
		
		//Create Spring application context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");
		
		//Get service from context. (service's dependency (ProductDAO) is autowired in ProductService)
		ProductService productService = (ProductService) ctx.getBean("ProductService");
		
		//Do some data operation
		
		productService.add(new Product(1, "Susi"));
		productService.add(new Product(2, "Perera"));
		
		System.out.println("listAll: " + productService.listAll());
		
		//Test transaction rollback (duplicated key)
		try {
			productService.addAll(Arrays.asList(new Product(1, "Book"), new Product(6, "Soap"), new Product(7, "Computer")));
		} catch (DataAccessException dataAccessException) {
		}
		
		//Test element list after rollback
		System.out.println("listAll: " + productService.listAll());
		
		ctx.close();
		
	}
}
