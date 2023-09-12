import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookTestCase {
	public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\inasm\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

					
				WebDriver driver = new ChromeDriver();
				/*driver.get("https://facebook.com");
					
					//find the email and phone number field
					WebElement emailPhone = driver.findElement(By.id("email"));
					emailPhone.sendKeys("automation");
					
					WebElement password = driver.findElement(By.id("pass"));
					password.sendKeys("automation");
					
					WebElement login = driver.findElement(By.name("login"));
					login.click(); */
					
					driver.get("https://facebook.com");
					
					String webTitle = driver.getTitle();
					System.out.println("Title is: " + webTitle);
					
					WebElement createAccount = driver.findElement(By.linkText("Create new account"));
					createAccount.click();
					Thread.sleep(1000);
					
					WebElement firstName = driver.findElement(By.name("firstname"));
					firstName.sendKeys("automation");
					
					WebElement lastName = driver.findElement(By.name("lastname"));
					lastName.sendKeys("automation");
					
					WebElement email = driver.findElement(By.name("reg_email__"));
					email.sendKeys("automation");
					
					WebElement passWord = driver.findElement(By.name("reg_passwd__"));
					passWord.sendKeys("automation");
										
					WebElement signUp = driver.findElement(By.name("websubmit"));
					signUp.click();
					
					System.out.println("Current URL is: "  + driver.getCurrentUrl());
					
					WebElement nonUserNoticeLink = driver.findElement(By.id("non-users-notice-link"));
					String noticeLinkText = nonUserNoticeLink.getText();
					System.out.println(noticeLinkText);
	
	
					//closes the current browser
					driver.close();
					
					driver.quit();													
					
	}
}