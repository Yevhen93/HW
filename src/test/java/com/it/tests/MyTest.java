package com.it.tests;

import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test() {
        app.tShirts.tShirts();
        app.tShirts.waitTShirt();
        app.tShirts.getTShirt();
        app.tShirts.waitAddToCart();
        app.tShirts.addToCart();
        //       app.dresses.dresses();

//        Thread.sleep(2000);

    }
}
