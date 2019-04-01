

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {
	WebDriver driver;
	@Given("The URL of the login page")
	public void the_URL_of_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\1\\Balamurugan\\FY18\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
	}

	@When("user enters {word} as username")
	public void user_enters_Lalitha_as_username(String username) {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
}

	@When("user enters {word} as password")
	public void user_enters_Password_as_password(String passsword) {
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		
	}

	@Then("user is success")
	public void user_is_success() {
		driver.findElement(By.id("Login")).click();	
		System.out.println("Login Successful");
		
	  	}

	
}
