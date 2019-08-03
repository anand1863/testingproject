package TestNGPack.TestNg1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.lang.*;

public class Login {
	@Test
	void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://35.239.72.37:8080/index");
		driver.findElement(By.id("username")).sendKeys("anand786");
		driver.findElement(By.id("password")).sendKeys("Rajnikant1!");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/button")).click();
		WebElement home_element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/a[1]"));

		assertEquals(home_element.getText(), "Home");
		


	}
}

