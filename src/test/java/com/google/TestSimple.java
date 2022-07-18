package com.google;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSimple {

    @Test
    public void simpleTest(){
        Assert.assertEquals(5 + 8, 13);
    }
    
    @Test
    public void secondSimpleTest(){
        Assert.assertEquals("5" + "8", "13");
    }
    
    @Test
    public void thirdSimpleTest(){
        Assert.assertEquals(5 + 8, 8 + 5);
    }

  
}
