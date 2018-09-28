package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class TestDemo2 extends BaseTest{
	@Test
	public void TestLogin() {
		Reporter.log("TestLogin...", true);
		LoginPage l = new LoginPage(driver);
		l.setUserName(Utility.getXLData(INPUT_PATH, "sheet1", 1, 0));
		l.setPassword(Utility.getXLData(INPUT_PATH, "sheet1", 1, 1));
		l.clickLogin();
		HomePage h=new HomePage(driver);
		h.clickLogout();
	}
}