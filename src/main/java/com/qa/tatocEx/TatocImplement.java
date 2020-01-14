package com.qa.tatocEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TatocImplement {
	public WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\arunsinghchauhan\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.0.1.86/tatoc");
	}
	// clicking on Basic Course

	public String basicCourse() throws InterruptedException {
		driver.findElement(By.partialLinkText("Basic")).click();
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();

		return url;

	}

	public String ClickOnGreenBox() {
		// Click on Green box to proceed to next page
		driver.findElement(By.xpath("//div[@class='greenbox']")).click();
		String s = driver.getCurrentUrl();
		return s;

	}

	// Clicking on 'Repaint Box 2' link

	/*
	 * driver.switchTo().frame("main");
	 * 
	 * driver.findElement(By.xpath("//a[contains(text(),'Repaint Box 2')]")).click()
	 * ;
	 * 
	 * String colorbox1=
	 * driver.findElement(By.xpath("//div[@id='answer']")).getAttribute("class");
	 * System.out.println(colorbox1);
	 * 
	 * driver.switchTo().defaultContent(); driver.switchTo().frame("child"); String
	 * colorbox2=
	 * driver.findElement(By.xpath("//div[@id='answer']")).getAttribute("class");
	 * System.out.println(colorbox2);
	 */
}
