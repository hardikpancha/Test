package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelSearchLogin {

	WebDriver driver;

	@Given("^the user has navigated to the login page$")
	public void the_user_has_navigated_to_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "/Users//SUMUKH/eclipse-workspace/Harry/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net");

	}

	@When("^they provide username and password$")
	public void enter_login_credential(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.linkText("MY ACCOUNT")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));

	}

	@Then("^the user is logged in$")
	public void the_user_is_logged_in() throws Throwable {
		WebElement loginBtn = driver.findElement(
				By.xpath("//button[@type='submit' and @class = 'btn btn-action btn-lg btn-block loginbtn']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

	}

	@Then("^they will be directed to their account page$")
	public void they_will_be_directed_to_their_account_page() {
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("Home page title is " + title);
		Assert.assertEquals("Login", title);

	}

	@Given("^user has to be on login page$")
	public void user_has_to_be_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "/Users//SUMUKH/eclipse-workspace/Harry/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net");
	}

	@When("^they enter username and password$")
	public void they_enter_username_and_password(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.linkText("MY ACCOUNT")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));

	}

	@Then("^an error will be provided stating Invalid Email or Password$")
	public void an_error_will_be_provided_stating() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit' and @class = 'btn btn-action btn-lg btn-block loginbtn']"))
				.click();
		Thread.sleep(3000);

		String error_msg = driver.findElement(By.xpath("//*[@class='alert alert-danger']")).getText();

		System.out.println(error_msg);

	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();

	}

}
