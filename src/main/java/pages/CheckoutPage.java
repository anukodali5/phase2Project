package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckoutPage extends BasePage {

	By verifyProductName = By.xpath("//div[@class='inventory_item_name']");
	// String verifyProductName = "//div[@class='inventory_item_name']";
	By verifyProductPrice = By.xpath("//div[@class='inventory_item_price']");
	// String verifyProductPrice = "//div[@class='inventory_item_price']";
	// String tax = "//div[@class='summary_tax_label']";
	By tax = By.xpath("//div[@class='summary_tax_label']");
	By finishBtn = By.xpath("//button[@id='finish']");
	By confirmationmsg = By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']");

	public CheckoutPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);

	}

	public void FinalPrice() {
		// System.out.println(getText(tax));
		String taxamount = getText(tax); // Tax: $2.40
		String ProductPeice = getText(verifyProductPrice); // $29.99
		float finalPrice = Float.parseFloat(taxamount.substring(6, taxamount.length()))
				+ Float.parseFloat(ProductPeice.substring(1, ProductPeice.length()));
		System.out.println("Total price of the Product:" + "$" + finalPrice);

		// if (taxamount > 0) {
		// String TotalPrice = ProductPeice + taxamount;
		// System.out.println(TotalPrice);

	}

	public void ClickFinish() {
		clickElement(finishBtn);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ConfirmationPageMsg() {

		String confirmationPage = getText(confirmationmsg);
		// System.out.println(confirmationPage);
		String expectedconfirmationMsg = "THANK YOU FOR YOUR ORDER";
		Assert.assertEquals(confirmationPage, expectedconfirmationMsg, "They should be equal");
		System.out.println("Product name:" + productName);
		System.out.println("product price:" + productPrice);

	}

	public void VerifyProductAndPrice() {
		Assert.assertEquals(getText(verifyProductName), productName);
		Assert.assertEquals(getText(verifyProductPrice), productPrice);
	}

}
