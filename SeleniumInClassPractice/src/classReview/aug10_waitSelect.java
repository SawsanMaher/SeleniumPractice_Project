package classReview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class aug10_waitSelect {
	public static void main(String[] args) {
		testCase1();
	}
	public static void testCase1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*Test case: 1    
		Navigate to (https://www.thetestingworld.com/testings).
		Maximize the browser & declare implicitly wait for 5 second.
		Locate  "Register" webelement & varifly the element isDisplayed().
		Locate the textBox's for:  userName, email, passWord & sendKeys the values for each box.
		Locate the "Date of birth", send the date in the correct format then click "Enter" using (Keys.ENTER).
		Locate "Select Country" dropdown & use select one for each: by value/visible text/index .
		Locate the "State" dropdown, use explicit wait for 3 seconds the select state by value  
		Locate the "City" dropdown, use explicit wait for 3 seconds the select state by value 
		Locate checkbox for "terms & conditions" & "Sign up" then click on both. */ 	
		
		String URL = "https://www.thetestingworld.com/testings";
		String userN = "Sawsanmmaher";
		String userEmail = "skwndgeoing@gmail.com";
		String userPass = "qwerty";
		String userDate = "08/07/2000";
		String userPhone = "1012345678";
		String userAddress = "117 Brnondle";
		driver.get(URL);
		
		WebElement registerBtn = driver.findElement(By.xpath("//label[@for='tab1']"));
		System.out.println("The register button is displayed: " + registerBtn.isDisplayed());
		
		WebElement userName = driver.findElement(By.name("fld_username"));
		WebElement email = driver.findElement(By.name("fld_email"));
		WebElement password = driver.findElement(By.name("fld_password"));
		WebElement confirmPassword = driver.findElement(By.name("fld_cpassword"));
		WebElement phone = driver.findElement(By.cssSelector("input[name = 'phone']"));
		WebElement address = driver.findElement(By.cssSelector("input[name='address']"));
		WebElement radioAddressType = driver.findElement(By.xpath("//input[@value = 'office']"));
		
		userName.sendKeys(userN);
		email.sendKeys(userEmail);
		password.sendKeys(userPass);
		confirmPassword.sendKeys(userPass);
		phone.sendKeys(userPhone);
		address.sendKeys(userAddress);
		radioAddressType.click();
		
		WebElement dob = driver.findElement(By.id("datepicker"));
		/*dob.sendKeys(userDate);
		dob.sendKeys(Keys.ENTER);*/
		dob.sendKeys(Keys.chord(userDate, Keys.ENTER));
		
		WebElement countryDD = driver.findElement(By.id("countryId"));
		
		Select letsSelect = new Select(countryDD);
		letsSelect.selectByIndex(1);
		letsSelect.selectByValue("4");
		letsSelect.selectByVisibleText("United States");
		
		WebElement stateDD = driver.findElement(By.id("stateId"));
		WebDriverWait letsWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		letsWait.until(ExpectedConditions.elementToBeClickable(stateDD));
		Select letsSelect1 = new Select(stateDD);
		letsSelect1.selectByVisibleText("Pennsylvania");
		
		WebElement cityDD = driver.findElement(By.id("cityId"));
		letsWait.until(ExpectedConditions.elementToBeClickable(cityDD));
		Select letsSelect2 = new Select(cityDD);
		letsSelect2.selectByValue("45982");
		
		WebElement genderDD = driver.findElement(By.name("sex"));
		Select letsSelect3 = new Select(genderDD);
		letsSelect3.selectByValue("2");
		
		WebElement zipCode = driver.findElement(By.xpath("//input[@name= 'zip']"));
		zipCode.sendKeys("15905");
		
		WebElement termsAndConditions = driver.findElement(By.xpath("(//input[@type='checkbox' and @name ='terms'])[1]"));
		termsAndConditions.click();
		
		WebElement signUp = driver.findElement(By.xpath("//input[@value='Sign up']"));
		signUp.click();
		
		String expectedMessage = "User is successfully Register. Now You can Login";
		String actualMessage = driver.findElement(By.xpath("//div[contains(@class,'alert')]")).getText();
		if(expectedMessage.equals(actualMessage)) {
			System.out.println("User registered successfully. Test Pass");
		}else {
			System.out.println("User registration failed. Test Fail");
		}
	}
	
}