package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

public class WebDriverMethodsExample {

	public static String browser = "chrome"; // this we can configure externally
	public static WebDriver driver;

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else if (browser.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} 
		driver.get("https://www.saucedemo.com/");
		
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource()); // it will give the full html source code current page
		//System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.google.com/");
		
		//System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getWindowHandles());
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class=\"inventory_list\"]/div"));
		System.out.println(elements);
		
		//driver.switchTo().window("https://www.saucedemo.com/cart.html");
		
		//Locators start
		//driver.findElement(By.id("user-name")).sendKeys("By id Testing");
		//driver.findElement(By.className("form_input")).sendKeys("By className Testing");
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("By cssSelector Testing");
		//driver.findElement(By.name("user-name")).sendKeys("By name Testing");
		//driver.findElement(By.tagName("input")).sendKeys("By tagName Testing");
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("By xpath Testing");
		//Overview link testing using By.linkText and By.partialLinkText
		//driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
		//driver.findElement(By.linkText("Overview")).click();
		//driver.findElement(By.partialLinkText("Over")).click();
		
		//Relative Locators start
		//WebElement password = driver.findElement(By.id("password"));
		//driver.findElement(with(By.tagName("input")).above(password)).sendKeys("Testing above relative locator");
		
		//WebElement username = driver.findElement(By.id("user-name"));
		//driver.findElement(with(By.tagName("input")).below(username)).sendKeys("Testing below relative locator");
		
		//WebElement submitButton = driver.findElement(By.id("submit"));
		//driver.findElement(with(By.tagName("button")).toLeftOf(submitButton)).click();
		
		//WebElement cancelButton = driver.findElement(By.id("cancel"));
	    //driver.findElement(with(By.tagName("button")).toRightOf(cancelButton)).click();
	    
	    //WebElement emailAddressLabel = driver.findElement(By.id("lbl-email"));
	    //driver.findElement(with(By.tagName("input")).near(emailAddressLabel));
	
		//driver.close();
		//driver.quit();
	}
}
