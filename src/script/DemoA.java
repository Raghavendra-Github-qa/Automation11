package script;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class DemoA {
	
	@Test 
	public void testA() {
		Reporter.log("TestA",true);
	}
	
	@Test 
	public void testB() {
		Reporter.log("TestB",true);
//		Assert.fail();
	}
	
	@AfterMethod
	public void closeApp(ITestResult result) {
		String name=result.getName();
		int status=result.getStatus();
		Reporter.log(name+" Status : "+status,true);
		Reporter.log("close App",true);
	}

}
