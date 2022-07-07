package c_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DropDownHandle {
	@Test
	public static void m1() throws Exception{
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement contry_drp=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select select=new Select(contry_drp);
		
		String defaultvalue=select.getFirstSelectedOption().getText();
		System.out.println(defaultvalue);
		
		// selectByIndex
		select.selectByIndex(1);
		
		Thread.sleep(5000);
		//selectByValue
		select.selectByValue("ANGOLA");
		
		Thread.sleep(5000);
		//selectByVisibleText
		select.selectByVisibleText("ANDORRA");
		
		List<WebElement> list=select.getOptions();
		
		for(int i=0;i<list.size();i++) {
			
			String option=list.get(i).getText();
			System.out.println(option);
			
			if(option.equals("ANDORRA")) {
				select.selectByVisibleText("ANDORRA");
			}else {
				System.out.println("There no any dropdown option like ANDORRA");
			}
			
		}
	
	}

}
