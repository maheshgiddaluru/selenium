package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethodsExample {

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
		driver.get("https://qa.nutritionportal.dsm.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"requestAccessLinkSet\"]/button")).click();
		driver.findElement(By.name("firstName")).sendKeys("Test User");
		System.out.println(driver.findElement(By.name("firstName")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"requestAccess\"]/div[2]/div[14]/button")).getCssValue("height"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"requestAccess\"]/div[2]/div[14]/button")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"requestAccess\"]/div[2]/div[14]/button")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"requestAccess\"]/div[2]/div[14]/button")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"requestAccess\"]/div[2]/div[14]/button")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"requestAccess\"]/div[2]/div[14]/button")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"requestAccess\"]/div[2]/div[14]/button")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"requestAccess\"]/div[2]/div[14]/button")).isSelected());
		
		//driver.findElement(By.name("firstName")).clear();		
	}

}
