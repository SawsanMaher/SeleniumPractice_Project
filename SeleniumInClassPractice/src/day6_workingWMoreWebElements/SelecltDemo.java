package day6_workingWMoreWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelecltDemo {
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\inasm\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		alert_testcase3();	
	}
	
	public static void alert_testcase3() {
		//Test case 3
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//go to http://practice.primetech-apps.com/practice/alerts 
		driver.get("http://practice.primetech-apps.com/practice/alerts");
		
		//Click on the 'Prompt Alert' button and type PrimeTech
		String input = "Helil";
		driver.findElement(By.id("prompt")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert handle = driver.switchTo().alert();
		handle.sendKeys(input);
		
		//Then accept the Alert. Verify that a greeting message displays as
		//"Hello <your input>! How are you today?".
		
		handle.accept();
		
		//wait the message visibility
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo")));
		String actualMessage = driver.findElement(By.id("demo")).getText();
		
		String expectedMessage = "Hello "+ input +"! How are you today?";
		
		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Greeting match, Test Pass.");
		}else {
			System.out.println("Greeting does not match, Test Fail.");
		}
	}
}