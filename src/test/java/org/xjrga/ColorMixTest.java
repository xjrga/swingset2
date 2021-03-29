package org.xjrga;

import java.awt.Color;
import junit.framework.Assert;
import org.junit.Test;
import org.xjrga.looks.ColorMixer;

public class ColorMixTest {

    @Test
    public void testRgbValues() {
        ColorMixer colorMixer = new ColorMixer(new Color(0, 0, 0), new Color(255, 255, 255));
        Color newColor = colorMixer.getColorTone(0.0f);
        StringBuilder sb = new StringBuilder();
        sb.append(newColor.getRed());
        sb.append(",");
        sb.append(newColor.getGreen());
        sb.append(",");
        sb.append(newColor.getBlue());
        Assert.assertEquals("0,0,0", sb.toString());
    }
}
