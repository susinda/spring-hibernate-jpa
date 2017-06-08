package org.susi.spring.hibernate.jpa.exersise.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.susi.spring.hibernate.jpa.exersise.dao.ProductDao;
import org.susi.spring.hibernate.jpa.exersise.model.Product;


@Service("ProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Transactional
	public void add(Product product) {
		productDao.saveProduct(product);
	}
	
	@Transactional
	public void addAll(Collection<Product> products) {
		for (Product product : products) {
			productDao.saveProduct(product);
		}
	}

	@Transactional(readOnly = true)
	public List<Product> listAll() {
		return productDao.getAllProducts();

	}

}