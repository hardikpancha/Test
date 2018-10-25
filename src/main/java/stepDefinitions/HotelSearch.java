package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelSearch {

	private WebDriver driver;
	private WebDriverWait wait;
	
	@Before
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/SUMUKH/eclipse-workspace/Harry/chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 50);
		driver.get("http://www.phptravels.net/");

		driver.findElement(By.linkText("MY ACCOUNT")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		driver.findElement(By.xpath("//button[@type='submit' and @class = 'btn btn-action btn-lg btn-block loginbtn']")).click();
		
	}
	@After
	public void close_the_browser() {
		
		driver.quit();
	}

	@Given("^the user has clicked Home to access the search page$")
	public void the_user_has_clicked_Home_to_access_the_search_page() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "/Users/SUMUKH/eclipse-workspace/Harry/chromedriver");
//		driver = new ChromeDriver();
//		wait = new WebDriverWait(driver, 50);
//		driver.get("http://www.phptravels.net/");
//
//		driver.findElement(By.linkText("MY ACCOUNT")).click();
//		driver.findElement(By.linkText("Login")).click();
//		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//
//		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
//		driver.findElement(By.name("password")).sendKeys("demouser");
//		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[1]/div[5]/button")).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//ul[contains(@class,'navbar-nav')]//li[@class='active go-right']/a")));
		driver.findElement(By.xpath("//ul[contains(@class,'navbar-nav')]//li[@class='active go-right']/a")).click();
	}

	@Given("^they have chosen the Hotels option$")
	public void they_have_chosen_the_Hotels_option() {
		wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//ul[contains(@class,'nav navbar-nav go-right')]//li[@class='active go-right']/a")));
		driver.findElement(By.xpath("//ul[contains(@class,'nav navbar-nav go-right')]//li[@class='active go-right']/a"))
				.click();
	}

	@And("^they have chosen a hotel for \"(.*)\"$")
	public void they_have_chosen_a_hotel_for_montreal(String city) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//form[@name='fCustomHotelSearch']//div[contains(@class,'hotelsearch')]")));
		driver.findElement(By.xpath("//form[@name='fCustomHotelSearch']//div[contains(@class,'hotelsearch')]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'select2-drop-active')]//input")).sendKeys(city);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//ul[@class='select2-results']//li[contains(@class,'select2-result-selectable')]/div")));
		driver.findElement(
				By.xpath("//ul[@class='select2-results']//li[contains(@class,'select2-result-selectable')]/div"))
				.click();
	}

	@And("^they have chosen with dates \"(.*)\" to \"(.*)\"$")
	public void they_have_chosen_with_dates_to(String checkin, String checkout) {

		driver.findElement(By.xpath("//*[@id='dpd1']")).click();
		driver.findElement(By.xpath("//*[@id='dpd1']/div/input")).sendKeys(checkin);
		driver.findElement(By.xpath("//*[@id='dpd2']/div/input")).sendKeys(checkout);
	}

	@And("^they have selected number of (\\d+) and (\\d+)$")
	public void they_have_selected(int adults, int children) {

		driver.findElement(By.xpath("//div[@class='bgfade col-md-2 form-group go-right col-xs-12']")).click();
		driver.findElement(By.xpath("//input[@id='travellersInput' and @name='travellers']")).clear();
		driver.findElement(By.xpath("//input[@name='adults' and @id='adultInput']")).clear();
		driver.findElement(By.xpath("//input[@name='adults' and @id='adultInput']")).sendKeys(String.valueOf(adults));
		driver.findElement(By.xpath("//input[@name='child' and @id='childInput']")).clear();
		driver.findElement(By.xpath("//input[@name='child' and @id='childInput']")).sendKeys(String.valueOf(children));
	}

	@When("^they click search$")
	public void they_click_search() {
		driver.findElement(By.xpath("//*[@id=\"HOTELS\"]/form/div[5]/button")).click();
	}

	@Then("^matching results are displayed$")
	public void matching_results_are_displayed() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='itemscontainer']//h2[@class='text-center']")));
		WebElement result = driver.findElement(By.xpath("//div[@class='itemscontainer']//h2[@class='text-center']"));
		System.out.println(result);

	}

}
