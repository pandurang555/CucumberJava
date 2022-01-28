package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF { // 1.create class for each page
	//2. Create locators of all objects to be used in that page using @FindBy
	
	
	@FindBy(id="name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="login")
	WebElement btn_login;
	
	WebDriver driver;
	
    public LoginPage_PF(WebDriver driver){// 4.Create constructor to get driver instance 
		this.driver = driver;//--- initialize Elements using method initElements
		PageFactory.initElements(driver, this);
		
	}
	//3. Crate methods or actions to be performed on the objects
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);	
	}
	
    public void enterPassword(String password) {
		txt_password.sendKeys(password);	
	}
    
    public void clickOnLogin() {
    	btn_login.click();
    }
	
	
	
	
	
	
	

}
