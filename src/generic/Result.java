package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

@Listeners(Result.class)
public class Result implements ITestListener,IAutoConst{
	public static int passCount=0, failCount=0;
//	public static String passName="", failName="";

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		passCount++;
//		passName=result.getName();
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		failCount++;
//		failName=result.getName();
//		Utility.getPhoto(driver, PHOTO_PATH);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Utility.writeResultToXL(SUMMARY_PATH, "sheet1", passCount, failCount);
	}

}
