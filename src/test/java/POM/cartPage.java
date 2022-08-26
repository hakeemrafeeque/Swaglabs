package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartPage {

    WebDriver driver;

    By continueShopping = By.xpath("//button[@id='continue-shopping']");
    By removeButton = By.xpath("//button[text()='Remove']");
    By checkOut = By.xpath("//button[@id='checkout']");

    public cartPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickContinue(){
        driver.findElement(continueShopping).click();
    }

    public void clickRemove(){
        driver.findElement(removeButton).click();
    }

    public void clickCheckout(){
        driver.findElement(checkOut).click();
    }
}