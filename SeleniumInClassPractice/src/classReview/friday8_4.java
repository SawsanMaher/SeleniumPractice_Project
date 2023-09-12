package classReview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class friday8_4 {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\inasm\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		friday8_4 case1 = new friday8_4();
		//case1.testCase1();
		case1.testCase2();
		
	}
	
	/*public void testCase1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		String URL = "https://www.automationtesting.co.uk";
		driver.get(URL);
		driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
		
		WebElement toggle = driver.findElement(By.className("toggle"));
		toggle.click();
		Thread.sleep(1000);
		
		WebElement testStoreBtn = driver.findElement(By.xpath("//a[contains(text(),'Test Store')]"));
		testStoreBtn.click();
		
		WebElement searchTextBox = driver.findElement(By.name("s"));
		searchTextBox.sendKeys("Mug");
		searchTextBox.sendKeys(Keys.ENTER);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();
		
	}*/
	
	public void testCase2() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String URL = "https://www.automationtesting.co.uk";
		driver.get(URL);
		driver.findElement(By.cssSelector(".close-cookie-warning > span")).click();
		
		WebElement toggle = driver.findElement(By.className("toggle"));
		toggle.click();
		Thread.sleep(1000);
		
		WebElement testStoreBtn = driver.findElement(By.xpath("//a[contains(text(),'Test Store')]"));
		testStoreBtn.click();
		
		WebElement signInBtn = driver.findElement(By.xpath("//*[contains(text(), 'Sign in')]"));
		signInBtn.click();
		Thread.sleep(2000);
		
		WebElement createAccountBtn = driver.findElement(By.xpath("//*[@data-link-action= 'display-register-form']"));
		createAccountBtn.click();
		Thread.sleep(2000);
		
		WebElement createAnAccount = driver.findElement(By.className("page-header"));
		System.out.println("Create Account Button is displayed: " + createAnAccount.isDisplayed());
		
		WebElement genderMaleBtn = driver.findElement(By.xpath("(//input[@name='id_gender'])[1]"));
		
		WebElement genderFmaleBtn = driver.findElement(By.xpath("(//input[@name='id_gender'])[1]"));
		
		WebElement checkBox1 = driver.findElement(By.xpath("//*[@name='optin']"));
		WebElement checkBox2 = driver.findElement(By.xpath("//*[@name='newsletter']"));
		WebElement checkBox3 = driver.findElement(By.xpath("//*[@name='psgdpr']"));
		
		if(genderMaleBtn.isSelected()) {
			System.out.println("This Button is selected");
		}else {
			genderMaleBtn.click();
		}
		if(genderFmaleBtn.isSelected()) {
			System.out.println("This Button is selected");
		}else {
			genderFmaleBtn.click();
		}
		if(checkBox1.isSelected() || checkBox2.isSelected() || checkBox3.isSelected()) {
			System.out.println("This CheckBox is Selected");
		}else {
			checkBox1.click();	checkBox2.click(); checkBox3.click();	}
		
	}
	
}