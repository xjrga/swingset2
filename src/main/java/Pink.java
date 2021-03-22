
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

public class Pink extends MetalTheme {

    private FontUIResource font;
    private ColorUIResource primary1;
    private ColorUIResource primary2;
    private ColorUIResource primary3;
    private ColorUIResource secondary1;
    private ColorUIResource secondary2;
    private ColorUIResource secondary3;
    private Color GREEN = new Color(0x5e840a);
    private Color PINK = new Color(0xf9ddd9);
    private Color LIGHTBLUE = new Color(0xb6dada);
    private Color MEDIUMBLUE = new Color(0x65c4ca);
    private Color DARKBLUE = new Color(0x2b7bb8);

    /*
     * Pink Theme 
     * @author Jorge R Garcia de Alba     
     */
    public Pink() {
        font = new FontUIResource("Dialog", Font.PLAIN, 13);        
        secondary3 = new ColorUIResource(this.PINK);        
        secondary2 = new ColorUIResource(this.PINK);        
        secondary1 = new ColorUIResource(this.PINK);        
        primary3 = new ColorUIResource(this.MEDIUMBLUE);       
        primary1 = new ColorUIResource(this.GREEN);
        primary2 = new ColorUIResource(this.LIGHTBLUE);
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
    }

    @Override
    public String getName() {
        return "Pink";
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
