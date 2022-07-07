package j_Exception_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first {
	@Test (enabled=false)
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement mail=driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("Testt");
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.xpath("//input[@id='pas']"));
		pass.sendKeys("123456789");
		WebElement clkbtn=driver.findElement(By.xpath("//button[@id='loginbutton']"));
		clkbtn.click();
		
	}
	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement mail=driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("Testt");
		Thread.sleep(2000);
		
		try {
			
			WebElement pass=driver.findElement(By.xpath("//input[@id='pas']"));
			pass.sendKeys("123456789");
		
				}
		catch(Exception e) {
			//System.out.println(e);
		
		}
		finally {
			
			WebElement clkbtn=driver.findElement(By.xpath("//button[@id='loginbutton']"));
			clkbtn.click();
		}
		
	}

}
