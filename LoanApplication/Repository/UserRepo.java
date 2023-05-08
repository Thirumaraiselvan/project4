package com.LoanApplication.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.LoanApplication.Model.UserModel;

public interface UserRepo extends JpaRepository<UserModel,Integer>{

	
}
