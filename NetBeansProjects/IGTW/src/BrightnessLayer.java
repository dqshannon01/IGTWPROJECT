import javax.swing.*;
import javax.swing.plaf.LayerUI;
import java.awt.*;

public class BrightnessLayer extends LayerUI<JComponent>
{
    private float brightness = 0f;

    public void setBrightness(float brightness) {
        this.brightness = brightness;
    }

    public float getBrightness() {
        return brightness;
    }

    @Override
    public void paint(Graphics g, JComponent c) {
        super.paint(g, c);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(c.getBackground());
        g2d.setComposite(AlphaComposite.SrcOver.derive(getBrightness()));
        g2d.fillRect(0, 0, c.getWidth(), c.getHeight());
        g2d.dispose();
    }
}
