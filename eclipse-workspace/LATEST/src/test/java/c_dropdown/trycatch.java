package c_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trycatch {
	@Test
	public void m2() {
		int a=10;
		int b=a/0;
		System.out.println(b);
		System.out.println("--------------------------");
		
		
	}
	@Test
	public void m1() {
		
		try {
			System.out.println("Enter a number");
			
			Thread.sleep(-2000);
			System.out.println(" Exception not occure");	
		}
		catch(Exception e) {
			
			System.out.println(e);
			System.out.println("Exception handled");
				
		}
		finally{
			System.out.println(" Its all right");
		
		}
		
	}
	@Test 
	public void m3()  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	
		try {
		Thread.sleep(2000);
		
		WebElement email=driver.findElement(By.xpath("//input[class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']"));
		email.sendKeys("Test 1");
		}
		catch(Exception z) {
			System.out.println(z);
			}

		WebElement pass=driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']"));
		pass.sendKeys("123456789");
		
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
		
		
	}
}
