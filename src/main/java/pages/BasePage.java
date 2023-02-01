package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	// WebDriver driver = BaseTest.driver;
	ThreadLocal<WebDriver> driver2 = new ThreadLocal<WebDriver>();
	// protected static WebDriver driver2;
	static String productName;
	static String productPrice;

	// public void LoginFunction(String UserNameVal, String PasswordVal) {
	By menuLinkLogin = By.xpath("//a[contains(text(),'Log In')]");

	// }

	public BasePage(ThreadLocal<WebDriver> driver) {
		driver2 = driver;
	}

	protected void clickElement(By element) {

		driver2.get().findElement(element).click();

	}

	protected void setText(By element, String textToType) {
		driver2.get().findElement(element).sendKeys(textToType);

	}

	protected String getText(By element) {
		return driver2.get().findElement(element).getText();
	}

	protected boolean isElementPresent(By element) {
		return driver2.get().findElement(element).isDisplayed();
	}

	@SuppressWarnings("null")
	protected List<String> getAllTextsByElement(By element) {
		List<String> results = null;
		List<WebElement> webElements = driver2.get().findElements(element);
		for (WebElement webElement : webElements) {
			results.add(webElement.getText());
		}

		return results;
	}
}
