package TestNGPack.TestNg1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignupBt 
{
	@Test
	void signupbutton() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://35.239.72.37:8080/index");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		String originalurl ="http://35.239.72.37:8080/signup"; 
		String url = driver.getCurrentUrl();
		System.out.println(url);
		assertEquals(originalurl, url);
		
	}
}
