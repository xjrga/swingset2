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

    public double[] getRgbValues(double cyan, double magenta, double yellow, double black) {

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
