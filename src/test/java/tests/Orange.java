package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {

	public static void main(String[] args) {
		//test case #1
//		summary: title verification for OrangeHRM app
//		steps:
//		1. go to opensource.demo.orangehrmlive.com
//		expected: OrangeHRM
		WebDriverManager.chromedriver().setup();

		WebDriver or = new ChromeDriver();
		String expectedTitle = "OrangeHRM";
		or.get("http://opensource.demo.orangehrmlive.com/");
		if(or.getTitle().equals(expectedTitle)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
//Test case #2
//1. pass admin to user name and pass admin to password verify login succes
		WebElement username = or.findElement(By.id("txtUsername"));
		WebElement password = or.findElement(By.id("txtPassword"));
		WebElement loginbtn = or.findElement(By.id("btnLogin"));
		//username.sendKeys("Admin");
		//password.sendKeys("admin");
		//loginbtn.click();
		
		or.findElement(By.cssSelector("LinkedIn OrangeHRM group"));
		
		String expectedUrl = "http://opensource.demo.orangehrmlive.com/index.php/dashboard";
		if(or.getCurrentUrl().equals(expectedUrl)) {
			System.out.println("pass");
		}else {
			System.out.println("failed");
		}
	}
}
