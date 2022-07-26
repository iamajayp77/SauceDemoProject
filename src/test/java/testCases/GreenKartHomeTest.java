package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectRepository.GreenKartHome;

public class GreenKartHomeTest {

	
   @Test
	void addItemToCart(GreenKartHome pg1, WebDriver driver) {
		try {
			pg1.item1().click();
			pg1.item2().click();
			pg1.item3().click();
			pg1.item4().click();
			pg1.item5().click();
			pg1.item6().click();
			pg1.item7().click();
			pg1.item8().click();
			pg1.cartBtn().click();
			pg1.checkoutBtn().click();
		    Assert.assertEquals(false, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
