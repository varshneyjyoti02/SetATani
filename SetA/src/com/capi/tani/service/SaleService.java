package com.capi.tani.service;

import java.util.HashMap;

import com.capi.tani.bean.Sales;

public interface SaleService {
	
		public HashMap<Integer,Sales> insertSaleDetails(Sales sale);
		public boolean validateProductCode(int prodId);
		boolean validateQuantity(int qty);
		public boolean validateProductCat(String prodCat);
		public boolean validateProductName(String prodName,String prodCat);
		public boolean validateProductPrice(float price);
		//boolean validateProductName(String prodName, String prodCat);

	}



