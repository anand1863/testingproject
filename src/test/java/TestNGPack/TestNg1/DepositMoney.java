package TestNGPack.TestNg1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DepositMoney 
{
	@Test
	void Deposit(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://35.239.72.37:8080/index");
		driver.findElement(By.id("username")).sendKeys("anand786");
		driver.findElement(By.id("password")).sendKeys("Rajnikant1!");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/button")).click();
		WebElement home_element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/div[1]/a[1]"));

		//login
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand\\Downloads\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		String deposit = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h1[1]/span[1]")).getText();
		double orgdeposit = Double.parseDouble(deposit);
		System.out.println(orgdeposit);
		driver.findElement(By.xpath("//span[contains(text(),'Go to Deposit')]")).click();
		Select s = new Select(driver.findElement(By.id("accountType")));
		s.selectByVisibleText("Primary");
		double x=50;
		driver.findElement(By.id("amount")).sendKeys("50"); // enter amount
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/button[1]")).click(); // click deposit
		String deposit1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h1[1]/span[1]")).getText();
		double newdeposit = Double.parseDouble(deposit1);
		double y = newdeposit-orgdeposit;
		assertEquals(x, y);
	}
}
