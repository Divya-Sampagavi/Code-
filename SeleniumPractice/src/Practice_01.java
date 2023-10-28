import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    //	From Selenium version 4.6.0, SeleniumManager is introduced - 
	//	which will invoke the brow\ser and no need to download chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsampaga\\Projects\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
