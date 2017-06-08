package org.susi.spring.hibernate.jpa.exersise.dao;

import java.util.List;

import org.susi.spring.hibernate.jpa.exersise.model.Product;

public interface ProductDao {

	public void saveProduct(Product product);
	public List<Product> getAllProducts();
}


