package a_Locators;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class g_xpath_Locator {
	public WebDriver driver;
	@Test()
	public void test_absolute() throws Exception {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement mail=driver.findElement(By.xpath("email"));
	mail.sendKeys("Test@gmail.com");
	Thread.sleep(2000);
	WebElement pass=driver.findElement(By.xpath("pass"));
	pass.sendKeys("9922556611");
	Thread.sleep(2000);
	WebElement clkbtn=driver.findElement(By.xpath("login"));
	clkbtn.click();
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File destn=new File("C:\\Users\\HP\\eclipse-workspace\\LATEST\\Screen\\class.png");
	//FileHandler.copy(src, destn);
	FileUtils.copyFile(src, destn);
	
	}

}
