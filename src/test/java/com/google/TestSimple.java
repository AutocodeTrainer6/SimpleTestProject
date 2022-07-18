package com.google;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSimple {

    @Test
    public void simpleTest(){
        Assert.assertEquals(5 + 8, 13);
    }

  
}
