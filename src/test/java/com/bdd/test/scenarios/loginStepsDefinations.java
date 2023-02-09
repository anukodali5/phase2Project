package com.bdd.test.scenarios;

import java.util.List;
import java.util.Map;

import io.cucumber.core.api.Scenario;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testcases.BaseTest;

public class loginStepsDefinations extends BaseTest {
	// By addToCartButton =
	// By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

	// By clickOnCart = By.xpath(" //span[@class='shopping_cart_badge']");

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

	@When("The user enter the the following credentails")
	public void verifyLoginCredentails(DataTable dt) {
		List<Map<String, String>> logindata = dt.asMaps(String.class, String.class);
		System.out.println(logindata.get(0).get("Username"));
		System.out.println(logindata.get(0).get("Password"));
		loginPage.loginToApplication(logindata.get(0).get("Username"), logindata.get(0).get("Password"));
	}

	@Then("User should be landed on the Products Page")

	public void displaySucessMsg() {

		System.out.println("user login is succesful and is on the Products page");
	}

	@When("User landed at Product page after logged in successfully")
	public void Vreify() {
		System.out.println("Hi");
	}

	@Then("User should be able to notice the Shopping Cart icon badge changed")
	public void verifyAddProductToCart() {
		productsPage.AddToCart();
		productsPage.ProductName();

	}

	@And("User should be able examine the item in Shopping cart")
	public void verifyCart() {
		productsPage.ClickOnCart();
	}

	@And("user clicks on checkout")
	public void clickOnCheckout() {
		cartpage.Checkout();
	}

	@And("User provides profile info clicks on Continue button")
	public void clickOnContinue() {
		ProfilePage.Profile("FName", "LName", "ZipCode");
	}

	@And("User is on products overview page clciks on Finish")
	public void clickOnFinish() {
		checkoutpage.VerifyProductAndPrice();
		checkoutpage.FinalPrice();
		checkoutpage.ClickFinish();
		checkoutpage.ConfirmationPageMsg();
	}
}
