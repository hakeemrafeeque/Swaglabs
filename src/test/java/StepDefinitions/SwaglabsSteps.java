package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.cartPage;
import POM.checkoutPage;
import POM.finalPage;
import POM.loginPage;
import POM.productPage;
import io.cucumber.java.en.*;

public class SwaglabsSteps {

	WebDriver driver = null;
	loginPage login;
	productPage product;
	cartPage cart;
	checkoutPage checkout;
	finalPage last;
	
	@SuppressWarnings("deprecation")
	@Given("Open the browser")
	public void open_the_browser() {
		
		String projectPath = System.getProperty("user.dir");

		System.out.println(projectPath);
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

	}
	@Given("Open the shopping site")
	public void open_the_shopping_site() {
	    
		driver.navigate().to("https://www.saucedemo.com/");
	}
	@Then("Enter uname (.*)$")
	public void enter_username(String username) throws InterruptedException {
	   login = new loginPage(driver);
	   login.enterUsername(username);
	   //Thread.sleep(2000);
	}
	@Then("Enter pword (.*)$")
	public void enter_password(String password) {
	  	login.enterPassword(password);
	}
	@Then("Click login button")
	public void click_login_button() throws InterruptedException {
	  	login.clickLoginButton();
		Thread.sleep(2000);
	}
	@Then("Add a product to cart")
	public void add_a_product_to_cart() throws InterruptedException {
	    product = new productPage(driver);
		product.chooseAnyProduct();
		Thread.sleep(2000);
	}
	@Then("Click on cart to open")
	public void click_on_cart_to_open() {
	    product.clickCart();
	}
	@Then("Click checkout")
	public void click_checkout() {
	    cart = new cartPage(driver);
		cart.clickCheckout();
	}
	@Then("Enter fname (.*)$")
	public void enter_firstname(String firstname) {
	    checkout = new checkoutPage(driver);
		checkout.enterFirstname(firstname);
	}
	@Then("Enter lname (.*)$")
	public void enter_lastname(String lastname) {
	    checkout.enterLastname(lastname);
	}
	@Then("Enter zcode (.*)$")
	public void enter_zipcode(String zipcode) {
	    checkout.enterZipcode(zipcode);
	}
	@Then("Click on continue")
	public void click_on_continue() {
	    checkout.clickContinue();
	}
	@Then("Click on finish")
	public void click_on_finish() {
	    last = new finalPage(driver);
		last.clickFinishbtn();
	}
	@Then("Validate the text")
	public void validate_the_text() {
	    last.validateText();
		driver.close();
	}




}
