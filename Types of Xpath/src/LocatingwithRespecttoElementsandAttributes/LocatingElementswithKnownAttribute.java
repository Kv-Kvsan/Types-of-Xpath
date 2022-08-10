package LocatingwithRespecttoElementsandAttributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatingElementswithKnownAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeoptions=new ChromeOptions();
		chromeoptions.addArguments("Start-maximized");
		ChromeDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		//LocatingElementswithKnownAttribute-Let's assume we are not considering the element
		WebElement username=driver.findElementByXPath("//*[@id='txtUsername']");
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement pwd=driver.findElementByXPath("//*[@id='txtPassword']");
		pwd.sendKeys("admin123");
		
		Thread.sleep(2000);
		driver.close();		 
	}

}
