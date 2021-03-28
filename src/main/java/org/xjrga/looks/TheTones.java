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
public class TheTones {

    private final double c;
    private final double m;
    private final double y;       

    public TheTones(double c, double m, double y) {
        this.c = c;
        this.m = m;
        this.y = y;              
    }

    public Color get00() {        
        return getColorTone(0);
    }

    public Color get05() {
        return getColorTone(5);
    }

    public Color get10() {
        return getColorTone(10);
    }
       
    public Color get15() {
        return getColorTone(15);
    }

    public Color get20() {
        return getColorTone(20);
    }

    public Color get25() {
        return getColorTone(25);
    }

    public Color get30() {
        return getColorTone(30);
    }

    public Color get35() {
        return getColorTone(35);
    }

   public Color get40() {        
        return getColorTone(40);
    }

    public Color get45() {
        return getColorTone(45);
    }

    public Color get50() {
        return getColorTone(50);
    }

    public Color get55() {
        return getColorTone(55);
    }

    public Color get60() {
        return getColorTone(60);
    }

    public Color get65() {
        return getColorTone(65);
    }

    public Color get70() {
        return getColorTone(70);
    }

    public Color get75() {
        return getColorTone(75);
    }

    public Color get80() {
        return getColorTone(80);
    }

    public Color get85() {
        return getColorTone(85);
    }

    public Color get90() {
        return getColorTone(90);
    }

    public Color get95() {
        return getColorTone(95);
    }

    public Color get100() {
        return getColorTone(100);
    }

    private Color getColorTone(double k) {
        CMYKToRGB color = new CMYKToRGB(c, m, y, k);
        return new Color(color.getRed(), color.getGreen(), color.getBlue());
    }
}
