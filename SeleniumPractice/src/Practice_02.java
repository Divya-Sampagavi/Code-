import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dsampaga\\Projects\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Divya");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		System.out.println(driver.findElement(By.tagName("a")).getText());
		driver.findElement(By.tagName("a")).click();
		
//		driver.findElement(By.className("signInBtn")).click();
		
//		driver.close();
		
	}
}
