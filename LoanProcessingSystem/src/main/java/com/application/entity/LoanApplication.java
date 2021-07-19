package com.application.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
/*import javax.persistence.EnumType;
import javax.persistence.Enumerated;*/
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Status;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="loanApplication")
public class LoanApplication {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long applicationId;
	
    
	@JsonProperty(value ="Applicant")
	 @Column(name ="Applicant")
	private String Applicant;
	
	 @JsonProperty(value ="loanAppliedAmount")
	 @Column(name ="loanAppliedAmount")
	 private double loanAppliedAmount;
	
	 @JsonProperty(value ="loanApprovedAmount")
	 @Column(name ="LoanApprovedAmount")
	 private double loanApprovedAmount;
	 
	 @JsonProperty(value ="applicationDate")
	 @Column(name ="ApplicationDate")
	 @JsonFormat(pattern= "yyyy-MM-dd")
	 private LocalDate applicationDate;
	 
	 @JsonProperty(value ="DocumentVerificationApproval")
	 @Column(name ="DocumentVerificationApproval")
	 private boolean DocumentVerificationApproval;
	 
	 @JsonProperty(value ="loanApproval")
	 @Column(name ="LoanApproval")
	 private boolean loanApproval;
	
	 @JsonProperty(value ="status")
	 @Column(name ="Status")
	private boolean status;

	

	public LoanApplication() {
		super();
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanApplication other = (LoanApplication) obj;
		if (applicationId != other.applicationId)
			return false;
		return true;
	}


	public LoanApplication(long applicationId, LocalDate applicationDate, String Applicant,
			double loanAppliedAmount, double loanApprovedAmount, boolean documentVerificationApproval,
			boolean adminApproval, boolean status) {
		super();
		this.applicationId = applicationId;
		this.applicationDate = applicationDate;
		this.Applicant = Applicant;
		this.loanAppliedAmount = loanAppliedAmount;
		this.loanApprovedAmount = loanApprovedAmount;
		this.DocumentVerificationApproval = documentVerificationApproval;
		this.loanApproval = loanApproval;
		this.status = status;
	}


	public long getApplicationId() {
		return applicationId;
	}


	public void setApplicationId(long applicationId) {
		this.applicationId = applicationId;
	}


	public LocalDate getApplicationDate() {
		return applicationDate;
	}


	public void setApplicationDate(LocalDate applicationDate) {
		this.applicationDate = applicationDate;
	}


	public String getApplicant() {
		return Applicant;
	}


	public void setCustomer(String Applicant) {
		this.Applicant = Applicant;
	}


	public double getLoanAppliedAmount() {
		return loanAppliedAmount;
	}


	public void setLoanAppliedAmount(double loanAppliedAmount) {
		this.loanAppliedAmount = loanAppliedAmount;
	}


	public double getLoanApprovedAmount() {
		return loanApprovedAmount;
	}


	public void setLoanApprovedAmount(double loanApprovedAmount) {
		this.loanApprovedAmount = loanApprovedAmount;
	}


	public boolean isDocumentVerificationApproval() {
		return DocumentVerificationApproval;
	}


	public void setDocumentVerificationApproval(boolean documentVerificationApproval) {
		DocumentVerificationApproval = documentVerificationApproval;
	}


	
	 public boolean isloanApproval() { return loanApproval; }
	  
	  
	 public void setAdminApproval(boolean adminApproval) { this.loanApproval =
	 adminApproval; }
	 

	public boolean getStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "LoanApplication [applicationId=" + applicationId + ", Applicant=" + Applicant + ", loanAppliedAmount="
				+ loanAppliedAmount + ", loanApprovedAmount=" + loanApprovedAmount + ", applicationDate="
				+ applicationDate + ", DocumentVerificationApproval=" + DocumentVerificationApproval + ", loanApproval="
				+ loanApproval + ", status=" + status + "]";
	}
	
	
	
	
}