package LocatingwithRespecttoElementsandAttributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatingElementsusingStartswith {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions chromeoptions=new ChromeOptions();
		chromeoptions.addArguments("Start-maximized");
		ChromeDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		WebElement Username=driver.findElementByXPath("//input[starts-with(@id, 'txtUser')]");
		Username.sendKeys("Admin");
		Thread.sleep(2000);
		
		WebElement pwd=driver.findElementByXPath("//input[starts-with(@id, 'txtPass')]");
		pwd.sendKeys("admin123");
	
		Thread.sleep(3000);
		driver.close();
	}
}