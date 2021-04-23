package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPage extends BasePage{
    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
    private WebElement dress;

    public void dresses() {
        dress.click();
    }
}
