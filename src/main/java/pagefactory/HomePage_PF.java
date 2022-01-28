package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	@FindBy(id="logout")
	WebElement btn_logout;
	
    WebDriver driver;
	
    public HomePage_PF(WebDriver driver){// 4.Create constructor to get driver instance 
		this.driver = driver;//--- initialize Elements using method initElements
		PageFactory.initElements(driver, this);
    }
	
	public boolean checkLogoutIsDisplayed() {
		return btn_logout.isDisplayed();
		
	}

}
