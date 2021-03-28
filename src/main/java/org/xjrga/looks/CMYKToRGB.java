package org.xjrga.looks;

/**
 *
 * @author jr
 */
public class CMYKToRGB {

    private final double red;
    private final double green;
    private final double blue;

    public CMYKToRGB(double c, double m, double y, double k) {
        red = 255.0 * (1.0 - c / 100) * (1.0 - k / 100);
        green = 255.0 * (1.0 - m / 100.0) * (1.0 - k / 100.0);
        blue = 255.0 * (1.0 - y / 100.0) * (1.0 - k / 100.0);
        //Values must be in the range 0.0 to 100.0
    }

    public int getRed() {
        return (int) red;
    }

    public int getGreen() {
        return (int) green;
    }

    public int getBlue() {
        return (int) blue;
    }

}
