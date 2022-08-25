package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class finalPage {

   WebDriver driver;

   By cancelBtn = By.xpath("//button[@id='cancel']");
   By finishBtn = By.xpath("//button[@id='finish']");
   By textValidation = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

  public finalPage(WebDriver driver){
    this.driver = driver;
  }

  public void clickCancelbtn(){
    driver.findElement(cancelBtn).click();
  }

  public void clickFinishbtn(){
    driver.findElement(finishBtn).click();
  }

  public void validateText(){
    WebElement e = driver.findElement(textValidation);
    String text = "THANK YOU FOR YOUR ORDER";
	
        if (e.isDisplayed()){
           System.out.println("Text: " + text + " is present. ");
        } else {
           System.out.println("Text: " + text + " is not present. ");
        }

  }

    
}
