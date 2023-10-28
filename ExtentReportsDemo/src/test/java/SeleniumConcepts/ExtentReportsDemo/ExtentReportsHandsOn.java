package SeleniumConcepts.ExtentReportsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsHandsOn {
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
//		Extent Reports, ExtentSparkReporter
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Divya");
	}
	
	@Test
	public void initialTest() {
		ExtentTest test =  extent.createTest("Initial Test Demo");
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\dsampaga\\Projects\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com");
		
		System.out.println(driver.getTitle());
		driver.close();
		
		test.fail("Results do not match");
		
		
		extent.flush();
		
	}
}
