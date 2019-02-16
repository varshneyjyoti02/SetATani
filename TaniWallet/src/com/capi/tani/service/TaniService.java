package com.capi.tani.service;

import java.math.BigDecimal;
import java.util.List;

import com.capi.tani.beans.Customer;

public interface TaniService {
	public Customer createAccount(String name,String mobileNumber,BigDecimal amount);
	public Customer showBalance(String mobileNumber);
	public Customer fundTransfer(String sourceMobileNumber,String targetMobileNumber,BigDecimal amount) ;
	public Customer depositAmount(String mobileNumber,BigDecimal amount) ;
	public Customer withdrawAmount(String mobileNumber,BigDecimal amount) ;

}
