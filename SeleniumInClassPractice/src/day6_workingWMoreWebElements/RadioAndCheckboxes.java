package day6_workingWMoreWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckboxes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\inasm\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	indeedDemo();
	}
	
	public static void indeedDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://indeed.com");
		WebElement WhatSearchField = driver.findElement(By.name("q"));
		if(WhatSearchField.isDisplayed()) {
			System.out.println("The what search field is displayed!");
		}else {
			System.out.println("The what search field is NOT displayed!");
		}
		if (WhatSearchField.isEnabled()) {
			System.out.println("What Search field is enabled!");
		}else {
			System.out.println("What search field is NOT enabled!");
		}
		
		WebElement LocationSearchField = driver.findElement(By.name("l"));
		if (LocationSearchField.isDisplayed()) {
			System.out.println("Location search field is displayed!");
		}else {
			System.out.println("Location search field is NOT displayed!");
		}
		
		if (LocationSearchField.isEnabled()) {
			System.out.println("Location search field is enabled!");
		}else {
			System.out.println("Location search field is NOT enabled!");
		}
	}
	

public static void Test2() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// go to facebook
		driver.get("https://facebook.com");
		// click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		// check if the Male radio button selected or not
		WebElement maleRadio = driver.findElement(By.xpath("//label[text()='Male']"));
		if (maleRadio.isDisplayed()) {
			System.out.println("The male radio button is displayed!");
		}else {
			System.out.println("The male radio button is NOT displayed!");
		}
		
		if (maleRadio.isEnabled()) {
			System.out.println("The male radio button is enabled!");
		}else {
			System.out.println("The male radio button is NOT enabled!");
		}
		
		if(maleRadio.isSelected()) {
			System.out.println("Male radio button is already selected");
		}else {
			// if not, then select the Male radio button
			maleRadio.click();
		}
		
	}
		
	}
