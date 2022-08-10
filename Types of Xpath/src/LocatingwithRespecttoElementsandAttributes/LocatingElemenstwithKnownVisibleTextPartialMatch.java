package LocatingwithRespecttoElementsandAttributes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatingElemenstwithKnownVisibleTextPartialMatch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeoptions=new ChromeOptions();
		chromeoptions.addArguments("Start-maximized");
		ChromeDriver driver=new ChromeDriver(chromeoptions);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		//LocatingElemenstwithKnownVisibleText-Partial Match
		WebElement visibletext=driver.findElementByXPath("//a[contains(text(), 'Forgot')]");
		visibletext.click();
		
		Thread.sleep(2000);
		driver.close();

	}

}
