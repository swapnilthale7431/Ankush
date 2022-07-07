package a_Locators;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import z_AngelOne_end_to_end_testing.pass_id;

public class a_id_Locator {
	pass_id t=new pass_id();
	
	
	@Test(groups= {"sanity"})
	public void test_id() throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://livetrafficfeed.com/login");
	driver.manage().window().maximize();
	
	WebElement mail=driver.findElement(By.id("email"));
	mail.sendKeys("Test@gmail.com");

	WebElement pass=driver.findElement(By.id("password"));
	pass.sendKeys("9922556611");

	WebElement clkbtn=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	clkbtn.click();
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File destn=new File("C:\\Users\\HP\\eclipse-workspace\\LATEST\\Screen\\id.png");
	//FileHandler.copy(src, destn);
	FileUtils.copyFile(src, destn);
	
	
	
	}

}
