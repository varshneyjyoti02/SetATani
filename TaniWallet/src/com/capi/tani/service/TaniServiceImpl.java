package com.capi.tani.service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.capi.tani.beans.Customer;
import com.capi.tani.beans.Wallet;
import com.capi.tani.repo.TaniRepo;
import com.capi.tani.repo.TaniRepoImpl;

public class TaniServiceImpl implements TaniService{
	TaniRepo tr= new TaniRepoImpl();
	
	public TaniServiceImpl(TaniRepo tr) {
		// TODO Auto-generated constructor stub
		this.tr=tr;
	}

	@Override
	public Customer createAccount(String name, String mobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer custom=new Customer(name,mobileNumber,new Wallet(amount));
		tr.save(custom);
		return custom;
	}

	@Override
	public Customer showBalance(String mobileNumber) {
		// TODO Auto-generated method stub
		
		return tr.findAll(mobileNumber);
	}

	@Override
	public Customer fundTransfer(String sourceMobileNumber, String targetMobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub;
		
		this.depositAmount(targetMobileNumber, amount);
		this.withdrawAmount(sourceMobileNumber, amount);
		return tr.findAll(sourceMobileNumber);
	}

	@Override
	public Customer depositAmount(String mobileNumber, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer cus=tr.findAll(mobileNumber);
		Wallet wallet=cus.getWallet();
		wallet.setBalance(wallet.getBalance().add(amount));
		cus.setWallet(wallet);
		return cus;	}

	@Override
	public Customer withdrawAmount(String mobileNumber, BigDecimal amount) {
	// TODO Auto-generated method stub
		
		Customer cus=tr.findAll(mobileNumber);
		Wallet wallet=cus.getWallet();
		wallet.setBalance(wallet.getBalance().subtract(amount));
		cus.setWallet(wallet);
		return cus;
	}

}
