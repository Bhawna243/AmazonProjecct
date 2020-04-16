package testlistner;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestResult implements ITestNGListener {
	
public  void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failed" +result.getName());
		
	}

}
