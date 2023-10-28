import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Headless browser declaration
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		 /* OR
		  * options.addArguments("--headless")
		  * OR
		  * options.setHeadless(true)
		  */
		
		WebDriver driver  = new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println("Title of the page is: " + driver.getTitle());
		

	}

}
