package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.ProfilePage;
import utils.DataUtils;

public abstract class BaseTest {
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	// protected static WebDriver driver;

	protected LoginPage loginPage;
	protected ProfilePage ProfilePage;
	protected ProductsPage productsPage;
	protected CartPage cartpage;
	protected CheckoutPage checkoutpage;

	// String username = "standard_user";
	// String password = "secret_sauce";

	// String username = DataUtils.getTestData("Config", "BaseUrl");

	// String password = DataUtils.getTestData("Config", "BaseUrl");

	@BeforeMethod(alwaysRun = true)
	protected void setUp() {
		// setting up chrome driver
		// commenting the setup because added selenium 4.6.0
		// WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		driver.get().manage().window().maximize();
		driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

		// launch our application
		// driver.get().get("https://www.saucedemo.com/");
		try {
			driver.get().get(DataUtils.getTestData("Config", "BaseUrl"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		initializePageObjects();
	}

	private void initializePageObjects() {
		// homepage = new HomePage(driver);
		loginPage = new LoginPage(driver);
		ProfilePage = new ProfilePage(driver);
		productsPage = new ProductsPage(driver);
		cartpage = new CartPage(driver);
		checkoutpage = new CheckoutPage(driver);

	}

	@AfterMethod(alwaysRun = true)
	protected void cleanUpActivities() {
		driver.get().quit();

	}

}