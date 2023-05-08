package com.LoanApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LoanApplication.Model.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel,Integer>{

}