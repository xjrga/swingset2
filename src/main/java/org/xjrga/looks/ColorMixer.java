/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xjrga.looks;

import java.awt.Color;

/**
 *
 * @author jr
 */
public class ColorMixer {
    
    private final int mixR;
    private final int mixG;
    private final int mixB;
    private final int srcR;
    private final int srcG;
    private final int srcB;
    
    public ColorMixer(Color src, Color mix) {        
        srcR = src.getRed();
        srcG = src.getGreen();
        srcB = src.getBlue();
        mixR = mix.getRed();
        mixG = mix.getGreen();
        mixB = mix.getBlue();        
    }
    
    public Color getColorTone(float mixValue) {
        testMixValueRange(mixValue);
        int r = (int) (srcR * (1.0f - mixValue) + mixR * mixValue);
        int g = (int) (srcG * (1.0f - mixValue) + mixG * mixValue);
        int b = (int) (srcB * (1.0f - mixValue) + mixB * mixValue);  
        //System.out.println("New Color: "+r+","+g+","+b);
        return new Color(r, g, b);
    }

    private static void testMixValueRange(float mixValue) {
        boolean error = false;
        String message = "";

        if (mixValue < 0.0f || mixValue > 1.0f) {
            error = true;
            message = message + " Mix value";
        }

        if (error == true) {
            throw new IllegalArgumentException("Mix value outside of expected range:"
                    + message);
        }
    }    
}
