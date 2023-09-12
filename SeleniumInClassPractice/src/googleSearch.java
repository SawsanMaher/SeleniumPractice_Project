    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
  public class googleSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\inasm\\OneDrive\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com");
			
			//find and store search box
			WebElement searchBox = driver.findElement(By.id("gh-ac"));
			searchBox.sendKeys("coffee mug");
			
			//find, store and click on search button
			WebElement searchButton = driver.findElement(By.id("gh-btn"));
			searchButton.click();
			
			driver.get("https://amazon.com");
			
		}
	}
