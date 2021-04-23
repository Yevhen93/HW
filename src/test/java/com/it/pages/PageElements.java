package com.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PageElements extends BasePage {

    @FindBy(xpath = "//h4[contains(text(),'Store information')]")
    private WebElement getTitle;

    @FindBy(xpath = "//li/i[@class='icon-map-marker']")
    private WebElement getIcon;

    @FindBy(xpath = "//li/span[contains(text(),'(347) 466-7432')]")
    private WebElement getPhone;

    @FindBy(xpath = "//li/span/a[@href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']")
    private WebElement getMail;

//    @FindBy(xpath = "")
//    private WebElement getEmail;

    public String getTitle() {
       return getTitle.getText();
    }

    public void getIcon() {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li/i[@class='icon-map-marker']"))));
    }

    public void waitFooter() {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h4[contains(text(),'Store information')]"))));
    }

    public String getPhone() {
       return getPhone.getText();
    }

    public void getMail() {
        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li/span/a[@href='mailto:%73%75%70%70%6f%72%74@%73%65%6c%65%6e%69%75%6d%66%72%61%6d%65%77%6f%72%6b.%63%6f%6d']"))));
    }



}
