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

    private final ColorMixer colorMixer;
    private final Color c00;
    private final Color c05;
    private final Color c10;
    private final Color c15;
    private final Color c20;
    private final Color c25;
    private final Color c30;
    private final Color c35;
    private final Color c40;
    private final Color c45;
    private final Color c50;
    private final Color c55;
    private final Color c60;
    private final Color c65;
    private final Color c70;
    private final Color c75;
    private final Color c80;
    private final Color c85;
    private final Color c90;
    private final Color c95;
    private final Color c100;

    public ColorTones(Color color) {
        colorMixer = new ColorMixer(color, new Color(255, 255, 255));
        c00 = colorMixer.getColorTone(0.0f);
        c05 = colorMixer.getColorTone(0.05f);
        c10 = colorMixer.getColorTone(0.10f);
        c15 = colorMixer.getColorTone(0.15f);
        c20 = colorMixer.getColorTone(0.20f);
        c25 = colorMixer.getColorTone(0.25f);
        c30 = colorMixer.getColorTone(0.30f);
        c35 = colorMixer.getColorTone(0.35f);
        c40 = colorMixer.getColorTone(0.40f);
        c45 = colorMixer.getColorTone(0.45f);
        c50 = colorMixer.getColorTone(0.50f);
        c55 = colorMixer.getColorTone(0.55f);
        c60 = colorMixer.getColorTone(0.60f);
        c65 = colorMixer.getColorTone(0.65f);
        c70 = colorMixer.getColorTone(0.70f);
        c75 = colorMixer.getColorTone(0.75f);
        c80 = colorMixer.getColorTone(0.80f);
        c85 = colorMixer.getColorTone(0.85f);
        c90 = colorMixer.getColorTone(0.90f);
        c95 = colorMixer.getColorTone(0.95f);
        c100 = colorMixer.getColorTone(1.0f);
    }

    public Color plus0() {
        return c00;
    }

    public Color plus5() {
        return c05;
    }

    public Color plus10() {
        return c10;
    }

    public Color plus15() {
        return c15;
    }

    public Color plus20() {
        return c20;
    }

    public Color plus25() {
        return c25;
    }

    public Color plus30() {
        return c30;
    }

    public Color plus35() {
        return c35;
    }

    public Color plus40() {
        return c40;
    }

    public Color plus45() {
        return c45;
    }

    public Color plus50() {
        return c50;
    }

    public Color plus55() {
        return c55;
    }

    public Color plus60() {
        return c60;
    }

    public Color plus65() {
        return c65;
    }

    public Color plus70() {
        return c70;
    }

    public Color plus75() {
        return c75;
    }

    public Color plus80() {
        return c80;
    }

    public Color plus85() {
        return c85;
    }

    public Color plus90() {
        return c90;
    }

    public Color plus95() {
        return c95;
    }

    public Color plus100() {
        return c100;
    }    
}
