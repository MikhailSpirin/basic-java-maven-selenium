package com.spirinmikhail;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



import static org.junit.Assert.assertTrue;

/**
 * Created by mikhails on 03.12.2015
 */
public class FirstTest {

    @Test
    public void driverIsTheKing()
    {
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://www.wix.com");

        assertTrue(driver.getTitle().startsWith("Free"));

    }



}
