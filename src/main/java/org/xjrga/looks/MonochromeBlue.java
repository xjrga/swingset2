package org.xjrga.looks;

import java.awt.Color;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

/*
 * Monochrome Blue Theme 
 * @author Jorge R Garcia de Alba     
 */
public class MonochromeBlue extends MetalTheme {

    private final FontUIResource font;
    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;   
    private ColorTones colorTones = null;

    public MonochromeBlue() {
        colorTones = new ColorTones(new Color(173, 202, 216));        
        font = new FontUIResource(TheFonts.getDejaVuSansMono(Float.valueOf(13)));
        primary1 = new ColorUIResource(colorTones.plus10());
        primary2 = new ColorUIResource(colorTones.plus35());
        primary3 = new ColorUIResource(colorTones.plus40());
        secondary3 = new ColorUIResource(colorTones.plus0());
        secondary1 = new ColorUIResource(colorTones.plus0());
        secondary2 = new ColorUIResource(colorTones.plus15());      
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
        //UIManager.put("TabbedPane.selected", colorTones.plus5());
        //UIManager.put("TabbedPane.background", colorTones.plus0());
        //If you enable this it will look a bit better but it affects 
        //other themes
    }

    @Override
    public String getName() {
        return "Monochrome Green";
    }

    @Override
    public ColorUIResource getPrimary1() {
        return primary1;
    }

    @Override
    public ColorUIResource getPrimary2() {
        return primary2;
    }

    @Override
    public ColorUIResource getPrimary3() {
        return primary3;
    }

    @Override
    public ColorUIResource getSecondary1() {
        return secondary1;
    }

    @Override
    public ColorUIResource getSecondary2() {
        return secondary2;
    }

    @Override
    public ColorUIResource getSecondary3() {
        return secondary3;
    }

    @Override
    public FontUIResource getControlTextFont() {
        return font;
    }

    @Override
    public FontUIResource getSystemTextFont() {
        return font;
    }

    @Override
    public FontUIResource getUserTextFont() {
        return font;
    }

    @Override
    public FontUIResource getMenuTextFont() {
        return font;
    }

    @Override
    public FontUIResource getWindowTitleFont() {
        return font;
    }

    @Override
    public FontUIResource getSubTextFont() {
        return font;
    }

}
