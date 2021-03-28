package org.xjrga;

import junit.framework.Assert;

import org.junit.Test;
import org.xjrga.looks.MyColor;


public class ColorTest 
{   
    @Test
    public void testRed() {
        MyColor color = new MyColor(37,52,4);
        Assert.assertEquals(37, color.getRed());
        
    }
    
    @Test
    public void testGreen() {
        MyColor color = new MyColor(37,52,4);
        Assert.assertEquals(52, color.getGreen());
    }
    
    @Test
    public void testBlue() {
        MyColor color = new MyColor(37,52,4);
        Assert.assertEquals(4, color.getBlue());
    }
}
