package testcases;

import org.testng.annotations.Test;

import utils.DataUtils;

public class CheckoutTest extends BaseTest {

	String FirstName = "ABC";
	String LastName = "Test";
	String ZipCode = "12345";
	String BackpackName;
	String price;

	@Test
	public void checkoutPage() throws Exception {

		String username = DataUtils.getTestData("Config", "Username");
		String password = DataUtils.getTestData("Config", "Password");

		loginPage.loginToApplication(username, password);
		productsPage.AddToCart();
		productsPage.ClickOnCart();
		productsPage.ProductName();
		cartpage.Checkout();
		ProfilePage.Profile(FirstName, LastName, ZipCode);
		checkoutpage.VerifyProductAndPrice();
		checkoutpage.FinalPrice();
		checkoutpage.ClickFinish();
		checkoutpage.ConfirmationPageMsg();

	}

}
