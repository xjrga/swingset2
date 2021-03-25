
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIDefaults;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.metal.MetalTheme;

public class Arch extends MetalTheme {

    private FontUIResource font;
    private ColorUIResource primary1;
    private ColorUIResource primary2;
    private ColorUIResource primary3;
    private ColorUIResource secondary1;
    private ColorUIResource secondary2;
    private ColorUIResource secondary3;
    public final Color PINK = new Color(0xf8b1d3);
    public final Color ORANGE = new Color(0xd74b28);
    public final Color PURPLE = new Color(0x83534f);
    public final Color WHITE = new Color(0xf0f1eb);
    public final Color BLUE = new Color(0x8894ac);

    /*
     * Arch Theme 
     * @author Jorge R Garcia de Alba     
     */
    public Arch() {
        font = new FontUIResource("Dialog", Font.PLAIN, 13);
        secondary3 = new ColorUIResource(this.WHITE);
        secondary2 = new ColorUIResource(this.WHITE);
        primary1 = new ColorUIResource(this.PURPLE);
        secondary1 = new ColorUIResource(this.PURPLE);
        primary2 = new ColorUIResource(this.PINK);
        primary3 = new ColorUIResource(this.ORANGE);
    }

    @Override
    public void addCustomEntriesToTable(UIDefaults table) {
        super.addCustomEntriesToTable(table);
    }

    @Override
    public String getName() {
        return "Arch";
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
