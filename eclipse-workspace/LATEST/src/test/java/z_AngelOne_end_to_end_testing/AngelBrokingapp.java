package z_AngelOne_end_to_end_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AngelBrokingapp {
	pass_id t=new pass_id();
	
	@Test
	public void test() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://trade.angelbroking.com/Login");
		driver.manage().window().maximize();
		String a=t.getPassword();
		String b=t.getId();
		WebElement loginid=driver.findElement(By.xpath("//input[@id='txtUserID']"));
		loginid.sendKeys(b);
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.xpath("//input[@id='txtTradingPassword']"));
		pass.sendKeys(a);
		Thread.sleep(2000);
		WebElement loginbtn=driver.findElement(By.xpath("//a[@id='loginBtn']"));
		loginbtn.click();
		Thread.sleep(4000);
		
		WebElement cancel=driver.findElement(By.xpath("(//button[@class='close icon-cancel'])[6]"));
		cancel.click();
		Thread.sleep(6000);
		
		//1)click on dashboard
		
		WebElement dashboard=driver.findElement(By.xpath("//a[@id='mnDashboard']"));
		dashboard.click();
		Thread.sleep(6000);
		//2)Click on Markets 
		WebElement Markets=driver.findElement(By.xpath("//a[@id='mnMarkets']"));
		Markets.click();
		
		Thread.sleep(6000);
		//3)click on Orders
		try {
		WebElement orders=driver.findElement(By.xpath("//a[text()='Orders']"));
		dashboard.click();
		}
		catch(Exception e) {System.out.println(e);}
		Thread.sleep(6000);
		//4)Click on Advisory  
		WebElement Advisory=driver.findElement(By.xpath("//a[@id='mnAdvisory']"));
		Advisory.click();
		Thread.sleep(6000);
		//5)click on Report
		
		WebElement Report=driver.findElement(By.xpath("//a[@id='mnReports']"));
		Report.click();
		Thread.sleep(6000);
		//6)Click on Funds 
		WebElement Funds=driver.findElement(By.xpath("//a[@id='mnFunds']"));
		Funds.click();
		Thread.sleep(6000);
		//7)click on More
		
		WebElement More=driver.findElement(By.xpath("//a[@id='mnMore']"));
		More.click();
		
		Thread.sleep(6000);
		//8)click on Portfolioo
		
		WebElement portfolio=driver.findElement(By.xpath("//a[@id='mnPort']"));
		portfolio.click();
	
		//9)
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[10]")).click();
		
		
//		
Thread.sleep(2000);
	//WebElement logout=driver.findElement(By.xpath("//a[@onclick='SignOut()']"));
	//logout.click();
//		Thread.sleep(2000);
		
		}
	@Test(enabled=false)
	public void test1() throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://trade.angelbroking.com/Login");
		driver.manage().window().maximize();
		WebElement loginid=driver.findElement(By.xpath("//input[@id='txtUserID']"));
		loginid.sendKeys("A851899");
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.xpath("//input[@id='txtTradingPassword']"));
		pass.sendKeys("Ankush@1");
		Thread.sleep(2000);
		WebElement loginbtn=driver.findElement(By.xpath("//a[@id='loginBtn']"));
		loginbtn.click();
		Thread.sleep(2000);
		
		
				WebElement toggle=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[10]"));
				toggle.click();
				Thread.sleep(2000);
				WebElement logout=driver.findElement(By.xpath("(//a[text()='Logout']"));
				logout.click();
				Thread.sleep(2000);
		}


}
