package testCases;

import org.testng.annotations.Test;

import objectRepository.CheckCart;

public class CheckKartTest {


	@Test
	void place(CheckCart pg1) {
		try {
			pg1.placeBtn().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
