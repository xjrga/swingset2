package org.xjrga;

import java.awt.Color;
import junit.framework.Assert;
import org.junit.Test;
import org.xjrga.looks.ColorTones;

public class ColorTonesTest {

    @Test
    public void testGetTones() {
        ColorTones colorTones = new ColorTones(new Color(0, 0, 0));
        StringBuilder sb = new StringBuilder();
        sb.append("c00:");
        sb.append(colorTones.plus0().getRed());
        sb.append(",");
        sb.append(colorTones.plus0().getGreen());
        sb.append(",");
        sb.append(colorTones.plus0().getBlue());
        sb.append("\n");
        sb.append("c05:");
        sb.append(colorTones.plus5().getRed());
        sb.append(",");
        sb.append(colorTones.plus5().getGreen());
        sb.append(",");
        sb.append(colorTones.plus5().getBlue());
        sb.append("\n");
        sb.append("c10:");
        sb.append(colorTones.plus10().getRed());
        sb.append(",");
        sb.append(colorTones.plus10().getGreen());
        sb.append(",");
        sb.append(colorTones.plus10().getBlue());
        sb.append("\n");
        sb.append("c15:");
        sb.append(colorTones.plus15().getRed());
        sb.append(",");
        sb.append(colorTones.plus15().getGreen());
        sb.append(",");
        sb.append(colorTones.plus15().getBlue());
        sb.append("\n");
        sb.append("c20:");
        sb.append(colorTones.plus20().getRed());
        sb.append(",");
        sb.append(colorTones.plus20().getGreen());
        sb.append(",");
        sb.append(colorTones.plus20().getBlue());
        sb.append("\n");
        Assert.assertEquals(
                  "c00:0,0,0\n"
                + "c05:12,12,12\n"
                + "c10:25,25,25\n"
                + "c15:38,38,38\n"
                + "c20:51,51,51\n", sb.toString());
    }
}
