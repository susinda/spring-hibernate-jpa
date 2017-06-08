package org.susi.spring.hibernate.jpa.exersise.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.susi.spring.hibernate.jpa.exersise.model.Product;



@Repository
public class ProductDaoImpl extends AbstractJpaDao<Product> implements ProductDao {
	
	public ProductDaoImpl() {
		setClazz(Product.class);
	}

	@Override
	public void saveProduct(Product product) {
		save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return findAll();
	}

//	@PersistenceContext
//	private EntityManager em;
//
//	public void persist(Product product) {
//		em.persist(product);
//	}
//
//	public List<Product> findAll() {
//		return em.createQuery("SELECT p FROM Product p").getResultList();
//	}
	
	

}