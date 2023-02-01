package com.bdd.test.scenarios;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testcases.BaseTest;

public class loginStepsDefinations extends BaseTest {

	// Hooks
	@Before
	public void setUPDriverAndPageObjects(Scenario scenario) {
		setUp();
	}

	@After
	public void performCleanUp(Scenario scenario) {
		cleanUpActivities();
	}

	@Given("The user is on login page")
	public void verifyLogin() {
		System.out.println("The user is login page");
	}

	@When("The user enter the {string} in username field and {string} in password field and click login button")
	public void verifyLoginCredentails(String user, String pass) {
		loginPage.loginToApplication(user, pass);
	}

	@Then("Login should be successful")
	public void displaySucessMsg() {
		System.out.println("user login is succesful");
	}

	@Given("The user is on Products page")
	public void verifyUserProductPage() {
		System.out.println("user is on Products Page");
	}

	@When("The user will click on the ADD TO CART \r\n" + "And the cart symbol\r\n" + "And navigates to Cart page\r\n"
			+ "And click on Checkout button\r\n" + "And user navigates to Profile page\r\n"
			+ "And user complets the profile data\r\n" + "And user clicks on continue\r\n"
			+ "And user navigates to checkout page\r\n" + "And user verifies the product name , product price\r\n"
			+ "And user calulates the total price by adding the tax\r\n" + "And user Clicks on the finish")
	public void verifyProductAddedToCart() {
		productsPage.AddToCart();
		productsPage.ClickOnCart();
		productsPage.ProductName();
		cartpage.Checkout();
		ProfilePage.Profile("FName", "LName", "12345");
		checkoutpage.VerifyProductAndPrice();
		checkoutpage.FinalPrice();
		checkoutpage.ClickFinish();
		checkoutpage.ConfirmationPageMsg();

	}

	@Then("User navigates to Complete page")
	public void verifyCartPage() {
		System.out.println("user is on Complete Page");
	}
}
