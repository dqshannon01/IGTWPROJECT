import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLayer;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.LayerUI;

public class Test {

    public static void main(String[] args) {
        new Test();
    }

    public Test() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                TestPane testPane = new TestPane();
                BrightnessLayerUI layerUI = new BrightnessLayerUI();
                JLayer<JComponent> layer = new JLayer<>(testPane, layerUI);

                JSlider slider = new JSlider(0, 100);
                slider.addChangeListener(new ChangeListener() {
                    @Override
                    public void stateChanged(ChangeEvent e) {
                        int value = slider.getValue();
                        float brightness = (100 - value) / 100f;
                        layerUI.setBrightness(brightness);
                        testPane.repaint();
                    }
                });
                slider.setValue(100);

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(layer);
                frame.add(slider, BorderLayout.SOUTH);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        public TestPane() {
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            add(new JTextField(10), gbc);
            add(new JButton("Hello"), gbc);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.dispose();
        }

    }

    public class BrightnessLayerUI extends LayerUI<JComponent> {

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

}