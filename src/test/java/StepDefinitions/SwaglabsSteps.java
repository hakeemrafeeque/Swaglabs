package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

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
	  	
	  	private String URL = "https://www.saucedemo.com/";
	   

	   @SuppressWarnings("deprecation")
	   @Given("Launch browser (.*)$")
	   public void launchBrowser(String browser) {
		   
		
		   
		   String projectPath = System.getProperty("user.dir");
		   

	      if (browser.equalsIgnoreCase("firefox")) {
	    	 
	    	  System.setProperty("webdriver.gecko.driver", projectPath + "/src/test/resources/driver/geckodriver.exe");
	         driver = new FirefoxDriver();  
	         
	      } else if (browser.equalsIgnoreCase("chrome")) {
	         
	    	  System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/driver/chromedriver.exe");
	         driver = new ChromeDriver();	
	         
	      } else if (browser.equalsIgnoreCase("ie")) {
	         
	    	  System.setProperty("webdriver.ie.driver", projectPath + "/src/test/resources/driver/IEDriverServer.exe");
	         driver = new InternetExplorerDriver();
	         
	      } else if (browser.equalsIgnoreCase("edge")) {
	    	  
	    	  System.setProperty("webdriver.edge.driver", projectPath + "/src/test/resources/driver/msedgedriver.exe");
	    	  driver = new EdgeDriver();
	      } else if (browser.equalsIgnoreCase("opera")) {
	    	  
			  System.setProperty("webdriver.opera.driver", projectPath + "/src/test/resources/driver/operadriver.exe");
			  driver = new OperaDriver();
		  } else {
	         
	    	  throw new IllegalArgumentException("The Browser Type is Undefined");
	      }
	      
	      driver.get(URL);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	      driver.manage().window().maximize();
	   }
	   

	@Then("Enter uname (.*)$")
	public void enter_username(String username) throws InterruptedException {
	   login = new loginPage(driver);
	   login.enterUsername(username);
	   Thread.sleep(2000);
	}
	@Then("Enter pword (.*)$")
	public void enter_password(String password) throws InterruptedException{
	  	login.enterPassword(password);
		  Thread.sleep(2000);
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
	public void click_on_cart_to_open() throws InterruptedException{
	    product.clickCart();
		Thread.sleep(2000);
	}
	@Then("Click checkout")
	public void click_checkout() throws InterruptedException{
	    cart = new cartPage(driver);
		cart.clickCheckout();
		Thread.sleep(2000);
	}
	@Then("Enter fname")
	public void enter_firstname() throws InterruptedException{
	    checkout = new checkoutPage(driver);
		checkout.enterFirstname();
		Thread.sleep(2000);
	}
	@Then("Enter lname")
	public void enter_lastname() throws InterruptedException{
	    checkout.enterLastname();
		Thread.sleep(2000);
	}
	@Then("Enter zcode")
	public void enter_zipcode() throws InterruptedException{
	    checkout.enterZipcode();
		Thread.sleep(2000);
	}
	@Then("Click on continue")
	public void click_on_continue() throws InterruptedException{
	    checkout.clickContinue();
		Thread.sleep(2000);
	}
	@Then("Click on finish")
	public void click_on_finish() throws InterruptedException{
	    last = new finalPage(driver);
		last.clickFinishbtn();
		Thread.sleep(2000);
	}
	@Then("Validate the text")
	public void validate_the_text() {
	    last.validateText();
		driver.close();
		//driver.quit();
	}




}
