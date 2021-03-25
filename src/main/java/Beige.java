
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

public class Beige extends MetalTheme {

    private FontUIResource font;
    private ColorUIResource primary1;
    private ColorUIResource primary2;
    private ColorUIResource primary3;
    private ColorUIResource secondary1;
    private ColorUIResource secondary2;
    private ColorUIResource secondary3;
    public final Color A = new Color(0xac5c2c);
    public final Color B = new Color(0xc8a353);
    public final Color C = new Color(0x281924);
    public final Color D = new Color(0x897846);
    public final Color E = new Color(0x9ba068);
    public final Color F = new Color(0xe0d5c1);
    
    /*
     * Beige Theme 
     * @author Jorge R Garcia de Alba     
     */
    public Beige() {
        font = new FontUIResource("Dialog", Font.PLAIN, 13);        
        secondary3 = new ColorUIResource(this.F);
        secondary2 = new ColorUIResource(this.F);
        primary1 = new ColorUIResource(this.C);                
        secondary1 = new ColorUIResource(this.C);        
        primary2 = new ColorUIResource(this.B);
        primary3 = new ColorUIResource(this.E);               
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
    }

    @Override
    public String getName() {
        return "Beige";
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
