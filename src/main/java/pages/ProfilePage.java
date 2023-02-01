package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage {

	// WebDriver driver = BaseTest.driver;

	// By profileName = By.xpath("//strong[normalize-space() = '%s']");
	// String profileName = "//strong[normalize-space() = '%s']";
	// By signOutLink = By.xpath("//a[normalize-space()= 'Sign out']");

	By FirstName = By.xpath("//input[@id='first-name']");
	By LastName = By.xpath("//input[@id='last-name']");
	By ZipCode = By.xpath("//input[@id='postal-code']");
	By ContinueBtn = By.xpath("//input[@id='continue']");

	public ProfilePage(ThreadLocal<WebDriver> driver) {
		super(driver);

		PageFactory.initElements(driver.get(), this);

	}

	public void Profile(String FName, String LName, String ZCode) {
		setText(FirstName, FName);
		setText(LastName, LName);
		setText(ZipCode, ZCode);

		clickElement(ContinueBtn);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
