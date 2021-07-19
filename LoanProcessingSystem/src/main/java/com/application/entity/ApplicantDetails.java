package com.application.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
	@Entity
	@Table(name="newApplicant")
	public class ApplicantDetails  {

		
		public int hashCode() {
			return super.hashCode();
		}

		
		public boolean equals(Object object) {
			return super.equals(object);
		}
		
		@Id
	    @GeneratedValue(strategy =GenerationType.AUTO )
	    private int id;
		 
	    @JsonProperty(value ="applicantname")
	    @Column(name ="ApplicantName")
		private String applicantName;
	    
	    @JsonProperty(value ="mobileNumber")
	    @Column(name ="MobileNumber")
		private Long mobileNumber;
	    
	    @JsonProperty(value ="emailId")
	    @Column(name ="EmailId")
		private String emailId;
	    
	    @JsonProperty(value ="dateOfBirth")
	    @Column(name ="DateOfBirth")
		@JsonFormat(pattern = "yyyy-MM-dd")
		private LocalDate dateOfBirth;
	    
	    @JsonProperty(value ="gender")
	    @Column(name ="Gender")
		private String gender;
	    
	    @JsonProperty(value ="nationality")
	    @Column(name ="Nationality")
		private String nationality;
		
		
		@JsonProperty(value ="aadharNumber")
	    @Column(name ="AadharNumber")
		private Long aadharNumber;
		
		@JsonProperty(value ="panNumber")
	    @Column(name ="PanNumber")
		private String panNumber;
		public ApplicantDetails(String applicantName, Long mobileNumber, String emailId, LocalDate dateOfBirth,
				String gender, String nationality, Long aadharNumber, String panNumber) {
			super();
			this.applicantName = applicantName;
			this.mobileNumber = mobileNumber;
			this.emailId = emailId;
			this.dateOfBirth = dateOfBirth;
			this.gender = gender;
			this.nationality = nationality;
			this.aadharNumber = aadharNumber;
			this.panNumber = panNumber;
		}


		public String getApplicantName() {
			return applicantName;
		}


		public void setApplicantName(String applicantName) {
			this.applicantName = applicantName;
		}


		public Long getMobileNumber() {
			return mobileNumber;
		}


		public void setMobileNumber(Long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}


		public String getEmailId() {
			return emailId;
		}


		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}


		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}


		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getNationality() {
			return nationality;
		}


		public void setNationality(String nationality) {
			this.nationality = nationality;
		}


		public Long getAadharNumber() {
			return aadharNumber;
		}


		public void setAadharNumber(Long aadharNumber) {
			this.aadharNumber = aadharNumber;
		}


		public String getPanNumber() {
			return panNumber;
		}


		public void setPanNumber(String panNumber) {
			this.panNumber = panNumber;
		}


		@Override
		public String toString() {
			return "ApplicantDetails [ApplicantName=" + applicantName + ", mobileNumber=" + mobileNumber + ", emailId="
					+ emailId + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", nationality=" + nationality
					+ ", aadharNumber=" + aadharNumber + ", panNumber=" + panNumber + "]";
		}
		
		
		
	}