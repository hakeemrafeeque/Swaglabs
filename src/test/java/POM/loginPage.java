package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    WebDriver driver;
    
    By userName     = By.xpath("//input[@id='user-name']");
    By passWord     = By.xpath("//input[@id='password']");
    By loginButton  = By.xpath("//input[@id='login-button']");

    public loginPage(WebDriver driver) {

        this.driver = driver;

    }

    public void enterUsername(String username){
        driver.findElement(userName).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(passWord).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }
}
