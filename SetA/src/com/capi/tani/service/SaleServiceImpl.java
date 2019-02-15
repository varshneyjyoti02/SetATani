package com.capi.tani.service;

import java.util.HashMap;

import com.capi.tani.bean.Sales;
import com.capi.tani.dao.SaleDeo;
import com.capi.tani.dao.SaleDeoImpl;

public class SaleServiceImpl implements SaleService {

	SaleDeo sd=new SaleDeoImpl();
	public SaleServiceImpl(SaleDeo sd) {
		// TODO Auto-generated constructor stub
		this.sd=sd;
	}

	@Override
	public HashMap<Integer, Sales> insertSaleDetails(Sales sale) {
		// TODO Auto-generated method stub
		return sd.insertSaleDetails(sale);
	}

	@Override
	public boolean validateProductCode(int prodId) {
		// TODO Auto-generated method stub
		if(prodId==1001||prodId==1002||prodId==1003||prodId==1004)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean validateQuantity(int qty) {
		// TODO Auto-generated method stub
		if(qty>0&&qty<5)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean validateProductCat(String prodCat) {
		// TODO Auto-generated method stub
		if(prodCat.equals("Electronics")||prodCat.contentEquals("Toys"))
		{
			return true;
		}
		
		return false;
	}

	
	@Override
	public boolean validateProductPrice(float price) {
		// TODO Auto-generated method stub
		if(price>200)
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean validateProductName(String prodName, String prodCat) {
		// TODO Auto-generated method stub
		if(prodCat.equals("Electronics")&&(prodName.equals("TV")||prodName.equals
				("Smart Phone")||prodName.equals("Video Game"))||prodCat.equals("Toys")&&
				(prodName.equals("Soft Toy")||prodName.equals
						("Telescope")||prodName.equals("Barbee Doll"))) {
			return true;
		}
		return false;
	}

}
