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
public class ColorTones {

    private ColorMixer colorMixer;
    
    public ColorTones(Color color) {
        colorMixer = new ColorMixer(color, new Color(255, 255, 255));    
    }
    
    public Color get00() {
        return getColorTone(0.0f);
    }

    public Color get05() {
        return getColorTone(0.5f);
    }

    public Color get10() {
        return getColorTone(0.10f);
    }

    public Color get15() {
        return getColorTone(0.15f);
    }

    public Color get20() {
        return getColorTone(0.20f);
    }

    public Color get25() {
        return getColorTone(0.25f);
    }

    public Color get30() {
        return getColorTone(0.30f);
    }

    public Color get35() {
        return getColorTone(0.35f);
    }

    public Color get40() {
        return getColorTone(0.40f);
    }

    public Color get45() {
        return getColorTone(0.45f);
    }

    public Color get50() {
        return getColorTone(0.50f);
    }

    public Color get55() {
        return getColorTone(0.55f);
    }

    public Color get60() {
        return getColorTone(0.60f);
    }

    public Color get65() {
        return getColorTone(0.65f);
    }

    public Color get70() {
        return getColorTone(0.70f);
    }

    public Color get75() {
        return getColorTone(0.75f);
    }

    public Color get80() {
        return getColorTone(0.80f);
    }

    public Color get85() {
        return getColorTone(0.85f);
    }

    public Color get90() {
        return getColorTone(0.90f);
    }

    public Color get95() {
        return getColorTone(0.95f);
    }

    public Color get100() {
        return getColorTone(1.0f);
    }

    private Color getColorTone(float mixValue) {           
        return colorMixer.getColorTone(mixValue);
    }
}
