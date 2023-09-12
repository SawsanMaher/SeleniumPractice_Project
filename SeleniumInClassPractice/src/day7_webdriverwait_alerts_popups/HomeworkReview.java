package day7_webdriverwait_alerts_popups;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeworkReview {
	public static void main(String [] args) {
homework3();
	}
		public static void homework3() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			
			 //go to amazon.com
			driver.get("https://amazon.com");
		     //verify that you are on the amazon home page. (verify with title). 
			String homeTitle = "Amazon.com. Spend less. Smile more.";
			if (driver.getTitle().equals(homeTitle)) {
				System.out.println("Title matches!, Test Pass.");
			}else {
				System.out.println("Title Doesn't match!, Test Fail.");
			}
		     //verify dropdown value is by default "All Departments"
			
			String defaultDepartment = "All Departments";
			
			     // first we need to locate the dropdown element
			WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
			
			    // we need to create an object select class
			Select letsSelect = new Select(dropdown);
			
			    if (letsSelect.getFirstSelectedOption().getText().equals(defaultDepartment)) {
					System.out.println("Default department is All Departments, Test Pass.");
				}else {
					System.out.println("Default department is NOT All Departments, Test Fail.");
				}
			
		     //select department Home & Kitchen, and search coffee mug.
			    letsSelect.selectByVisibleText("Home & Kitchen");
			    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Coffee mug", Keys.ENTER);
			    
		     //verify you are on coffee mug search results page (use title).
			    if (driver.getTitle().contains("Coffee mug")) {
					System.out.println("Title contains the coffee mug search.");
				}else {
					System.out.println("Title Doesn't contain the coffee mug search.");
				}
			    
			    Select letsSelect2 = new Select(driver.findElement(By.id("searchDropdownBox")));
			    
		     //verify you are in Home & Kitchen department.
			    if (letsSelect2.getFirstSelectedOption().getText().equals("Home & Kitchen")) {
					System.out.println("The selected department is Home & Kitchen. Test pass.");
				} else {
					System.out.println("The selected department is NOT Home & Kitchen. Test fail.");
				}
			   
	}
}