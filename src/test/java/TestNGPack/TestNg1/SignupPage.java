package TestNGPack.TestNg1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignupPage 
{
	@Test
	void signupP() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://35.239.72.37:8080/index");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.id("firstName")).sendKeys("Ashish");
		driver.findElement(By.id("lastName")).sendKeys("Sharma");
		driver.findElement(By.id("phone")).sendKeys("9875438764");
		driver.findElement(By.id("email")).sendKeys("anandhy@gmail.com");
		driver.findElement(By.id("username")).sendKeys("ashish007");
		driver.findElement(By.id("password")).sendKeys("kamlesh");
		//Signup page
		String usernme ="ashish007";
		String Password = "kamlesh";
		
		//login page
		driver.findElement(By.id("username")).sendKeys("ashish007");
		driver.findElement(By.id("password")).sendKeys("kamlesh");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/button")).click();
		String url = driver.getCurrentUrl();
		String url1= "http://35.239.72.37:8080/userFront";
		assertEquals(url, url1);
		
	}
}
