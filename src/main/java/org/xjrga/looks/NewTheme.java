package org.xjrga.looks;

import java.awt.Color;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

/*
 * NewTheme Theme 
 * @author Jorge R Garcia de Alba     
 */
public class NewTheme extends MetalTheme {

    private final FontUIResource font;
    private final ColorUIResource primary1;
    private final ColorUIResource primary2;
    private final ColorUIResource primary3;
    private final ColorUIResource secondary1;
    private final ColorUIResource secondary2;
    private final ColorUIResource secondary3;   
    private ColorTones colorTones = null;

    public NewTheme() {
        colorTones = new ColorTones(new Color(179, 143, 88));        
        //font = new FontUIResource(TheFonts..getLiberationMono(Float.valueOf(13)));
        //font = new FontUIResource(TheFonts.getNotoMono(Float.valueOf(13)));
        font = new FontUIResource(TheFonts.getDejaVuSansMono(Float.valueOf(13)));
        //font = new FontUIResource(TheFonts.getFreeMono(Float.valueOf(13)));        
        //font = new FontUIResource(TheFonts.getUbuntuMono(Float.valueOf(13)));
        
        secondary3 = new ColorUIResource(colorTones.plus0());
        //app, menu background, selected tab
        
        primary2 = new ColorUIResource(colorTones.plus35());//
        //internal frame background, component focus
        //menu item background, selected scrollbar knob background, folders line
        //slider ticks, selected tree item outline
        
        secondary2 = new ColorUIResource(colorTones.plus15());
        //unselected tab, iframes side lines,scrollbar outline
        //slider outline and ticks,pressed menuitem,table grid, menubar outline
        //slider disabled ticks, slider internal track, titled border outline,
        //pressed button, selected toolbar button, filechooser file background,
        //disabled text
               
        primary1 = new ColorUIResource(colorTones.plus10());
        //scrollbar knob outline and dots, folder tab, 
        //selected iframe outline and dots, tooltip outline,
        //slider knob dots

        secondary1 = new ColorUIResource(colorTones.plus0());
        //iframe outlines, button outlines, menu outline, menu item checkbox, 
        //textbox outline, component outlines        

        primary3 = new ColorUIResource(colorTones.plus40());
        //selected window, selected menuitem box,
        //selected window top bar, scrollbar knob left outline, tooltip, 
        //selected list item, selected slider knob highlight,
        //table row selection, tree folders and selected tree item    
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
        //UIManager.put("TabbedPane.selected", colorTones.plus10());
        //UIManager.put("TabbedPane.background", colorTones.plus0());
    }

    @Override
    public String getName() {
        return "NewTheme";
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
