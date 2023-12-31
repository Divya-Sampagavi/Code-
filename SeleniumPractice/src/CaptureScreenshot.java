import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshot {

	public static String CaptureScreenShotWithTestStepName(WebDriver driver, String testStepsName)
	{
		try{
			// down casting WebDriver to use getScreenshotAs method.
			TakesScreenshot ts= (TakesScreenshot)driver;
			// capturing screen shot as output type file
			File screenshotSRC= ts.getScreenshotAs(OutputType.FILE);
			// Defining path and extension of image
			String path=System.getProperty("user.dir")+"/ScreenCapturesPNG/"+testStepsName+System.currentTimeMillis()+".png";
			// copying file from temp folder to desired location
			File screenshotDest= new File(path);
			FileUtils.copyFile(screenshotSRC, screenshotDest);
			return path;
		}catch(Exception e)
		{
			System.out.println("Some exception occured." + e.getMessage());
			return "";
		}
	}
	

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\dsampaga\\Projects\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		driver.get("http://makeseleniumeasy.com/");
		
		CaptureScreenshot.CaptureScreenShotWithTestStepName(driver, "URL Loading");
		
		

	}

}

