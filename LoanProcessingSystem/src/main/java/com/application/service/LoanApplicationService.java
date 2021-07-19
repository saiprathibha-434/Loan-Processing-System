package com.application.service;
import java.util.List;

import com.application.InvalidLoanApplicationException.InvalidLoanApplicationException;
import com.application.entity.LoanApplication;




/* Loan Application Service
 * ILoanApplicationServiceImpl implements ILoanApplicationService interface
 * LoanApplication addLoanApplication(LoanApplication loanApplication) to add new loan application
 * LoanApplication updateLoanApplication(LoanApplication loanApplication) throws InvalidLoanApplicationException to update the loan application
 * LoanApplication deleteLoanApplication(long loanApplicationId) throws InvalidLoanApplicationException to delete the loan application
 * List<LoanApplication> retrieveAllLoanApplication() to get all the loan applications
 * LoanApplication retrieveLoanApplicationById(long loanApplicationId) throws InvalidLoanApplicationException to get all the loan applications by loan Id
 * 
 * 
 * */

public interface LoanApplicationService  {
	
	public LoanApplication addLoanApplication(LoanApplication loanApplication);
	public LoanApplication updateLoanApplication(LoanApplication loanApplication) throws InvalidLoanApplicationException;
	public LoanApplication deleteLoanApplication(long loanApplicationId) throws InvalidLoanApplicationException;
	public List<LoanApplication> retrieveAllLoanApplication();
	public LoanApplication retrieveLoanApplicationById(long loanApplicationId) throws InvalidLoanApplicationException;
	
	

}