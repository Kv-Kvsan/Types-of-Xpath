package LocatingwithRespecttoElementsandAttributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatingElemenstwithKnownVisibleText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeoptions=new ChromeOptions();
		chromeoptions.addArguments("Start-maximized");
		ChromeDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		//LocatingElemenstwithKnownVisibleText-Exact Match
		WebElement visibletext=driver.findElementByXPath("//a[text()='Forgot your password?']");
		visibletext.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
