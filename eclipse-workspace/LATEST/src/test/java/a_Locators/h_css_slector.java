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

public class h_css_slector {
	
	
	
	@Test
	
		public void test_css() throws Exception {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement mail=driver.findElement(By.cssSelector("input[id=email]"));
			mail.sendKeys("Test@gmail.com");
			Thread.sleep(2000);
			WebElement pass=driver.findElement(By.cssSelector("input[id=pass]"));
			pass.sendKeys("9922556611");
			Thread.sleep(2000);
			WebElement clkbtn=driver.findElement(By.cssSelector("button[id=loginbutton]"));
			clkbtn.click();
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File destn=new File("C:\\Users\\HP\\eclipse-workspace\\LATEST\\Screen\\css.png");
			//FileHandler.copy(src, destn);
			FileUtils.copyFile(src, destn);
			
			}

		
		
		
		
	}


