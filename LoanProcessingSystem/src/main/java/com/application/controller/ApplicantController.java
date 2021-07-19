package com.application.controller;


import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.entity.ApplicantDetails;
import com.application.repo.ApplicantRepo;

import antlr.collections.List;

@RestController
@RequestMapping(value ="/newdetails")
public class ApplicantController {
	@Autowired
	private ApplicantRepo Applicantrepo;
	
	@RequestMapping(value = "/getAllApplicant", method = RequestMethod.GET)
	public ResponseEntity<String> getAllApplicant() throws SQLException 
	{
		List ApplicantList= (List) Applicantrepo.findAll();
		
		 return ResponseEntity.status(HttpStatus.OK)
				.body(String.format("Retrieved all Applicant list %s", ApplicantList.toString()));
	}
	
	@RequestMapping(value = "/saveApplicantRegistration", method = RequestMethod.POST)
	public ResponseEntity<String> Applicantregistration(@RequestBody ApplicantDetails Applicantregistration)
	{
		ApplicantDetails saveReg= Applicantrepo.save(Applicantregistration);
		return ResponseEntity.status(HttpStatus.OK).
				body(String.format("Applicant Registration is Successfull %s", saveReg.toString()));
	    
	}
}