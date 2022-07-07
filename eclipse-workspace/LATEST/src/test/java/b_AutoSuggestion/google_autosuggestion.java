package b_AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//public class google_autosuggestion {
//	@Test
//	public void test() throws Exception {
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		
//		WebElement Search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//		Search.sendKeys("AB De villiers");
//		Thread.sleep(3000);
//		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
//		
//		for(int i=0;i<list.size();i++) {
//			
//		String a=list.get(i).getText();
//		
//		
//		System.out.println(a);
//		}
//		
//		//Open Browser ---Chrome
//		WebDriverManager.chromedriver().setup();
//		//WebDriver driver=new ChromeDriver();
//		
//		//Open Url --->https://www.google.com/
//		driver.get("https://www.google.co.in/");
//		driver.manage().window().maximize();
//		
//		//send Values to searchBar ----> Maven
//		WebElement searchBar=driver.findElement(By.xpath("//input[@name='q']"));
//		searchBar.sendKeys("Rohit sharma");
//		Thread.sleep(3000);
//		
//		//verify the auto suggestion list
//		//List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
//		Thread.sleep(3000);
//		System.out.println(list.size());
//		System.out.println(list.get(2).getText());
//		
//		// click on option Maven dependancy
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i).getText());
//			
//		
//		if(list.get(i).getText().equals("rohit sharma age")) {
//			
//				list.get(i).click();
//	}
//
//}
