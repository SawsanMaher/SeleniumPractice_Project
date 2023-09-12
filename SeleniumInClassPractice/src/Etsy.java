import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
	public static void main(String[] args) throws InterruptedException {
		//Test case:
		//Go to etsy.com
	WebDriver driver = new ChromeDriver();
	driver.get("https://etsy.com");
		//Click on Sign in.
	WebElement signinBtn = driver.findElement(
			By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']"));
	signinBtn.click();
	Thread.sleep(1000);
	    //Click on Register.
	WebElement registerBtn = 
			driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger register-header-action select-register']"));
	registerBtn.click();
	Thread.sleep(1000);
	    //Enter an email address, (jon.dow@gmail.com)
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("jon.dow@gmail.com");
		//Enter first name.
	driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("jon");
		//Enter password.
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jkhgkjdgfgsd");
		//Click on Register.
	Thread.sleep(500);
	driver.findElement(By.xpath("//button[@name='submit_attempt']")).click();
	Thread.sleep(3000);
		//Verify you get the error message:
		//"Sorry, the email you have entered is already in use."
	
	String errorMessage = driver.findElement(By.xpath("//div[@id='aria-join_neu_email_field-error']")).getText();
	System.out.println(errorMessage);
	if (errorMessage.equals("Sorry, the email you have entered is already in use.")) {
		System.out.println("Test pass");
	}else {
		System.out.println("Test fail");
	}
	}
}