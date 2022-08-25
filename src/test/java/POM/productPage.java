package POM;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productPage {

    WebDriver driver;

    By bagPack = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By bikeLight = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
    By boltTshirt = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    By fleeceJacket = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
    By oneSie = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
    By redTshirt = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
    By dynamicProduct = By.xpath("//button[text()='Add to cart']");
    By openCart = By.xpath("//a[@class='shopping_cart_link']");

    public productPage(WebDriver driver){

        this.driver = driver;
    }

    public void chooseBagpack(){
        driver.findElement(bagPack).click();
    }

    public void chooseBikelight(){
        driver.findElement(bikeLight).click();
    }

    public void chooseBoltshirt(){
        driver.findElement(boltTshirt).click();
    }

    public void chooseFleecejacket(){
        driver.findElement(fleeceJacket).click();
    }

    public void chooseOnesie(){
        driver.findElement(oneSie).click();
    }

    public void chooseRedshirt(){
        driver.findElement(redTshirt).click();
    }

    public void chooseAnyProduct(){
        List <WebElement> products = driver.findElements(dynamicProduct);

        // for (WebElement product : products){
        //     product.click();
        // }

        int totalProducts = products.size();

        Random rand = new Random();

        int randomProduct = rand.nextInt(totalProducts);

        products.get(randomProduct).click();
    }

    public void clickCart(){
        driver.findElement(openCart).click();
    }
    
}
