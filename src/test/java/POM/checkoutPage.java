package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;

public class checkoutPage {

    WebDriver driver;

    By firstName = By.xpath("//input[@id='first-name']");
    By lastName = By.xpath("//input[@id='last-name']");
    By zipCode = By.xpath("//input[@id='postal-code']");
    By continuePage = By.xpath("//input[@id='continue']");
    By cancel = By.xpath("//button[@id='cancel']");

    public checkoutPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterFirstname(){

        Faker faker = new Faker();
        String fname = faker.name().firstName();
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastname(){

        Faker faker = new Faker();
        String lname = faker.name().lastName();
        driver.findElement(lastName).sendKeys(lname);
    }

    public void enterZipcode(){

        Faker faker = new Faker();
        String zcode = faker.number().digits(6);
        driver.findElement(zipCode).sendKeys(zcode);
    }

    public void clickContinue(){
        driver.findElement(continuePage).click();;
    }

    public void clickCancel(){
        driver.findElement(cancel).click();;
    }
    
}
