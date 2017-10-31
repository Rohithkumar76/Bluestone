package com.tys.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.tys.generics.BaseTest;
import com.tys.generics.UtilityLib;
import com.tys.pages.HomePage;
import com.tys.pages.RingsPage;

public class WishListTest extends BaseTest {

	@Test
	public void wishListTest() throws InterruptedException {

		String un = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 0);
		String pw = UtilityLib.getCellValue(INPUT_PATH, "ValidLoginLogoutTest", 1, 1);

		HomePage homepage = new HomePage(driver);

		homepage.ClickLogin();

		homepage.setUserName(un);

		homepage.setPassWord(pw);

		homepage.ClickSignIn();

		Thread.sleep(8000);
		homepage.ClicOnRings();

		Thread.sleep(8000);

		RingsPage ringspage = new RingsPage(driver);
		ringspage.clickOnFirstRing();
		
		
		Thread.sleep(5000);
		ringspage.clickOnWishListLink();
		
		
		Thread.sleep(5000);

		if (homepage.getWishListCount() == 1) {
			Reporter.log("Wish List is added succesfuly", true);
		}
		
		Thread.sleep(5000);

	}

}
