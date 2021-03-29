package org.xjrga;

import java.awt.Color;
import junit.framework.Assert;
import org.junit.Test;
import org.xjrga.looks.ColorMixer;
import org.xjrga.looks.ColorTones;

public class ColorTonesTest {

    @Test
    public void testGetTones() {
        ColorTones colorTones = new ColorTones(new Color(0, 0, 0));
        StringBuilder sb = new StringBuilder();
        sb.append("c00:");
        sb.append(colorTones.get00().getRed());
        sb.append(",");
        sb.append(colorTones.get00().getGreen());
        sb.append(",");
        sb.append(colorTones.get00().getBlue());
        sb.append("\n");
        sb.append("c05:");
        sb.append(colorTones.get05().getRed());
        sb.append(",");
        sb.append(colorTones.get05().getGreen());
        sb.append(",");
        sb.append(colorTones.get05().getBlue());
        sb.append("\n");
        sb.append("c10:");
        sb.append(colorTones.get10().getRed());
        sb.append(",");
        sb.append(colorTones.get10().getGreen());
        sb.append(",");
        sb.append(colorTones.get10().getBlue());
        sb.append("\n");
        sb.append("c15:");
        sb.append(colorTones.get15().getRed());
        sb.append(",");
        sb.append(colorTones.get15().getGreen());
        sb.append(",");
        sb.append(colorTones.get15().getBlue());
        sb.append("\n");
        sb.append("c20:");
        sb.append(colorTones.get20().getRed());
        sb.append(",");
        sb.append(colorTones.get20().getGreen());
        sb.append(",");
        sb.append(colorTones.get20().getBlue());
        sb.append("\n");
        Assert.assertEquals(
                  "c00:0,0,0\n"
                + "c05:12,12,12\n"
                + "c10:25,25,25\n"
                + "c15:38,38,38\n"
                + "c20:51,51,51\n", sb.toString());
    }
}
