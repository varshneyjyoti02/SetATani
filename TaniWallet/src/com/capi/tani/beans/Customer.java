package com.capi.tani.beans;

public class Customer {
	private String name;
	private String mobNo;
	private Wallet wallet;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", mobNo=" + mobNo + ", wallet=" + wallet + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String name, String mobNo, Wallet wallet) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.wallet = wallet;
	}
	

}
