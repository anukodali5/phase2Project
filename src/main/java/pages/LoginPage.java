package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	// WebDriver driver = BaseTest.driver;

	/*
	 * By userNameTextbox = By.xpath("//input[@id='username']"); By passwordTextbox
	 * = By.name("password"); By loginBtn =
	 * By.xpath("//button[normalize-space()='Login']");
	 */
	By userNameTextbox = By.xpath("//input[@id='user-name']");
	By passwordTextbox = By.xpath("//input[@id='password']");
	By loginBtn = By.xpath("//input[@id='login-button']");

	public LoginPage(ThreadLocal<WebDriver> driver) {
		super(driver);
		PageFactory.initElements(driver.get(), this);

	}

	public void loginToApplication(String username, String passsword) {
		setText(userNameTextbox, username);
		setText(passwordTextbox, passsword);

		clickElement(loginBtn);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
