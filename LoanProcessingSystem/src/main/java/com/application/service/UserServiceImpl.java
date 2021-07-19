package com.application.service;

import java.util.logging.Logger; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.entity.User;
import com.application.repo.Repo;





/* User Service 
 * IUserServiceImpl implements IUserService 
 * User addNewUser(User user) to add new user as admin,customer,landOfficer,financeOfficer.
 * User signIn(User user) to sign in
 * User signOut(User user) to sign out
 */

@Service
public class UserServiceImpl implements UserService {
	Logger logger = Logger.getLogger(UserServiceImpl.class.getName());
	@Autowired
	Repo repository;
	
	public UserServiceImpl(Repo repository) {
		super();
		this.repository = repository;
	}

	@Override
	public User addNewUser(User user) {
		
		try {
			repository.save(user);
		} catch (Exception e) {
			logger.info(e.getMessage());
		}
			return user;
	}

	@Override
	public User signIn(User user) {
		
		return null;
	}

	@Override
	public User signOut(User user) {
		
		return null;
	}

}