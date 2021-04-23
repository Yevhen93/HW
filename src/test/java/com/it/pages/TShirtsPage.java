package com.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TShirtsPage extends BasePage{
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    private WebElement tShirts;


	@FindBy(xpath="//div[@class='product-container']/div/div/a[@class='product_img_link']/img[@class='replace-2x img-responsive']")
	private WebElement getTShirt;

    @FindBy(xpath="//p[@id='add_to_cart']//span[text()='Add to cart']")
    private WebElement addToCart;


    public void tShirts() {
        tShirts.click();
    }

    public void getTShirt() {
        getTShirt.click();
    }

    public void addToCart() {
        addToCart.click();
    }


    public void waitTShirt() {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='product-container']/div/div/a[@class='product_img_link']/img[@class='replace-2x img-responsive']"))));
    }


    public void waitAddToCart() {
        WebElement element1 = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='add_to_cart']//span[text()='Add to cart']"))));
    }

}
