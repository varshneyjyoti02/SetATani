package com.capi.tani.repo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.capi.tani.beans.Customer;

public class TaniRepoImpl implements TaniRepo{
	List<Customer> l=new LinkedList();

	
	@Override
	public boolean save(Customer customer) {
		// TODO Auto-generated method stub
		return l.add(customer);
	}

	@Override
	public Customer findAll(String mobilenumber) {
		// TODO Auto-generated method stub
		//List<Customer> l=new LinkedList();
		
		for(Customer e:l)
			
		{
			if(e.getMobNo().equals(mobilenumber))
			return e;
		}
		
		return null;
	}

}
