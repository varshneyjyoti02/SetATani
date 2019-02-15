import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import com.capi.tani.bean.Sales;
import com.capi.tani.dao.SaleDeo;
import com.capi.tani.dao.SaleDeoImpl;
import com.capi.tani.exception.ProductNameIsNumeric;
import com.capi.tani.service.SaleService;
import com.capi.tani.service.SaleServiceImpl;

public class SaleTest {
SaleDeo sd=new SaleDeoImpl();
SaleService ss=new SaleServiceImpl(sd);
//Sales s=new sale();
	@Before
	public void setUp() throws Exception {
	}

	@Test(expected=com.capi.tani.exception.ProductNameIsNumeric.class)
	public void test() throws ProductNameIsNumeric {
		ss.insertSaleDetails(new Sales(1001,1001,"Electronics","TV1",LocalDate.now(),3,900,300));
	}
	
	@Test
	public void test1() throws ProductNameIsNumeric {
		ss.insertSaleDetails(new Sales(1001,1001,"Electronics","TV",LocalDate.now(),3,900,300));
	}

}
