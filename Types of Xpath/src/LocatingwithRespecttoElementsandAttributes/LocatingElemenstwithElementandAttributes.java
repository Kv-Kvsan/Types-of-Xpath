package LocatingwithRespecttoElementsandAttributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatingElemenstwithElementandAttributes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeoptions=new ChromeOptions();
		chromeoptions.addArguments("Start-maximized");
		ChromeDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		//LocatingElemenstwithElementandAttributes
		WebElement username=driver.findElementByXPath("//input[@id='txtUsername']");
		username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement pwd=driver.findElementByXPath("//input[@id='txtPassword']");
		pwd.sendKeys("admin123");
		
		Thread.sleep(2000);
		driver.close();
	}
}