package com.google;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestSimple {

    @Test
    public void simpleTest(){
        Assert.assertEquals(5 + 8, 13)
    }
    
    @Test
    public void secondSimpleTest(){
        Assert.assertEquals("5" + "8", "58")
    }
    
    @Test
    public void thirdSimpleTest(){
        Assert.assertEquals(5 + 8, 8 + 5)
    }

  
}
