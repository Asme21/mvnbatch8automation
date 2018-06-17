package tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementTest {
	public static void main(String[] args) {
		//utils.Environment.setup();
		//System.setProperty("webdriver.chrome.driver", "/Users/asme/Documents/selenium dependencies/drivers");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().fullscreen();
		
		List<WebElement> notHiddenInputs = new ArrayList<WebElement>();
		List<WebElement> inputs = driver.findElements(By.xpath("//input"));
		System.out.println("Size"+inputs.size());
		
		for(WebElement w: inputs) {
		String value = w.getAttribute("type");
		System.out.println(value);
		
		if(!value.equals("hidden")) {
			notHiddenInputs.add(w);
		}
			
		}
		System.out.println("size not hidden: "+notHiddenInputs.size());
		notHiddenInputs.get(0).sendKeys("Admin");
		notHiddenInputs.get(1).sendKeys("admin");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("link size: "+links.size());
		
		for(WebElement link: links) {
			link.click();
		}
	}
	
}

