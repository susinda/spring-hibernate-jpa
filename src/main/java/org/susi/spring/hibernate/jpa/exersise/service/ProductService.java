package org.susi.spring.hibernate.jpa.exersise.service;

import java.util.Collection;
import java.util.List;

import org.susi.spring.hibernate.jpa.exersise.model.Product;

public interface ProductService {

	public void add(Product product);
	public void addAll(Collection<Product> products);
	public List<Product> listAll();

}



