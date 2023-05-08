package com.LoanApplication.Repository;



	import org.springframework.data.jpa.repository.JpaRepository;

	import com.LoanApplication.Model.AdminModel;

	public interface AdminRepo extends JpaRepository<AdminModel,String>{

	
}
