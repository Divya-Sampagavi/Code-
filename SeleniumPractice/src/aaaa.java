import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aaaa {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\dsampaga\\Projects\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getPageSource());
		
//		Navigation commands
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
//		Set window size
		Dimension d = new Dimension(123, 89);
		driver.manage().window().setSize(d);
		
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionKey");
//		
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("C://users//documents//screenshot.png"));
		
		driver.close();
	}
}
