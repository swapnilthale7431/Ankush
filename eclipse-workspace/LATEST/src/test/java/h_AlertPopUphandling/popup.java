package h_AlertPopUphandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popup {

	
	
	@Test
	public void Test_ch() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		//driver.get("https://www.naukri.com/mnjuser/homepage");
		driver.manage().window().maximize();
		
		WebElement clkhr=driver.findElement(By.xpath("//a[text()='Click Here']"));
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		clkhr.click();
		
		Set<String> bothadress=driver.getWindowHandles();
		System.out.println(bothadress);
		Iterator<String> it=bothadress.iterator();
		while(it.hasNext()) {
			
			String Childwindowid=it.next();
			System.out.println(Childwindowid);
			if(!Childwindowid.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(Childwindowid);
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("Test@gmail.com");
				Thread.sleep(4000);
				driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				//driver.close();
			}
			}
		driver.switchTo().window(parentwindow);
	}
}
