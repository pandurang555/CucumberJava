package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

/*public class LoginParameterSteps {

	WebDriver driver = null;
	
	@Given("^browser should open$")
	public void browser_should_open() {
		String projectPath = System.getProperty("user.dir");
		System.out.println("project Path is: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\src\\main\\java\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}

	@And("^user is on login page$")
	public void user_is_on_login_page() {
		driver.get("https://classic.crmpro.com/index.html");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
	}

	@And("^user clicks on login$")
	public void user_clicks_on_login() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() {
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
	}
}
*/
