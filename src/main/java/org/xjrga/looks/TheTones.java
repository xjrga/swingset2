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
    private double[] rgb;

    public TheTones(double cyan, double magenta, double yellow) {
        this.c = cyan;
        this.m = magenta;
        this.y = yellow;
        rgb = new double[3];
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
        rgb = this.getRgbValues(c, m, y, k);
        return new Color((int) rgb[0], (int) rgb[1], (int) rgb[2]);
    }

    private double[] getRgbValues(double cyan, double magenta, double yellow, double black) {

        double c;
        double m;
        double y;
        double k;
        double r;
        double g;
        double b;
        double[] rgb = new double[3];

        c = (double) cyan / 100.0;
        m = (double) magenta / 100.0;
        y = (double) yellow / 100.0;
        k = (double) black / 100.0;

        if (k < 1.0) {
            c = c * (1.0 - k) + k;
            m = m * (1.0 - k) + k;
            y = y * (1.0 - k) + k;
        } else {
            c = 1.0;
            m = 1.0;
            y = 1.0;
        }

        r = 1.0 - c;
        g = 1.0 - m;
        b = 1.0 - y;

        rgb[0] = Math.round(r * 100.0 * 10.0) / 10.0;
        rgb[1] = Math.round(g * 100.0 * 10.0) / 10.0;
        rgb[2] = Math.round(b * 100.0 * 10.0) / 10.0;

        return rgb;
    }
}
