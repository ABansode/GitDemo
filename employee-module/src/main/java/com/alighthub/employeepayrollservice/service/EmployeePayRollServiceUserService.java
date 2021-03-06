package com.alighthub.employeepayrollservice.service;

import com.alighthub.employeepayrollservice.model.FormSixteen;
import com.alighthub.employeepayrollservice.model.Login;
import com.alighthub.employeepayrollservice.model.MonthlySalaryGenrate;
import com.alighthub.employeepayrollservice.model.UserRegistration;



public interface EmployeePayRollServiceUserService {
	
	public UserRegistration userPersonalDatails(Integer userrid);
	
	public MonthlySalaryGenrate paySlipPost(MonthlySalaryGenrate monthlySalaryGenrate);
	
	public boolean getpassword1(String password);
	
	public int changepassword(Login login);
	
	public FormSixteen formsixteen(Integer userRegistration);
	
	

	
	
	
}
