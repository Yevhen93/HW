package com.it.tests;

import com.it.pages.PageElements;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest2 extends BaseTest{
    @Test
    public void test()  {
        app.pageElements.waitFooter();
        app.pageElements.getTitle();
        PageElements pageElements = new PageElements();
        Assert.assertEquals(pageElements.getTitle(),"Store information");
        System.out.println(pageElements.getTitle());

        app.pageElements.getIcon();

        app.pageElements.getPhone();
        PageElements phone = new PageElements();
        Assert.assertEquals(phone.getPhone(),"(347) 466-7432");
        System.out.println(phone.getPhone());

        app.pageElements.getMail();


    }
}
