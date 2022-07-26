package testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectRepository.PlaceOrder;

public class PlaceOrderTest extends BaseClass {

   
	@Test
	void checkout(PlaceOrder pg2) {
		try {
			pg2.selectCountry().click();

			Select sel = new Select(pg2.selectCountry());
			sel.selectByValue("India");

			pg2.term().click();

			pg2.proceed().click();

			System.out.println(pg2.text().getText());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
