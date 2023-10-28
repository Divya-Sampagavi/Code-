import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks_Divya {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
	
		for (int i=0; i< links.size(); i++) {
			String url = links.get(i).getAttribute("href");
			System.out.println("Url is " +url);
			
			try {
				HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
				connection.setRequestMethod("HEAD");
				connection.connect();
				
				int responseCode = connection.getResponseCode();
				
				if (responseCode>=400) {
					System.out.println("Broken link found" + url);
					
				}
				
			}
			catch (Exception e){
				System.out.println("Error checking link" + url);
			}
		
		}
		driver.quit();
	}
}
