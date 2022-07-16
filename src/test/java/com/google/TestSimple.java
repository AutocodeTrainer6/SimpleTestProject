package com.google;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestSimple {
    private WebDriver driver;

//     @BeforeTest
//     public void setUp(){
//         WebDriverManager.edgedriver().setup();
//         driver = new EdgeDriver();
//     }

//     @Test
//     public void simpleTest(){
//         driver.navigate().to("https://google.com");
//     }

//     @AfterClass
//     public void tearDown(){
//         driver.close();
//         driver = null;
//     }
}
