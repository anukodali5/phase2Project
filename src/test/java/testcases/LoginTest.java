package testcases;

import org.testng.annotations.Test;

import utils.DataUtils;

public class LoginTest extends BaseTest {
	// loginPage.loginToApplication();

	@Test
	public void testLogin() throws Exception {
		String username = DataUtils.getTestData("Config", "Username");
		String password = DataUtils.getTestData("Config", "Password");
		loginPage.loginToApplication(username, password);

	}

}
