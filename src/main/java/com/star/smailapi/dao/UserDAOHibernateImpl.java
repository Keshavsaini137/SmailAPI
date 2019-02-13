package com.star.smailapi.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.star.smailapi.entity.Users;

@Repository
public class UserDAOHibernateImpl implements UserDAO{

	private EntityManager entityManager;
	
	@Autowired
	public UserDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Override
	@Transactional
	public List<Users> findAll() {
		//get currentSession
		Session currentSession = entityManager.unwrap(Session.class);
		
		//Create a Query
		Query<Users> theQuery = currentSession.createQuery("from Users", Users.class);
		
		//execute Query and get result 
		List<Users> users = theQuery.getResultList();
		
		return users;
	}

}
