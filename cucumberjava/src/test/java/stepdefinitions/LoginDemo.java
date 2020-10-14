package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemo {
 
	WebDriver driver=null;
			
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step-browser is open");
		  
		  //String projectPath= System.getProperty("user.dir");
		  //System.out.println("Projectpath is :"+projectPath);
		  System.setProperty("webdriver.gecko.driver","C:\\DRIVER\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();	
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		  
	}
	
	@And("user is on login page")
public void user_is_on_login_page() {
		System.out.println("Inside step-user is on login page");
		driver.navigate().to("https://example.testproject.io/web/");
	}
	@When("user enters username and password")
	public void uiser_enters_username_and_password() {
	    System.out.println("Iside step-user enters username and password");
	    driver.findElement(By.id("name")).sendKeys("Priyanka");
	    driver.findElement(By.id("password")).sendKeys("Testing@2512");
	}
	@And("user click on login")
	public void user_click_on_login() {
		System.out.println("Iside step-user clicks on login");
	    driver.findElement(By.id("login")).click();
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
	    
	}



}
