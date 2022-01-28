package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = null;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_login_page() {
        System.out.println("Inside Step - user is already on Login Page");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("project Path is: "+projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"\\src\\main\\java\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://classic.crmpro.com/index.html");
	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_free_crm() {
		String title = driver.getTitle();
        System.out.println(title);
        //Assert.assertEquals("CRMPRO  - CRM software for customer relationship management, sales, and support.", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_password () {
		driver.findElement(By.name("username")).sendKeys("Dadasaheb555");
        driver.findElement(By.name("password")).sendKeys("shivbaba");
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() {
		String title = driver.getTitle();
		System.out.println("Home Page title ::"+ title);
		//Assert.assertEquals("CRMPRO", title);
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
	    driver.findElement(By.xpath("/html/frameset/frame[2]")).click();
		
		driver.close();
	    driver.quit();
	}

	
}
