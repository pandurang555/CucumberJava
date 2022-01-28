package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

	WebDriver driver;
	
	By txt_username = By.name("username");
	By txt_password = By.name("password");
	By btn_login = By.xpath("//input[@type='submit']");
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void click_login() {
		
		driver.findElement(btn_login).click();
	}
	
	public void loginValidUser(String username, String password) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
}
