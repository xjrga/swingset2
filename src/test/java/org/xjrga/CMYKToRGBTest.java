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
    
    @Test
    public void testRgbValues() {
        CMYKToRGB colorValues = new CMYKToRGB(0.0,43.0,63.0,0);
        for (int i = 0; i < 105; i=i+5) {
            double[] rgbValues = colorValues.getRgbValues(0.0, 43.0, 63.0, i);            
            System.out.println(i+":"+rgbValues[0]+","+rgbValues[1]+","+rgbValues[2]);             
        }              
        Assert.assertTrue(false);                
    }
}



//100->0,0,0
//90->10,5.7,3.7->0,43,63,96
//80->20,11.4,7.4->0,43,63,92
//70->30,17,11.1->0,43,63,88
//10->
//5->95,54.2,35.6->0,43,63,5
//1->99,56.4,36.6->0,43,63,1
//0->100,57,37->0,43,63,0
