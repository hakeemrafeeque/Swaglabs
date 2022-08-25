package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public void enterFirstname(String firstname){
        driver.findElement(firstName).sendKeys(firstname);
    }

    public void enterLastname(String lastname){
        driver.findElement(lastName).sendKeys(lastname);
    }

    public void enterZipcode(String zipcode){
        driver.findElement(zipCode).sendKeys(zipcode);
    }

    public void clickContinue(){
        driver.findElement(continuePage).click();;
    }

    public void clickCancel(){
        driver.findElement(cancel).click();;
    }
    
}
