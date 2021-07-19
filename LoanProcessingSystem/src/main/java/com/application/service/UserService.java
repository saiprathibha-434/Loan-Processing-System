package com.application.service;

import com.application.entity.User;

/* User Service 
 * IUserServiceImpl implements IUserService 
 * User addNewUser(User user) to add new user as admin,customer,landOfficer,financeOfficer.
 * User signIn(User user) to sign in
 * User signOut(User user) to sign out
 * 
 */
public interface UserService  {
public  User addNewUser(User user);
public  User signIn(User user);
public  User signOut(User user);
}