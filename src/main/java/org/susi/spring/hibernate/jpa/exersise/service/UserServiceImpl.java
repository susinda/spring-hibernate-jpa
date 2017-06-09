package org.susi.spring.hibernate.jpa.exersise.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.susi.spring.hibernate.jpa.exersise.dao.UserDao;
import org.susi.spring.hibernate.jpa.exersise.model.User;


@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao productDao;

	@Transactional
	public void add(User product) {
		productDao.saveUser(product);
	}
	
	@Transactional
	public void addAll(Collection<User> products) {
		for (User product : products) {
			productDao.saveUser(product);
		}
	}

	@Transactional(readOnly = true)
	public List<User> listAll() {
		return productDao.getAllUsers();

	}

}