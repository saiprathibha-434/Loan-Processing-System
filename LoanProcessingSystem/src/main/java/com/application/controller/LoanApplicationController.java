package com.application.controller;

import java.util.List; 
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.application.InvalidLoanApplicationException.InvalidLoanApplicationException;
import com.application.entity.LoanApplication;
import com.application.service.LoanApplicationService;




/*Loan Application REST Controller
 * Loan Application controller contains various methods to interact with the loan application table
 * "/home" is to check the home page 
 * "/add" is to add new loan application connected to an user to the database
 * "/view by id/{loan_id}" to view the application details by using the loan ID
 * "/update" to update the application details or make any specific changes to details
 * "/delete/{loan_id}" to delete the application from the database using the loan_id
 * "/view all loan" to view all the loan applications available in the database
 
 * */


//@Validated
@RestController
//@RequestMapping(value="/loanapplication/*")

public class LoanApplicationController {

	Logger logger = Logger.getLogger(LoanApplicationController.class.getName());

	public LoanApplicationController() {
		logger.log(Level.INFO, "----->Inside Loan Application Controller Working!");

	}

	@Autowired
	LoanApplicationService loanApplicationService;

	//@GetMapping("/home")
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String homeRequest() {
		return "Welcome to Loan Application ...";
	}

	//@PostMapping("/add")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public LoanApplication addLoanApplication(@RequestBody  LoanApplication loanApplication) {
		this.loanApplicationService.addLoanApplication(loanApplication);
		return loanApplication;
	}

	
	//@PutMapping("/update")
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public LoanApplication updateLoanApplication(@RequestBody  LoanApplication loanApplication)
			throws InvalidLoanApplicationException {
		this.loanApplicationService.updateLoanApplication(loanApplication);
		return loanApplication;
	}

	//@DeleteMapping("/delete/{applicationid}")
	@RequestMapping(value = "/delete/{applicationid}", method = RequestMethod.POST)
	public LoanApplication deleteLoanApplication(@PathVariable("applicationid") long loanApplicationId)
			throws InvalidLoanApplicationException {
		return this.loanApplicationService.deleteLoanApplication(loanApplicationId);

	}


	//@GetMapping("/viewallloan")
	@RequestMapping(value = "/viewallloan", method = RequestMethod.POST)
	public List<LoanApplication> retrieveAllLoanApplication() {
		return this.loanApplicationService.retrieveAllLoanApplication();

	}

	//@GetMapping("/viewbyid/{loanid}")
	@RequestMapping(value = "/viewbyid/{loanid}", method = RequestMethod.POST)
	public LoanApplication retrieveLoanApplicationById(@PathVariable("loanid") long loanApplicationId)
			throws InvalidLoanApplicationException {
		return this.loanApplicationService.retrieveLoanApplicationById(loanApplicationId);

	}
}