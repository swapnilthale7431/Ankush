package z_NOKRI_COM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nokri_update {
	pass k=new pass();
	@Test(groups="m1",priority=1)
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//1)Open browser and navigate to nokri.com site
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//2)pass email id and password and click on login btn
		WebElement loginbtn=driver.findElement(By.xpath("//a[@id='login_Layer']"));
		loginbtn.click();
		Thread.sleep(4000);
		WebElement mailid=driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
		mailid.sendKeys(k.getEmail());//here we have to pass valid emailid
		
		Thread.sleep(4000);
		WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		pass.sendKeys(k.getPass());//here we have to pass valid password
		
		Thread.sleep(4000);
		WebElement logbtn=driver.findElement(By.xpath("//button[@class='btn-primary loginButton']"));
		logbtn.click();
		Thread.sleep(5000);
		//mouseover to mynokritab
		WebElement mynokri=driver.findElement(By.xpath("//a[@href='https://my.naukri.com/HomePage/view']"));
		Actions act=new Actions(driver);
		act.moveToElement(mynokri).perform();
		//4)navigate to edit profile url
		driver.navigate().to("https://www.naukri.com/mnjuser/profile?id=&altresid");
		Thread.sleep(6000);
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("scroolby", null)
		
		//5)click on edit resume button and pass the text then click to save button
		WebElement editresume=driver.findElement(By.xpath("(//span[text()='Edit'])[2]"));
		editresume.click();
		Thread.sleep(4000);
		WebElement text=driver.findElement(By.xpath("//textarea[@class='resumeHeadlineTxt materialize-textarea']"));
		text.click();
		Thread.sleep(4000);
		text.sendKeys(" ");
		Thread.sleep(6000);
	WebElement save=driver.findElement(By.xpath("(//button[@class='waves-effect waves-light btn-large blue-btn'])[4]"));
				save.click();
				Thread.sleep(4000);
		//6)click on upload resume button and send the path of pdf file		
WebElement upload=driver.findElement(By.xpath("//input[@class='fileUpload waves-effect waves-light btn-large']"));
String path="C:/Users/HP/Documents/Pune/Ankush_Agale_Software_Test_Engineer.pdf";

upload.sendKeys(path);


	}
	
	Mumbai m=new Mumbai();
	@Test()
	public void m2() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//1)Open browser and navigate to nokri.com site
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		//2)pass email id and password and click on login btn
		WebElement loginbtn=driver.findElement(By.xpath("//a[@id='login_Layer']"));
		loginbtn.click();
		Thread.sleep(4000);
		WebElement mailid=driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
		mailid.sendKeys(m.getEmailid());//here we have to pass valid emailid
		
		Thread.sleep(4000);
		WebElement pass=driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
		pass.sendKeys(m.getPassword());//here we have to pass valid password
		
		Thread.sleep(4000);
		WebElement logbtn=driver.findElement(By.xpath("//button[@class='btn-primary loginButton']"));
		logbtn.click();
		Thread.sleep(4000);
		//mouseover to mynokritab
		WebElement mynokri=driver.findElement(By.xpath("//a[@href='https://my.naukri.com/HomePage/view']"));
		Actions act=new Actions(driver);
		act.moveToElement(mynokri).perform();
		//4)navigate to edit profile url
		driver.navigate().to("https://www.naukri.com/mnjuser/profile?id=&altresid");
		Thread.sleep(4000);
		//5)click on edit resume button and pass the text then click to save button
		WebElement editresume=driver.findElement(By.xpath("(//span[text()='Edit'])[2]"));
		editresume.click();
		Thread.sleep(4000);
		WebElement text=driver.findElement(By.xpath("//textarea[@class='resumeHeadlineTxt materialize-textarea']"));
		text.click();
		Thread.sleep(4000);
		text.sendKeys(" ");
		Thread.sleep(4000);
	WebElement save=driver.findElement(By.xpath("(//button[@class='waves-effect waves-light btn-large blue-btn'])[4]"));
				save.click();
				Thread.sleep(4000);
		//6)click on upload resume button and send the path of pdf file		
WebElement upload=driver.findElement(By.xpath("//input[@class='fileUpload waves-effect waves-light btn-large']"));

upload.sendKeys("C:/Users/HP/Documents/Mumbai/Agale_Ankush_Software_Test_Engineer.pdf");


	}
	
}
