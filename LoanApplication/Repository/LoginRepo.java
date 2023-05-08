package com.LoanApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LoanApplication.Model.LoginModel;


public interface LoginRepo extends JpaRepository<LoginModel,String>{

}