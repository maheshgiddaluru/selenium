package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownExample {

	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
		    driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		    driver.manage().window().maximize();
		    
		    WebElement langDropdown =driver.findElement(By.id("dropdowm-menu-1"));
		    Select langSelect = new Select(langDropdown);
		    langSelect.selectByIndex(2);
		    
		    WebElement ideDropdown =driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]"));
		    Select ideSelect = new Select(ideDropdown);
		    ideSelect.selectByValue("maven");
		    
		    WebElement webDropdown =driver.findElement(By.id("dropdowm-menu-3"));
		    Select webSelect = new Select(webDropdown);
		    webSelect.selectByVisibleText("JQuery");
		    
		    WebElement dropdown =driver.findElement(By.id("dropdowm-menu-1"));
		    
		    Select s = new Select(dropdown);
		    s.selectByIndex(2);
		    List<WebElement> all = s.getAllSelectedOptions();
		    System.out.println(all.size());
		 
		    s.selectByIndex(1);
		    System.out.println(s.getFirstSelectedOption().getText());
		    
	}
}
