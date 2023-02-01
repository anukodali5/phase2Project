package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

	By addToCartButton = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");

	By clickOnCart = By.xpath(" //span[@class='shopping_cart_badge']");
	By price = By.xpath("//div[normalize-space()='$29.99']");
	// String price = "//div[normalize-space()='$29.99']";
	By backPackProduct = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
	// String backPackProduct = "//div[normalize-space()='Sauce Labs Backpack']";

	public ProductsPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void AddToCart() {

		clickElement(addToCartButton);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ClickOnCart() {
		System.out.println("clickOnCart");
		System.out.println(clickOnCart);
		clickElement(clickOnCart);
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ProductName() {

		productName = getText(backPackProduct);
		productPrice = getText(price);

	}

}
