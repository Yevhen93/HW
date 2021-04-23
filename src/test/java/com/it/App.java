package com.it;

import com.it.helpers.CommonHelper;
import com.it.helpers.DressesHelper;
import com.it.helpers.PageElementsHelper;
import com.it.helpers.TShirtsHelper;

public class App {
    public CommonHelper common;
    public DressesHelper dresses;
    public TShirtsHelper tShirts;
    public PageElementsHelper pageElements;

    public App() {
        this.common = new CommonHelper();
        this.dresses = new DressesHelper();
        this.tShirts = new TShirtsHelper();
        this.pageElements = new PageElementsHelper();
    }
}
