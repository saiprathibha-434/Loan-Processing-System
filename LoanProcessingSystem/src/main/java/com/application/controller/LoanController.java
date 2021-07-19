package com.application.controller;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.entity.User;
import com.application.repo.Repo;

import antlr.collections.List;

@RestController
@RequestMapping(value ="/first")
public class LoanController {
	@Autowired
	private Repo repo;
	
	@RequestMapping(value = "/getAllUsers",method = RequestMethod.GET)
	public ResponseEntity<String> getAllUsers() throws SQLException 
	{
		List userList= (List) repo.findAll();
		
		 return ResponseEntity.status(HttpStatus.OK)
				.body(String.format("Retrieved all user list %s", userList.toString()));
	}
	
	@RequestMapping(value = "/saveRegistration", method = RequestMethod.POST)
	public ResponseEntity<String> registration(@RequestBody User registration)
	{
		User saveReg= repo.save(registration);
		return ResponseEntity.status(HttpStatus.OK).
				body(String.format("Registration is Successfull %s", saveReg.toString()));
	    
	}
}