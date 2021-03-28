package org.xjrga;

import junit.framework.Assert;

import org.junit.Test;
import org.xjrga.looks.CMYKToRGB;


public class CMYKToRGBTest 
{   
    @Test
    public void testRed() {
        CMYKToRGB colorValues = new CMYKToRGB(0.0,43.0,63.0,30.0); 
        Assert.assertEquals(178.5,colorValues.getRed(),1.00);        
    }
    
    @Test
    public void testGreen() {
        CMYKToRGB colorValues = new CMYKToRGB(0.0,43.0,63.0,30.0); 
        Assert.assertEquals(101.7,colorValues.getGreen(),1.00);        
    }
    
    @Test
    public void testBlue() {
        CMYKToRGB colorValues = new CMYKToRGB(0.0,43.0,63.0,30.0);         
        Assert.assertEquals(66.04,colorValues.getBlue(),1.00);                
    }
}
