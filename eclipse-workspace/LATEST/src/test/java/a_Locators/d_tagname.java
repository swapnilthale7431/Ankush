package a_Locators;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class d_tagname {
	@Test
	public void m1() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> mail=driver.findElements(By.tagName("a"));
		String abd=mail.get(0).getText();System.out.println(abd);
		int a =mail.size();System.out.println(a);
		for(int i=0;i<a;i++) {
			String str=mail.get(i).getText();
			System.out.println(str);
		}
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\HP\\eclipse-workspace\\LATEST\\Screen\\class.png");
		//FileHandler.copy(src, destn);
		FileUtils.copyFile(src, destn);
		
		
	}

}
