package workingWithWebElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingWithWebElements {
	public static void main(String [] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\inasm\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	//KeyPressExample();
	//classActivity();
	findElementsDemo();
	}
	public static void navigateExamples() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		WebElement inputBox = driver.findElement(By.name("q"));
		inputBox.sendKeys("Mosturizer", Keys.ENTER);
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void KeyPressExample() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		WebElement inputBox = driver.findElement(By.name("q"));
		inputBox.sendKeys("Coffee Mug");
		inputBox.sendKeys(Keys.ENTER);
		
		WebElement searchInputBox = driver.findElement(By.name("q"));
		searchInputBox.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		searchInputBox.sendKeys(Keys.DELETE);
		searchInputBox.sendKeys("Pretty coffee mug");
	}
	public static void classActivity() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		WebElement searchField = driver.findElement(By.name("field-keywords"));
		searchField.sendKeys("coffee mug",Keys.ENTER);
		driver.navigate().back(); 
		searchField = driver.findElement(By.name("field-keywords"));
		searchField.sendKeys("pretty coffee mugs", Keys.ENTER);
		driver.navigate().back();
		searchField = driver.findElement(By.name("field-keywords"));
		driver.navigate().forward();
		searchField = driver.findElement(By.name("field-keywords"));
		driver.navigate().refresh();

	}
	public static void  findElementsDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passWord = driver.findElement(By.id("password"));
		userName.sendKeys("standard_user");
		passWord.sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement>itemsPrice = driver.findElements(By.cssSelector(".inventory_item_price"));
		for(int i = 0; i<itemsPrice.size(); i++) {
			WebElement singleItem = itemsPrice.get(i);
		System.out.println(singleItem.getText());
	}
	}
}

