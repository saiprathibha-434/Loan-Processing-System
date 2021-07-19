package com.application.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.entity.ApplicantDetails;




@Repository
public interface ApplicantRepo extends JpaRepository<ApplicantDetails,Integer> {

	ApplicantDetails save(ApplicantDetails applicantregistration);

	
}