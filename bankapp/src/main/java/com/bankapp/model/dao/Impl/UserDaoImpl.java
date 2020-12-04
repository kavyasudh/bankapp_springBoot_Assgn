package com.bankapp.model.dao.Impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankapp.model.dao.UserDao;
import com.bankapp.model.dao.exception.UserNotFoundException;
import com.bankapp.model.entity.User;

@Repository
public class UserDaoImpl implements UserDao{

	@Autowired
	private SessionFactory factory;
	
	private Session getSession() {
		return factory.getCurrentSession();
		
	}
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from User").list();
	}

	@Override
	public User getUserById(int id) {

		User user = getSession().get(User.class, id);

		if (user != null)
			return user;
		else
			throw new UserNotFoundException("user with id:" + id + " is not found");
	}

	@Override
	public User deleteUser(int id) {
		User user = getUserById(id);
		getSession().delete(user);
		return user;
	}

	@Override
	public User updateUser(int id, User user) {
		User userToUpdate = getUserById(id);
		userToUpdate.setAddress(user.getAddress());
		userToUpdate.setPhone(user.getPhone());
		userToUpdate.setEmail(user.getEmail());
		getSession().update(userToUpdate);
		return userToUpdate;
	}




	@Override
	public User getUser(String username, String password) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from User where username=:username1 and password=:password1");
		query.setParameter("username1", username);
		query.setParameter("password1", password);
		User user = (User) query.getSingleResult();
		if(user==null)
			throw new UserNotFoundException("user not found");
		else
		return user;
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		getSession().save(user);
		return user;
	}

}

