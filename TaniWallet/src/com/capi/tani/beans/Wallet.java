package com.capi.tani.beans;

import java.math.BigDecimal;

public class Wallet {
	private BigDecimal balance;

	@Override
	public String toString() {
		return "Wallet [balance=" + balance + "]";
	}

	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wallet(BigDecimal balance) {
		super();
		this.balance = balance;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}
