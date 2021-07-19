package com.application.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.entity.LoanApplication;




@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
	

}