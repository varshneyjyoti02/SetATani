package com.capi.tani.repo;


import java.util.List;

import com.capi.tani.beans.Customer;

public interface TaniRepo {
	
	public boolean save(Customer customer);
	public Customer findAll(String mobilenumber);
}
