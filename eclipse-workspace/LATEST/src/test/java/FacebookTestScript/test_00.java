package FacebookTestScript;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_00 {
	
	
	email e=new email();
	
	@Test
	public void test() throws Exception {
		//By using Encapsulation i enter valid emailid and password
		String a=e.getA();
		String b=e.getB();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//1)Login With A User
		WebElement email=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		email.sendKeys(a);
		
		WebElement pass=driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pass.sendKeys(b);
		
		WebElement Lgnbtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		Lgnbtn.click();
		
		//2)Search for OnePlus Nord CE
		Thread.sleep(4000);
		WebElement searchbox=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchbox.sendKeys("OnePlus Nord CE");
Thread.sleep(2000);
		WebElement searchbtn=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		searchbtn.click();
		
		Thread.sleep(7000);

		WebElement mbl=driver.findElement(By.xpath("//div[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 128 GB)']"));
		mbl.click();
		
		Thread.sleep(3000);
		
		//3) Add to cart --->here child window open so by using childbrowser handling
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
	
		
		Set<String> setlist=driver.getWindowHandles(); // parent +child  duplicate /index 
		System.out.println(setlist);
		
		
		Iterator<String> it=setlist.iterator();
		
		while(it.hasNext()) {
			
			String childwindid=it.next();
			if(!parentwindow.equalsIgnoreCase(childwindid)) {
				
				driver.switchTo().window(childwindid);
				Thread.sleep(2000);
				
				
	//4)Click on Buy Button
				WebElement addtocartbtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
				addtocartbtn.click();
				Thread.sleep(2000);
				
				WebElement cntnuebtn=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']"));
				cntnuebtn.click();
				Thread.sleep(2000);
				
				//5)there is no cancel button here insted of that we click on navigate back &remove from the cart
				driver.navigate().back();
				Thread.sleep(2000);
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				 js.executeScript("window.scrollBy(0,500)", "");
				Thread.sleep(1000);
				
			WebElement remove=driver.findElement(By.xpath("(//div[@class='_3dsJAO'])[2]"));
			remove.click();
			Thread.sleep(2000);
			WebElement removebtn=driver.findElement(By.xpath("//div[@class='_3dsJAO _24d-qY FhkMJZ']"));				removebtn.click();
			Thread.sleep(2000);
				
			
			}
		}
		
		
	}

}
