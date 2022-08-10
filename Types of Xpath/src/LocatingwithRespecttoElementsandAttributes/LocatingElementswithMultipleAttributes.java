package LocatingwithRespecttoElementsandAttributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatingElementswithMultipleAttributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeoptions=new ChromeOptions();
		chromeoptions.addArguments("Start-maximized");
		ChromeDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		WebElement Username=driver.findElementByXPath("//input[@name='txtUsername'] [@id='txtUsername']");
		Username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement pwd=driver.findElementByXPath("//input[@name='txtPassword'] [@id='txtPassword']");
		pwd.sendKeys("admin123");
	
		Thread.sleep(3000);
		driver.close();
	}
}