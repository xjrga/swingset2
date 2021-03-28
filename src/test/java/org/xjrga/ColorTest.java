package org.xjrga;

import java.awt.Color;
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
    
    @Test
    public void testBrighterColor() {
        //5e850a -> 85bd0d
        MyColor color = new MyColor(37,52,4);                
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {            
            sb.append(color.brighter().getRed());
            sb.append(",");
            sb.append(color.brighter().getGreen());
            sb.append(",");
            sb.append(color.brighter().getBlue());
            sb.append("\n");            
        }
        System.out.println(sb.toString());
        
        //Assert.assertEquals(37, brighterColor.getRed());
        Assert.assertFalse(true);        
        
    }
}
